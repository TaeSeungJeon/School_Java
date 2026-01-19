package Java_Study02;

// 클래스 구성요소 중 하나인 생성자의 특징)
//  1. 생성자 이름은 반드시 클래스명과 같게 한다. 생성자 명 앞에는 리턴타입이 들어가지 않는다.
//  2. 생성자의 주된 기능은 클래스 소속의 멤버변수 중 인스턴스 변수 초기화 기능이다.
//  3. new 클래스명();에 의해서 생성자를 호출한다.
//  4. 생성자의 메서드의 일종이기 때문에 생성자 오버로딩이 가능하다.
//  5. this();에 의해서 같은 클래스내의 오버로딩 된 다른 생성자를 호출한다.

class Member01 {
    private String mem_id;
    private String mem_name;
    private String mem_phone;

    public Member01() {
        this("kkkkk", "홍길동", "010-0000-0000");
    }

    public Member01(String mem_id, String mem_name, String mem_phone) {
        this.mem_id = mem_id;
        this.mem_name = mem_name;
        this.mem_phone = mem_phone;
    }
    public void printMember() {
        System.out.println("아이디 : " + this.mem_id + ", 회원이름 : " + mem_name + ", 폰 번호 : " + mem_phone);
    }
}

public class ConsTest01 {

    public static void main(String[] args) {

        new Member01().printMember();
        Member01 m03 = new Member01("ccccc", "신사임당", "010-0000-9999");
        m03.printMember();
    }
}
