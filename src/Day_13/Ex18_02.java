package Day_13;
//18장. 추상클래스와 final.pdf No.21쪽 2번 문제
// 강의 교안 소스를 참조해서 좀 더 나은 자바 OOP코드(오버라이딩 애너테이션, 업캐스팅, 업캐스팅 이후 오버라이딩된 메서드 호출)로 변경
// 코드는 컴파일 에러난다 에러나는 이유에 대해 설명

class A{
    public int method1(){
        return 0;
    }
}

class B extends A{
    public final int method1(){
        return 1;
    }
}

public class Ex18_02 {
    static void main(String[] args) {
        B b = new B();
        System.out.println("x= " + b.method1());
    }
}
// final 을 선언하면 그뒤에 어떤 상속도 오버라이딩도 허락하지 않기때문에 final이 부모 클래스인 A클래스에 있어서 B 클래스에서는 적용되지 않았음
// 그래서 A로 부터 상속받는 자손B 클래스에 final을 선언해줌
