package Day_20_Echo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
   www.nate.com 이라는 도메인을 가진 웹사이트 주소를 입력하면 이 주소에 대한 서버 ip 주소를 알아내는 소스)
*/
public class NetWorkEx {
    public static void main(String[] args) throws Exception{

        BufferedReader reader;
        String url = null;
        InetAddress addr = null;

        reader = new BufferedReader(new InputStreamReader(System.in));
        /* 1. System.in은 키보드 입력장치와 연결됨
           2. InputStreamReader는 읽어들인 바이트 스트림 문자스트림으로 변경
           3. BufferedReader는 읽어들인 문자를 임시메모리에 버퍼링 (임시저장)해서 한꺼번에 한줄 끝까지 문자열로 통채로 읽어들임.
              그만큼 효율적으로 읽어들인다.
        */
        System.out.print("웹 사이트 주소를 입력(www.nate.com): ");
        url = reader.readLine();    //한줄 끝까지 문자열로 읽어들임

        try{
            addr = InetAddress.getByName(url);
        }catch(UnknownHostException ue ) {ue. printStackTrace();}
        System.out.println("\n========================\n");

        System.out.println(url + "에 대한 서버 ip주소 반환 : " + addr.getHostAddress());
    }
}
