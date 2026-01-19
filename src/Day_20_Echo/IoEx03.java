package Day_20_Echo;

import java.io.InputStream;
import java.io.OutputStream;

// java.io 입출력 패키지의 API인 InputStream, OutputStream 을 활용해서 입력받은 문자가
// 단일 소문자 'x'이거나 단일 대문자 'X'이면 while 반복문을 중단한다.
public class IoEx03 {
    static void main(String[] args) {

        int data = 0;
        InputStream myIn = System.in;
        OutputStream myOut = System.out;

        System.out.print("도시이름 입력: ");

        try{
            while ((data = myIn.read()) != -1) {
                if(data == 'x' || data == 'X'){
                    break;
                }
                myOut.write((char)data);
            }

        }catch (Exception e) {e.printStackTrace();}
    }
}
