package Day_20;

// 객체 직렬화를 위해서 설계한 Customer.java를 활용해서 객체단위로 읽어오기

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Customer_IoEx11 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("./src/output.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Customer cus = (Customer) ois.readObject(); // 객체단위로 읽어오기
            System.out.println("ID \t name \t age \t height");
            System.out.println("================================");
            System.out.println(cus);

        }catch(ClassNotFoundException ce){
            ce.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }
    }
}
