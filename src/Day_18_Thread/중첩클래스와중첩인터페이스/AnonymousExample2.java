package Day_18_Thread.중첩클래스와중첩인터페이스;

// Anonymous2 클래스를 활용한 소스

public class AnonymousExample2 {
    static void main(String[] args) {

        Anonymous2 anonymous2 = new Anonymous2();
        anonymous2.field.turnOn();
        anonymous2.field.turnOff();
        anonymous2.method();

        //익명객체를 메서드 매개변수 인자값으로 전달.
        anonymous2.method02(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("유튜브를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("유튜브를 끕니다.");
            }
        });
    }
}
