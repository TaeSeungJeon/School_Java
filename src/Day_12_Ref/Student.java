package Day_12_Ref;

public class Student extends Person{

    int studentNo;

    public Student(String name, int studentNo) {
        super(name);                    // 부모클래스 매개변수 한개짜리 오버로딩 된 생성자 호출
        this.studentNo = studentNo;
    }

    public void study(){
        System.out.println("자바를 공부한다.");
    }
}
