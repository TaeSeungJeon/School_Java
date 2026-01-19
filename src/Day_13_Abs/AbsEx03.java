package Day_13_Abs;
// 추상 클래스 특징)
//  1. 부모 추상클래스의 추상메서드는 상속받은 자손클래스에서 반드시 일반메서드로 오버라이딩을 해야한다. 그래야만 자손클래스 객체생성이 가능하다.


abstract  class Abs04{
    abstract void method01();
}
class Child03 extends Abs04{

    @Override
    void method01() {
        System.out.println("추상메서드가 일반메서드로 오버라이딩 함");
    }
}

public class AbsEx03 {
    public static void main(String[] args) {

        Abs04 abs;
        abs = new Child03();
        abs.method01();
    }
}
