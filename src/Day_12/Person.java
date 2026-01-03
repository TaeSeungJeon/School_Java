package Day_12;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }                                //생성자 오버로딩 -> 매개변수가 없는 기본생성자 묵시적 제공안함.
    public void walk(){
        System.out.println("걷습니다.");
    }
}
