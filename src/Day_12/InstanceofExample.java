package Day_12;
// instanceof 의 자동 타입변환 -> instanceof 패턴 매칭

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println("학생명: " + person.name);


        if (person instanceof Student student) { // person이 참조하는 객체가 Student 자손타입이면 자동 타입변환
                                                 // -> 다캐 코드 필요 x (per이 Stu 자손타입으로 다캐 가능? 참)
            System.out.println("학번: " + student.studentNo);
            student.study();
        }
    }
    public static void main(String[] args) {
        Person p01 = new Person("길동홍");
        personInfo(p01);

        Student st01 = new Student("순신리", 20260102);
        personInfo(st01);       // 정적메서드 호출하면서 Per per = st01; 이 되면서 내부적인 업캐

    }
}
