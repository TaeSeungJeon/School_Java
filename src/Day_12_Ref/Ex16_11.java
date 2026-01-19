package Day_12_Ref;
// 자바에서 레퍼런스 간의 형변환 중 업캐스팅 특징)
//  1. 업캐스팅을 하려면 사전에 상속관계를 만들어야 한다.
//  2. 업캐스팅이란 자손타입이 부모타입으로 올라가는 현상을 말한다. 업캐스팅은 암묵적 자동 형변환을 해준다.

class Mother01 extends Object {

    public void m01(){
        System.out.println("부모클래스 메서드 m01()");
    }
}

class Son01 extends Mother01{

    public void s01(){
        System.out.println("자손클래스 메서드 s01()");
    }
}

public class Ex16_11 {
    public static void main(String[] args) {

        Mother01 m01 = new Son01(); // 업 캐스팅
        m01.m01();

        Object obj01 = new Son01(); // 부모 건너뛰고 Object으로 업캐스팅 가능
    }
}
