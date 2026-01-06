package Day_14;
// 일반 클래스 추상 클래스는 하나 이상의 부모클래스로 부터 다중 상속을 받을 수 없다.
// 오직 하나의 부모로부터 단일 상속만 가능하다.

class Hello02{
    public void sayHello(String name) {
        System.out.println(name+"씨 반가워요");
    }
}

abstract class GoodBye02 {
    public abstract void bye(String name);
}

class SubClass02 extends Hello02{//, GoodBye02 { 컴파일 에러
    // 클래스나 추상클래스 오직 하나의 부모로부터 단일상속만 가능하다.
}
public class InterEx02 {
    static void main(String[] args) {


    }
}
