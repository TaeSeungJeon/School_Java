package Day_12_Ref;
// 16장. 상속.pdf No.28쪽 5번 문제 || 문제는 강의 교안을 참조하고 이 소스는 컴파일 에러가 발생한다. 에러 나는이유까지 서술


class TestSuper{
    int i;

    TestSuper(int i) {
        this.i = i;
    }
}
class TestSub extends TestSuper{

    TestSub() {
        super(10);      // 부모의 int i 생성자에 값을 전달
    }

}


public class Ex16_6 {
    public static void main(String[] args) {
        new TestSub();
    }

}
