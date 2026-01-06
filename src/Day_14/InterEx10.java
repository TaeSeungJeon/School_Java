package Day_14;
// 두 부모 인터페이스의 디폴트 메서드명이 동일한 경우 다중 상속한 자손클래스에서 이 디폴트 메서드를 오버라이딩 해야한다.

interface InterA{
    default void display(){
        System.out.println("InterA 디폴트 메서드");
    }

    static void staticMethod(){
        System.out.println("InterA 정적메서드");
    }
}

interface InterB{
    default void display(){
        System.out.println("InterB 디폴트 메서드");
    }
}











class ChildClass10 implements InterA, InterB{
    @Override
    public void display() {
        System.out.println("오버라이딩 된 디폴트 메서드");
        InterA.super.display();
        InterB.super.display();
    }
}














public class InterEx10 {
    static void main(String[] args) {

        ChildClass10 ch10 = new ChildClass10();
        ch10.display();
        InterA.staticMethod(); // 인터페이스명.정적메서드() 호출
    }
}
