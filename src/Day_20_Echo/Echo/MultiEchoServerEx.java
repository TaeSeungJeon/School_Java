package Day_20_Echo.Echo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/* 다중 사용자 접속을 네트워크 채팅서버 프로그램에서 받기위해서는 멀티스레드 기능이 적용돼야 한다.
   그러므로 멀티스테드 기능이 적용돼서 다중 사용자 접속을 받을 수 있는 네트워크 채팅서버 프로그램이다.
*/
public class MultiEchoServerEx {
    ServerSocket server;            // 서버상에서만 필요하고 사용자 접속을 기다리기 위해서 필요한 클래스
    static final int PORT = 7000;   // 서버상에서 TCP 포트번호를 지정. 정적 상수명은 관례적으로 대문자로하고 선언과 동시에 초기화해야함.
    Socket child;                   // 클라이언트와 통신하기위해 필요한 소켓

    public MultiEchoServerEx() {
        try {
            server = new ServerSocket(PORT);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println("####### 다중 사용자 접속을 기다리기 위한 멀티채팅 네트워크 서버 ######");
        System.out.println("멀티채팅서버는 사용자 접속을 항상 기다리고 있습니다.");

        while (true) {
            try {
                child = server.accept();    // 클라이언트 접속이 이루어지면 서버에서도 소켓 생성 (동시에 사용자쪽에서도 소켓 생성되는 시점)

                EchoServerThread childThread = new EchoServerThread(child);
                Thread th = new Thread(childThread);
                th.start();     // 멀티스레드 시작

            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
        public static void main (String[]args){
            new MultiEchoServerEx();    // 기본 생성자 호
        }
    }

    // 멀티스레드 -> 네트워크 채팅서버에서 다중 사용자 동시 접속을 받기 위해서 필요하다. 스레드에서 서버상에서 생성된 소켓을 관리한다.
    class EchoServerThread implements Runnable {
        Socket child; // 클라이언트와 통신하기위한 소켓

        InputStream is;
        ObjectInputStream ois;  // 입력스트림

        OutputStream os;
        ObjectOutputStream oos; // 출력스트림

        String receiveData; // 사용자로 부터 전송받은 데이터를 저장할 변수

        public EchoServerThread(Socket child) {
            this.child = child;

            try {
                System.out.println(child.getInetAddress() + "로 부터 연결 요청받음.");

                is = child.getInputStream();
                ois = new ObjectInputStream(is);

                os = child.getOutputStream();
                oos = new ObjectOutputStream(os);

            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                while (true) {
                    receiveData = (String) ois.readObject();
                    System.out.println(child.getInetAddress() + "로 부터 받은 메시지 : " + receiveData);
                    oos.writeObject(receiveData);
                    oos.flush();
                }
            } catch (Exception e) {
                System.out.println("사용자 강제 종료.");
            } finally {
                try {
                    if (oos != null) oos.close();
                    if (os != null) os.close();
                    if (ois != null) ois.close();
                    if (is != null) is.close();
                    if (child != null) child.close();
                } catch (IOException ie) {
                    ie.printStackTrace();
                }
            }
        }
    }

