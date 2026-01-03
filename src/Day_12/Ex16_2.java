package Day_12;
// 16장. 상속.pdf No.20쪽 1번 문제)
//  강의 교안 소스중에서 접근 권한이 잘못된 번호를 기술하고, 보다 더 좋은 OOP(객체지향 프로그래밍)
//  자바 코드로 변경해 본다.

class Parent02{
    private int a;
            int b;
    protected int c;
    public int d;
}
class Child02 extends Parent02{
    public Child02(int a, int b, int c, int d) {
     //   this.a = a;    // [1]정답 -> 부모 Parent02에서 private 로 정의된 멤버변수 a는 같은 패키지의 자손클래스에 접근 못함
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public void func(){
      //  System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class Ex16_2 {
    public static void main(String[] args) {
        Child02 child = new Child02(10, 20, 30, 40);
        child.func();

    }
}
