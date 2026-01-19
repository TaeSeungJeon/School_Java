package Day_11_Extends;
// this () : 상속과 관련없다. 같은 클래스내에서 다른 생성자를 호출할 때 사용한다.
// 주로 동일 클래스내에서 오버로딩 된 다른 생성자를 주로 호출한다.

// super() : 상속관계에서 자손에서 부모의 생성자를 호출할 때 사용한다.

class Parent09{
    int x = 10;
    int y = 20;

    Parent09(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Child09 extends Parent09{
    int z = 30;
    Child09(){
        this(100, 200, 300);
        // 자바의 생성자 {} 중괄호 블록 내에서 this() 또는 super()를 사용하는 경우 항상 첫줄에 와야한다.
        // 단 한번만 호출 가능하다
        // this() 와 super() 는 동시에 사용할 수 없다.
        // 생성자 {} 내에서 super() or this() 를 생략하면 자바 컴파일러는 자동으로 super(); 를 추가한다.
    }
    Child09(int x, int y, int z) {
        super(x, y);    //부모 클래스의 매개변수 2개짜리 오버로딩 된 생성자 호출
        this.z = z;
    }
    void pr(){
        System.out.println("x=" + x + ",y=" + y);
        System.out.println("z=" + z);
    }
}
public class ExtendEx09 {
    public static void main(String[] args) {
        Child09 child09 = new Child09();
        child09.pr();

        Child09 ch10 = new Child09(110, 120, 130);
        ch10.pr();
    }
}
