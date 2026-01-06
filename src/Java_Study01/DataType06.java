package Java_Study01;
// switch ~ case
// case    : 정수식과 값이 일치하면 실행 ; break;
// default : 해당사항 없을 때 실행;


import java.util.Scanner;

public class DataType06 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 숫자 나이(0~100)만 입력: ");
        int age = Integer.parseInt(scanner.nextLine()); // 나이를 문자열로 읽어들여서 정수로 변경 parseInt때문

        if(!(age >= 0 && age <=100)){
            System.out.println(" 나이는 0부터 100세 사이만 입력하세요.");
        }else{
            System.out.println("입력하신 " + age + "세는 ");
            age = age / 10;
            switch (age) {
                case 10: System.out.println("100대 입니다."); break;
                case 9: System.out.println("90대 입니다"); break;
                case 8: System.out.println("80대 입니다"); break;
                case 7: System.out.println("70대 입니다"); break;
                case 6: System.out.println("60대 입니다"); break;
                case 5: System.out.println("50대 입니다"); break;
                default: System.out.println("0세 이상 49세 이하 입니다.");  //break;
            }
        }
    }
}
