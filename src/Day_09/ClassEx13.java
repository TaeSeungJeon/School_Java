package Day_09;

//클래스 초기화 블록, 인스턴스 초기화 블록

public class ClassEx13 {
    int a;

    static {
              // 클래스 초기화 블록으로 해당 클래스가 로드 실행될 때 같이 딱 한번만 실행한다.
              // 이 초기화 블록은 static 키워드로 정의하고, 정적변수 초기화에 사용된다.
        System.out.println("static{} 클래스 초기화 블록");
    }
    {         // 이 영역은 인스턴스 초기화 블록{}이다. 클래스 소속 멤버변수 중 객체 생성해서 접근하는 인스턴스 변수 초기화에 사용한다.
              // 인스턴스 초기화 블록은 생성자와 같이 객체가 생성될 때 마다 실행한다. 주의할 것은 인스턴스 변수 초기화에는
              // 주로 생성자를 사용하고 모든 생성자에서 공통으로 사용되는 코드 부분은 인스턴스 초기화블록에서 사용한다.
        a = 100;
        System.out.println("{} 인스턴스초기화 블록");
    }
    public ClassEx13(){
        System.out.println("기본 생성자");
            // 생성자보다 인스턴스 초기화 블록이 먼저 실행된다.
    }
    public static void main(String[] args) {
        new ClassEx13();    // 먼저 인스턴스 초기화 블록을 실행 하고난 다음 생성자를 호출
        new ClassEx13();    // 객체가 생성될 때 마다 인스턴스 초기화 블록과 생성자를 호출
        new ClassEx13();

        ClassEx13 cex13 = new ClassEx13();
        System.out.println("cex13.a=" + cex13.a);
    }
}
