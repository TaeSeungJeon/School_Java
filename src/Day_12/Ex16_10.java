package Day_12;
//문제와 소스는 강의교안을 참조, 소스에서 자바 OOP 언어코드 미흡한 부분 수정 완성
class A2{
    public String toString(){
        return"4";
    }
}
class B2 extends A2{
    public String toString(){
        return super.toString() + "3";
    }
}
public class Ex16_10 {
    public static void main(String[] args) {


        System.out.println(new B2());
        System.out.println(new B2());

        B2 b = new B2();
        System.out.println(b);
    }
}
