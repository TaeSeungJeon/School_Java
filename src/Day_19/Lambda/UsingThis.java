package Day_19.Lambda;

// 중첩 클래스 중에서 인스턴스 멤버 내부클래스내의 메서드에서 람다식을 익명 객체를 구현 부분에서
// 외부 클래스의 private로 선언된 멤버변수나 내부 클래스 멤버변수에 접근하는 것에 대한 소스

public class UsingThis {

    private int outerField = 10;

    class Inner{
        int innerField = 20;

        void method (){
            MyFunInterface4 fi = () -> {
                System.out.println("otterField = " + outerField);
                System.out.println("UsingThis.this.outerField = "  + UsingThis.this.outerField);

                System.out.println("innerField = " + innerField);
                System.out.println("this.innerField = " + this.innerField);
            };
            fi.method();
        }
    }
}
