package Day_18_Thread.중첩클래스와중첩인터페이스;
// 인스턴스 멤버 내부클래스와 정적멤버 내부클래스 객체 생성과정

public class Main {
    static void main(String[] args) {

        A a = new A();

        A.B b = a.new B();
        b.field01 = 3;
        b.field02 = 7;
        b.method01();
        b.method02();

        A.C c = new A.C(); // 정적멤버 내부 클래스 객체 생성과정
        c.field01 = 10;
        c.field02 = 100;
        c.method01();
        c.method02();

        // 로컬 클래스객체 생성을 위한 메서드 호출
        a.method();
    }
}
