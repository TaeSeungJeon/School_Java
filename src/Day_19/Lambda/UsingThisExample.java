package Day_19.Lambda;

// 문제) UsingThis 외부 클래스 객체명을 usingThis로 생성한 뒤 인스턴스 멤버 내부클래스 객체명을 inner로 생성해서
//      멤버내부클래스에 정의된 method()를 호출하는 과정 자바코드를 만들어본다.
//      결국 인스턴스 멤버내부클래스 객체 생성되는 과정코드를 해보라는 의미

public class UsingThisExample {
    static void main(String[] args) {

        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method();
    }
}
