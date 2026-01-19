package Day_14_Inter;
// 자바 인터페이스.pdf No24쪽 1번 문제)
/* 1. net.daum.model01 패키지를 생성하고 부모 인터페이스 IShapeClass.java 를 만들고 추상메서드 void draw();를 정의한다.
   2. net.daum.model02 패키지를 생성하고 부모 인터페이스 IShapeClass.java 를 구현 상속한 자손 클래스
      Circ.java, Rect.kava, Tria.java를 생성하고 부모의 추상메서드 draw()를 각각 오버라이딩 한다.
      각 오버라이딩 된 출력 실행문장으로 "타원을 그린다", "사각형을 그린다", "삼각형을 그린다"가 출력되게 하는 자바 코드를 기술한다.
      출력)
      타원을 그린다.
      사각형을 그린다.
      삼각형을 그린다.
 */

import net.daum.model01.IShapeClass;
import net.daum.model02.Circ1;
import net.daum.model02.Rect1;
import net.daum.model02.Tria1;


public class Ex19_01 {
    static void pr(IShapeClass ish) {
        ish.draw(); //업캐 이후 오버라이딩 한 메서드 호출

    }
    public static void main(String[] args) {

        IShapeClass ref;        // 부모 인터페이스 타입으로 참조변수 선언

        ref = new Circ1();       // 업캐
        ref.draw();     // 업캐 이후 오버라이딩 한 메서드 호출

        ref = new Rect1();
        ref.draw();

        ref = new Tria1();
        ref.draw();

        pr(new Circ1()); pr(new Rect1()); pr(new Tria1());

    }
}
