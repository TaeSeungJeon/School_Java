package Day_13_Abs;
// 18장. 추상클래스와 final.pdf No.19 1번 문제
//  부모 추상클래스의 추상메서드는 상속받은 자손클래스에서 모두 오버라이딩을 해야한다 라는 강제성이 부여된다.

abstract class Abs10{
    int a = 10;
    public abstract int getA();
}

abstract class Abs2 extends Abs10{
    int b = 20;
    public abstract int getB();
}

class AbsMain extends Abs2{

    @Override
    public int getB() {
        return b;
    }

    @Override
    public int getA() {
        return a;
    }
}

public class Ex18_01 {
    static void main(String[] args) {

        AbsMain absmain = new AbsMain();

        System.out.println("a= " + absmain.getA());    // 10이 출력되게 한다.
        System.out.println("b= " + absmain.getB());    // 20이 출력되게 한다.

    }
}
