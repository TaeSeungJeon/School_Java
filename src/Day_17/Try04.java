package Day_17;
/*
    참조변수만 선언하고 null이 대입된 상태에서 해당 클래스의 소속 멤버변수등에 접근하면 완전한 객체주소가 저장이
    안된 상태이기 때문에 NullPointException 예외 오류를 발생시킨다.
 */

class Board{
    String title = "글 제목";
    String content = "글 내용";
}

public class Try04 {
    static void main(String[] args) {

        Board b = null;

        try {
            System.out.println("제목: " + b + ", 내용: " + b.content);
        } catch (Exception e) {
            System.out.println(e);

            b = new Board();
            System.out.println("제목: " + b + ", 내용: " + b.content);
        }
    }
}
