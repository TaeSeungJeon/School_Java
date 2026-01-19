package Java_Study02;

import Java_Study02.net.daum.model01.ShapeInterface;
import Java_Study02.net.daum.model02.Son01;
import Java_Study02.net.daum.model02.Son02;

class Poly04{

    public void print(ShapeInterface si) {  // 매개변수 다형성 -> 상속 + 업캐
        si.draw();      // 업캐 이후 오버라이딩 한 메서드 호출
    }
}

public class ConsTest04 {
    public static void main(String[] args) {

        ShapeInterface sf;  // 부모 인터페이스 타입으로 참조변수 선언

        sf = new Son01();   // 업캐
        sf. draw();         // 업캐 이후 오버라이딩 한 메서드 호출

        sf = new Son02();
        sf.draw();

        System.out.println("\n==========================\n");

        Poly04 p04 = new Poly04();
        p04.print(new Son01());     // print() 메서드 호출하면서 부모 인터페이스 타입으로 업캐

        Son02 s02 = new Son02();
        p04.print(new Son02());
    }
}
