package Day_20_Echo;

// 객체 직렬화를 위해 설계한 Customer.java 를 활용해서 객체단위로 기록해본다.

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Customer_IoEx10 {
    public static void main(String[] args) {

        Customer cus = new Customer(7, "홍길동", 23, 177.7); // 오버로딩된 생성자 호출 멤버변수 초기화

        try{
            System.out.println(cus.toString());
            FileOutputStream fos = new FileOutputStream("./src/output.txt");
            // 생성자 인자값으로 주어진 파일경로의 파일에 바이트 단위로 기록하기 위한 fos 객체 생성
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cus);

            oos.close(); fos.close();
        }catch (IOException ie){ie.printStackTrace();}
    }
}
