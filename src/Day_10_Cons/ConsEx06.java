package Day_10_Cons;
//정적메서드 내에서는 this와 인스턴스 변수를 사용할 수 없다.

class St06{
    static int a = 10;
    int b = 20;


    public static void printA(){        //정적 메서드
        System.out.println(a);
        //System.out.println(this.b);     //정적메서드 내에서는 this 사용 불가
        //System.out.println(b);          //정적메서드 내에서는 인스턴스 변수 사용 못함
    }
    public  void printB(){              //인스턴스 메서드
        System.out.println(a);
        System.out.println(b);
        System.out.println(this.b);     //인스턴스 메서드 내에서는 정적변수, 인스턴스변수, this 모두 사용가능하다.
    }
}
public class ConsEx06 {

    public static void main(String[] args) {


    }
}
