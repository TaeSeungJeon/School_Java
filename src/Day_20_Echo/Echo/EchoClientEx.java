package Day_20_Echo.Echo;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/* 멀티 스레드 기능이 없는 네트워크 클라이언트 프로그램 */
public class EchoClientEx {
    Socket client = null;   //서버와 통신하기 위해서 필요한 사용자 소켓
    String ip = null;       // 서버 ip 주소를 저장할 변수
    static final int PORT = 7000;   // 서버와 통신하기 위한 포트번호

    Scanner scan = null;
    InputStream is = null;
    ObjectInputStream ois = null;   // 입력 스트림

    OutputStream os = null;
    ObjectOutputStream oos = null;  // 출력 스트림

    String sendData;        // 서버로 보낼 메시지 저장할 변수
    String receiveData;     // 서버에서 받은 메시지를 저장할 변수

    public EchoClientEx(String ip) {
        this.ip = ip;
        try {
            System.out.println("###### 사용자 채팅 프로그램 #######");
            client = new Socket(ip, PORT); // 소켓 생성자 인자값으로 서버 IP 주소와 포트번호를 전달 하면서 사용자 소켓 생성
                                                // -> 이 시점에서 서버와 접속이 이루어 지는 경우이다.
            scan = new Scanner(System.in);

            os = client.getOutputStream();
            oos = new ObjectOutputStream(os);

            is = client.getInputStream();
            ois = new ObjectInputStream(is);

            System.out.print("입력>> ");

            while ((sendData = scan.nextLine()) != null) {
                oos.writeObject(sendData);      // 서버로 전송
                oos.flush();                        // 출력스트림 비움

                if (sendData.equals("exit")) {      // 문자열 내용이 exit과 같다면
                    break;                          // 반복문 종료
                }
                receiveData = (String) ois.readObject();
                System.out.println(client.getInetAddress()+ "로 부터 전송받은 메세지: " + receiveData);
                System.out.print("입력>> ");

            }
        } catch (Exception e) {
            System.exit(0);
        }finally {
            try {
                if(ois != null) ois.close();
                if(is != null) is.close();
                if(oos != null) oos.close();
                if(os != null) os.close();
                if(client != null) client.close();
            }catch (Exception e) {e.printStackTrace();}
        }
    }

    public static void main(String[] args) {

        new EchoClientEx("192.168.145.6");
                /* 생성자 인자값으로 서버 ip주소가 들어간다. localhost는 모든 자신 컴퓨터를 의미하는 호스트이름이다.
                   127.0.0.1은 모든 내 자신 컴퓨터를 의미하는 ip주소이다. 결국 자신 컴퓨터가 채팅서버이고, 클라이언트가 되는 것 이다.
                   문제) 중간 프로젝트 각 팀조변 1조, 2조 팀장, 부팀장, 팀원이 각각 채팅서버가 되어서 각 팀원이 클라이언트가 되어서
                         다중 사용자 접속이 이루어지는 개발자 테스트를 해본다. 그리고 에러가 발생하면 스스로 디버깅해서 완성한다.   */

    }
}
