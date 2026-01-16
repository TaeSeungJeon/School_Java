package Day_20;

import java.io.*;

public class IoEx09 {
    public static void main(String[] args) {

        String fileName;
        String buf;

        Reader myIn = new InputStreamReader(System.in); // 업캐스팅
        /* 1. System.in은 키보드 입력장치와 연결
           2. InputStreamReader는 읽어들인 바이트를 문자로 변환
           3. Reader는 문자 입력스트림의 최상위 추상클래스
        */
        BufferedReader keyBr = new BufferedReader(myIn);

        try {
            System.out.println("파일명 입력(./src/Day_20/IoEx09.java");
            fileName = keyBr.readLine();

            FileReader fr = new FileReader(fileName);
            BufferedReader fileBr = new BufferedReader(fr);

            while ((buf = fileBr.readLine()) != null) {
                System.out.println(buf);
            }

        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            try {
                if (keyBr != null) keyBr.close();
                if (myIn != null) myIn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

