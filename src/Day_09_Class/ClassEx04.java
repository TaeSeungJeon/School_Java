package Day_09_Class;

// 생성자의 특징)
// 생성자도 메서드의 일종이기 때문에 오버로딩이 가능하다.

class Member04{
    private String mem_id;
    private String mem_name;
    private String mem_phone;

    public Member04() {     // 매개변수가 없는 기본생성자. 생성자가 오버로딩이 되면 자바 컴파일러는 더 이상 기본생성자 묵시적 제공x

        mem_id = "kkkkk";
        mem_name = "홍길동";
        mem_phone = "010-999-9999";
    }

    public Member04(String new_id, String new_name, String new_phone) {
        mem_id = new_id; mem_name = new_name; mem_phone = new_phone;
    }   //매개변수 개수가 다른 생성자 오버로딩

    public void pr(){
        System.out.println("회원아이디: " + mem_id + ", 회원이름: " + mem_name + ", 회원 연락처: " + mem_phone);
    }   //사용자 정의 메서드
}

public class ClassEx04 {
    public static void main(String[] args) {
        Member04 member = new Member04();   //new Member04();에 의해 기본생성자 호출
        member.pr();

        Member04 member02 = new Member04("cccc", "신사임당", "010-7777-7777");
        member02.pr();

        Member04 member03 = new Member04("abcd", "둘리", "010-2222-2222");
        member03.pr();
    }
}
