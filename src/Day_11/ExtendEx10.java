package Day_11;
// static improt 문)
// static import 문을 사용하면 static 멤버(정적변수, 정적메서드)를 호출 할 때 클래스 이름을 생략할 수 있다.

import static java.lang.System.out;
import static java.lang.Math.*;
// java.lang 은 기본패키기 경로이다. 생략가능. import 키워드는 외부 패키지의 API를 읽어들일 때 사용한다.

public class ExtendEx10 {
    public static void main(String[] args) {

        out.println("난 수 : " + random());   //Systme.이 생략됨. Math.가 생략됨.
        out.println("원주율 : " + PI);
    }
}
