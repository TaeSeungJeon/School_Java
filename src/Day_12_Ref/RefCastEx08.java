package Day_12_Ref;
// 1. 부모와 자손에서 동일한 멤버변수명이 정의된 경우에는 호출되는 변수 결정은 참조변수 타입에 의해서 결정된다.
// *2. 업캐스팅 이후 오버라이딩 한 메서드 호출은 참조변수가 실제 가리키는 객체타입에 의해서 결정된다.*

class Mother08{
    int x = 100;

    void m08(){
        System.out.println("부모클래스 메서드 08()");
    }
}
class Child08 extends Mother08{
    int x = 200;    // 부모와 동일한 멤버변수명 정의

    @Override
    void m08() {
        System.out.println("오버라이딩 한 메서드 m08()");
    }
}

public class RefCastEx08 {
    public static void main(String[] args) {

        Mother08 m = new Child08();     // 업캐
        System.out.println("m.x= " + m.x);  // 100 ( 부모와 자손에서 동일한 멤버변수명 정의됨 -> 참조변수 m 타입에의해 결정
                                            //       여기서 부모타입인 Mother08 이기때문에 부모에서 정의된 멤버변수명 호출
        m.m08();    // 업캐 이후 오버라이딩 한 메서드 호출은 참조변수 m이 실제 가리키는 객체타입에 의해 결정된다.
                    // 여기서는 자손 Child08 이기 때문에 오버라이딩 한 메서드 호출
        Child08 ch = (Child08)m;       // 명시적 다캐
        System.out.println("ch.x= " + ch.x);    // 200
        ch.m08();   // 오버라이딩 한 메서드 호출
    }
}
