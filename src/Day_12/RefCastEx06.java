package Day_12;
// 업캐스팅 이후 오버라이딩 한 메서드를 호출한다.

class Mother06{
    public void m06(){
        System.out.println("부모클래스 메서드 m06()");
    }
}
class Child06 extends Mother06{
    public void ch06(){
        System.out.println("자손클래스에서 정의된 메서드 ch06()");
    }

    @Override
    public void m06() {
        super.m06();
        System.out.println("자손에서 오버라이딩한 메서드 m06()");
    }
}
public class RefCastEx06 {
    public static void main(String[] args) {

        Mother06 m06 = new Child06();   // 업캐
        m06. m06();     // 업캐 이후 자손에서 오버라이딩한 메서드 호출
                        // 메서드가 오버라이딩 한 경우 부모에도 동일 메서드 원형이 있고, 자손에도 같은 메서드명이 있다.
                        // 이런경우 참조변수 m6이 실제 가리키는 객체타입이 누구인지에따라 호출되는 메서드명이 결정된다.
                        // 여기서는 자손타입인 Child06 객체주소를 가리키고 있기 때문에 자손에서 오버라이딩한 메서드 호출.
    }
}
