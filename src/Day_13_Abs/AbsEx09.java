package Day_13_Abs;
// final 메서드 특)
// 메서드를 final로 선언하면 자손에서 더이상 오버라이딩을 할 수 없다.

class FinalMethod{

    public final void p(){
        System.out.println("파이널 메서드 정의");
    }
}

/*class FinalChild extends FinalMethod {
    @Overrid
    public void p(){
        // final 메더드 p()는 자손에서 오버라이딩이 안된다.
    }
}*/

public class AbsEx09 {
    static void main(String[] args) {

    }
}
