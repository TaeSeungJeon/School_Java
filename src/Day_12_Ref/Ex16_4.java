package Day_12_Ref;
// 16장.상속.pdf No.23쪽 3번 문제 || 문제는 강의교안을 참조한다.
/* 부모클래스 메서드내에서 if~else문 재신 if문만 사용해도된다.
    부모클래스 각 메서드내의 실행문장으로 '소녀는 사람이다', '사람은 2발로 걷는다' 처리하고,
    Dog동물 자손 클래스에서 부모클래스 각 메서드를 오버라이딩을 한다음 실행문장으로 if문만 사용해서
    '강아지는 동물이다','강아지는4발로 걷는다'가 출력되는 자바 코드를 완성해본다.
 */

class Animal04 {
   protected String kind;
   protected int leg;

   public Animal04(){}

    public Animal04(String kind, int leg) {
       this.kind = kind;
       this.leg = leg;
    }
    public void printkind(){
        if (kind.equals("소녀")) { // String 문자열 참조타입 내장클래스 하위의 equals() 메서드는 객체주소를 비교하지않고 문자열 내용값만 비교
                                  // 문자열 내용이 같으면 true 다르면 false 문자열값이 같다 다르다는 == 비교연산 사용하지않고 equals() 메서드 사용
            System.out.println(kind + "는 사람이다");
        }
    }
    public void walk(){
        if (leg == 2) {
            System.out.println("사람은 " + leg + "발로 걷는다");
        }
    }
}
class Dog04 extends Animal04{ // 첫 자손 class
    public Dog04() {}

    public Dog04(String kind, int leg) {
        super(kind, leg);       // 부모 매개변수 2개 짜리 오버로딩 된 생성자 호출
    }

    @Override
    public void printkind() {
        if (kind.equals("강아지")) {
            System.out.println(kind + "는 동물이다.");
        }
    }
    @Override
    public void walk() {
        if (leg == 4) {
            System.out.println("강아지는 " + leg + "발로 걷는다.");
        }
    }
}
class Human04 extends Animal04{     // 두번째 자손 class
    public Human04(){}

    public Human04(String kind, int leg) {
        super(kind, leg);
    }
}
public class Ex16_4{

    public static void main(String[] args) {

        Dog04 d = new Dog04("강아지", 4);
        d.printkind();
        d.walk();

        Human04 h = new Human04("소녀", 2);
        h.printkind();
        h.walk();
    }
}
