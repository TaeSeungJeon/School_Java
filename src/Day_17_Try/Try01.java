package Day_17_Try;
/*
    try ~ catch 문으로 예외 처리)
    try {
        정상 구문이 실행되다가 예외가 발생하면 아래 문장을 수행하지 않고 예외처리
        해당 catch블록문으로 이동해서 예외처리함.
        ...
        } catch (예외처리클래스 매개변수){
        예외처리 코드;
        }

        자바는 정수숫자를 0 으로 나누면 예외가 발생한다.
 */
public class Try01 {
    static void main(String[] args) {

        int a = 10, b01 = 0, b02 = 2, result = 0;

        try {
            result = a / b02;
            System.out.println("result = " + result);

            result = a / b01;   // 예외 에러 발생 -> 아래문장 수행하지않고 해당 catch 블록문으로 제어 순서가 이동해서 예외를 처리
            System.out.println("result = " + result);

        } catch (Exception e) {
            System.out.println("예외 발생: " + e);  // java.lang.ArithmeticException: /by zero;
                                                   // 예외 에러가 정수숫자를 0으로 나누면 발생하는 에외 에러
        }
        System.out.println("try 구문 수행 후 result= " + result);
    }
}
