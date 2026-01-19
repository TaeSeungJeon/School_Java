package Day_14_Inter;
/* 자바 인터페이스.pdf No.25쪽 2번 문제)
     소스는 강의교안을 참고
     컴파일 에러나는 소스. 에러나는 이유에 대해서 주석문 처리하고, 에러 수정.

 */
abstract class Test02{
    public abstract void methodA();

    public void methodB(){
        System.out.println("Hello");
    }
}

class ChildClass02 extends Test02{

    @Override
    public void methodA() {
        System.out.println("오버라이딩 한 methodA()");
    }
}

public class Ex19_02 {
    static void main(String[] args) {

        Test02 t = new ChildClass02(); // 업캐
        t.methodA();
        t.methodB();
        }
    }
