package Day_14_Inter;

interface IHello04 {
    public void sayHello(String name);
}

abstract class GoodBye04{
    public abstract void goodBye(String name);
}

class SubClass04 extends GoodBye04 implements IHello04 {

    @Override
    public void sayHello(String name) {
        System.out.println(name + "님 안녕하세요");
    }
    @Override
    public void goodBye(String name) {
        System.out.println(name + "님 안녕히가세요");
    }
}
public class InterEx04 {
    static void main(String[] args) {
        SubClass04 sub = new SubClass04();
        sub.sayHello("을지문duck");
        sub.goodBye("river감찬");
    }
}
