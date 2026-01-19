package Java_Study02.net.daum.model01;

/* 인터페이스 특징)
    1. interface 예약어로 정의한다.
    2. 부모 인터페이스를 자손클래스에서 다중 상속을 받을 수 있다. implements 키워드로 구현 상속 받는다.
    3. public abstract 키워드가 생략된 추상메서드가 올 수 있다. 추상메서드{}가 없고, 실행문장 없고, 호출 불가
    4. 부모 인터페이스를 상속받은 자손클래스에서 반드시 부모의 추상메서드를 오버라이딩 해야만 자손클래스 객체 생성 가능.

*/

public abstract class ShapeInterface {

    public abstract void draw();


}
