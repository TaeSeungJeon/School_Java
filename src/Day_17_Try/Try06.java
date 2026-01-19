package Day_17_Try;
// 1.throw : 인위적 예외를 발생시킬 때 사용한다.
//   형식) throw new 예외 클래스 생성자;
// 2. throws : 발생한 예외를 자신이 직접 처리하는 것이 아니라 자신을 호출한 곳으로 떠넘기면서 예외 처리
//   형식) public 리턴타입 메서드명(매개변수 ...)
//   throws 예외처리 클래스{
//   실행문장;
//   }
public class Try06 {
    static void exp(int data) throws NullPointerException{
        if (data == 0) {
            throw new NullPointerException();
        }
    }

    static void main(String[] args) {

        try {
            System.out.println("예외 발생하기 전");
            exp(0);
            System.out.println("예외 발생 후");
        } catch (NullPointerException ne) {
            ne.printStackTrace();
        }
    }
}
