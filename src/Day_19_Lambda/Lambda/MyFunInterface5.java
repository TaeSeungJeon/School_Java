package Day_19_Lambda.Lambda;

/* @FunctionalInterface 를 사용하지 않아도 추상메서드가 딱 하나만 오는 경우는 해당 인터페이스를 람다식에 사용가능
*  이 인터페이스로 외부 클래스 메서드내의 람다식 익명객체 구현에 사용해본다.*/

@FunctionalInterface
public interface MyFunInterface5 {

    void method();  // public abstract 키워드 생략된 추상메서드
}