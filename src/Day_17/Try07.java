package Day_17;
// 사용자 정의 예외 클래스를 생성해서 유효성 검증 메시지를 만든다 -> 비권장

class UserException extends Exception{ // 예외처리 부모클래스 상속

    public UserException(String message) {
        super(message); // 부모의 오버로딩 된 생성자를 호출하면서 유효성 검증 메시지 생성
    }
}

public class Try07 {
    static void main(String[] args) {

        try {
            int a = -11;

            if (a < 0) {
                throw new UserException("양수가 아닙니다.");
            }
        }catch(UserException e){
                System.out.println(e.getMessage());
            }
        }
    }

