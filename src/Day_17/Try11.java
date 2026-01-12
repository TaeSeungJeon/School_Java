package Day_17;
/* 예외가 발생했을 때 try ~ catch 블록문 실행순서 : 1 -> 2 -> 4 -> 5 */
public class Try11 {
    static void main(String[] args) {

        System.out.println(1);

        try {
            System.out.println(2);
            System.out.println(100/0); // 자바 언어에서 정수숫자를 0 으로 나누면 예외에러 발생,
            //아래문장 수행않고 해당 catch 블록문으로 제어 순서가 이동해서 예외 처리
            System.out.println(3);
        }catch (Exception e) {
            System.out.println(4); // 예외 발생시 실행
        }
            System.out.println(5);
    }
}
