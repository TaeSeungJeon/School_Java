package Day_20_Echo;

import java.io.*;
import java.util.Scanner;

// java.ro 입출력 패키지의 API를 활용한 이미지 복사 예제
public class IoEx07_Copy {
    static void main(String[] args) throws IOException {

        System.out.println("컬러 이미지까지 그대로 복사하는 예제)");

        Scanner scan = new Scanner(System.in);

        System.out.print("원본 이미지 파일명(./src/Day_20/Images/pch.jpg):");
        String inputFileName = scan.nextLine();

        System.out.println("복사 되어질 이미지 파일명(./src/Day_20/Images/pch_copy.jpg):");
        String outputFileName = scan.nextLine();

        try (InputStream inputStream = new FileInputStream(inputFileName);
             OutputStream outputStream = new FileOutputStream(outputFileName)) {
            // AutoCloseable 인터페이스를 구현 상속받은 자손은 try()내에서 객체 생성하면 finally{}에서 명시적 코드로 close() 하지않아도 자동으로 닫힘.
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data); // 파일에 기록(복사)
            }
        }

        System.out.println(inputFileName + "을(를) " + outputFileName + "으로 이미지를 복사함");
    }
}
