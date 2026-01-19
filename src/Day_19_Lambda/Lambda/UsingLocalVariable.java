package Day_19_Lambda.Lambda;

// MyFunInterface5 인터페이스를 메서드 내의 람다식 익명객체 구현해 사용해본다.
// 람다식 익명객체내의 오버라이딩 된 메서드 내에서 외부 클래스 소속의 메서드의 매개변수나 지역변수를 사용할 경우
// final 상수로 인식한다.

public class UsingLocalVariable {

    void method(int arg) {  // arg 는 final 속성을 가진 상수로 인식
        int localVar = 70;

        //arg = 100;  // final 상수로 인식돼 값 수정 불가.
        //localVar = 700;  상동

        //람다식 익명객체 구현
        MyFunInterface5 fi = () -> { // 오버라이딩 된 메서드 생략
            System.out.println("arg" + arg);
            System.out.println(localVar);

        };

        fi.method();
    }
}
