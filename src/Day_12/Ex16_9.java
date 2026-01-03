package Day_12;
class A{
    public A(){
        System.out.println("hello from a");
    }
}
class B extends A{
    public B(){
        super();        // 혹은 없어도 됨.
        System.out.println("hello from b");

    }
}
public class Ex16_9 {
    public static void main(String[] args) {
        A a = new B();

        // super 는 부모 생성자 다음에 바로 붙어야함 프린트 뒤에 있어서 실행 안됐음
    }
}
