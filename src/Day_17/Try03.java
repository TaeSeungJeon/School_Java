package Day_17;
/*
    try ~ catch 문에서 예외가 발생하든 발생하지않든 무조건 마지막에 실행 해야하는 문장을 넣을때는 finally{} 블록에 기술
 */
public class Try03 {
    static void main(String[] args) {

        int a = 10, b01 = 0, b02 = 2, result = 0;

        try {
            result = a / b02;
            System.out.println(result);

            result = a / b01;
            System.out.println(result);

        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } catch (Exception e) {
            System.out.println("예외발생: " + e);
        }finally{
            System.out.println("예외 무시 무조건 실행");
        }
    }
}
