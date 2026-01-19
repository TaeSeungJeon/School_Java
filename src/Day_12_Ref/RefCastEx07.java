package Day_12_Ref;
// instanceof 연산자는 레퍼런스간의 형변환(업캐/다운캐) 유무를 판단해주는 연산자이다.
// 다운캐스팅할 때 캐스팅 연산자 예외 오류가 나는 것을 방지하기 위해서는 if 조건문과 함께 사용한다.

class Car07 extends Object{

}
class FireEngine07 extends Car07{

}

public class RefCastEx07 {
    public static void main(String[] args) {
        FireEngine07 fe = new FireEngine07();

        if (fe instanceof Car07) {      // fe가 부모타입 Car07로 업캐 가능한가? 참!
            Car07 car = fe;         // 업캐
            System.out.println("Car07로 업캐 가능합니다.");
        }
        if (fe instanceof Object) {     // fe가 최고 조상 Object 타입으로 업캐 가능한가? 참!
            Object obj = fe;
            System.out.println("Object 타입으로 업캐 가능합니다.");
        }
        Object obj = new FireEngine07();    // 사전에 업캐 함
        if (obj instanceof FireEngine07) {      // obj가 FireEngine07 자손타입으로 다캐 가능? 참! ( 사전에 업캐 했음 )
            FireEngine07 fe07 = (FireEngine07) obj;
            System.out.println("명시적 다캐 가능합니다.");
        }else {
            System.out.println("다캐 불가능합니다.");
        }
    }
}
