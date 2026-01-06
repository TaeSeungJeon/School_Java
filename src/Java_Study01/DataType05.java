package Java_Study01;
/* if 조건문 형식)
        if(조건문){
        조건식이 참이면 실행;
        }
 */
public class DataType05 {
    static void main(String[] args) {

        int age = 19;
        if(age >= 10 && age <=19){
            System.out.println(age + "는 10대이다.");
        }
        if(age > 0){
            System.out.println(age + "는 양수이다.");     //참이면 실행
        }else {
            System.out.println(age + "는 양수가 아니다."); // 거짓이면 실행
        }
        age = 18;
        if (age < 20) {
            System.out.println(age + " 미성년 입니다.");
        } else if (age >= 20 && age <= 120) {
            System.out.println(age + " 성인입니다.");
        } else {
            System.out.println("잘못 된 값입니다.");
        }
    }
}
