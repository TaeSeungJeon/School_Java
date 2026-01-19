package Day_20_Echo;

// java.io 입출력 패키지의 FileInputStream 클래스 특징)
//  생성자 인자값으로 주어진 파일 객체나 주어진 파일 경로의 파일로부터 바이트 단위로 데이터를 읽어오기 위한 API 이다.

import java.io.FileInputStream;
import java.io.IOException;

public class IoEx05 {
    public static void main(String[] args) {

        int data = 0;   // 파일로부터 읽어들인 데이터를 저장할 변수
        String path = "./src/Day_20/IoEx05.java";

        try{
            FileInputStream fis = new FileInputStream(path);
            while ((data = fis.read()) != -1) {
                System.out.write((char)data);
            }

        }catch(IOException ie) {ie.printStackTrace();}
    }
}
