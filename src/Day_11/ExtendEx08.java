package Day_11;
// 부모클래스 동일한 멤버변수명이 자손에서 정의된 경우 부모로 부터 상속받은 멤버변수명에 접근할 때는
// super.변수명 으로 하고, 자손에서 정의된 멤버변수명에 접근할때는 this.변수명 또는 this.은 생략 후, 변수명으로 접근한다.

class Parent08{
    int a = 10;
}
class Child08 extends Parent08{
    int a = 20;
    void pr(){
        System.out.println("a = " + a); //this 생략-> 20이 출력
        System.out.println("this.a = " + this.a);
        System.out.println("super.a = " + super.a);
    }
}

public class ExtendEx08 {
    public static void main(String[] args) {
         Child08 child = new Child08();
         child.pr();
    }
}
