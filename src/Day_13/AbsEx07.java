package Day_13;
// 1. 상속, 업캐 등 자바 OOP(객체지향 프로그래밍) 문법이 적용된 매개변수 다형성이 적용되면 자손클래스 개수만큼 메서드 오버로딩을 안해도 된다.
//    그 만큼 중복코드를 안해도되고 코드가 간결해진다. 부모 타입 매개변수로 모든 자손타입을 받을 수 있다.

// 2. 매개변수 다형성 문법이 적용되지 않으면 자손 클래스 개수만큼 매개변수 타입을 다르게 한 메서드를 오버로딩을 해야한다.
//     그 만큼 중복코드 라인이 늘어난다.

import net.daum.model01.ShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

public class AbsEx07 {
    //매개변수 다형성 문법이 적용된 경우
    static void inbound01(ShapeClass ref) { // 입고 | 다형성 문법 적용위해 매개변수 타입을 부모타입으로 선언. 그러면 모든 자손타입 받을 수 있음
        ref.draw();
    }

    static void inbound02(Circ c) { // 불필요하게 자손클래스 개수만큼 자손클래스 타입을 다르게한 메서드 / 오버로딩 필요
        c.draw();
    }

    static void inbound02(Rect r){
        r.draw();
    }

    static void inbound02(Tria t) {
        t.draw();
    }
    public static void main(String[] args) {
        Circ c = new Circ();
        Rect r = new Rect();
        Tria t = new Tria();

        inbound01(c); inbound01(r); inbound01(t);

        System.out.println("\n=======================\n");

        inbound02(new Circ()); inbound02(new Rect()); inbound02(new Tria());
    }
}
