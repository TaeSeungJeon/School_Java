package Day_09_Class;

// 자바에서 생성자가 오버로딩이 안되었을 때는 컴파일러가 매개변수가 없는 기본 생성자를 묵시적으로 제공한다.
// 하지만 생성자가 오버로딩이 되면 기본 생성자 묵시적 제공을 하지 않는다. 이런경우
// 기본 생성자를 호출하려다가 컴파일 에러가 발생하는 예제 소스이다

class Data10 {
    int value;      // 클래스소속 멤버변수중 인스턴스변수

    // 생성자 오버로딩 되어서 기본생성자 묵시적 제공 안함

    Data10(int value) {
        this.value = value;
    }   // 매개변수 개수가 다른 생성자 오버로딩
    void pr() {
        System.out.printf("value = %d \n", value);
    }
}

public class ClassEx10 {

    public static void main(String[] args) {

        //new Data10().pr();
    }
}
