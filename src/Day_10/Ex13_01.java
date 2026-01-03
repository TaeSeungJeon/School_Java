package Day_10;

class Animal{
    String name;
    int age;        // 클래스 소속 멤버변수(속성)중 인스턴스 벼녀수 2개 정의
    // 생성자 오버로딩이 되면 매개변수가 없는 기본 생성자는 더이상 묵시적 제공이 되지 않는다. 즉, 생략 불가

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println(name + "는(은) " + age +  "살 입니다.");
    }
}

public class Ex13_01 {

    public static void main(String[] args) {


    }
}
