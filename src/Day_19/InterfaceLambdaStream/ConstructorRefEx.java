package Day_19.InterfaceLambdaStream;

import java.util.function.BiFunction;
import java.util.function.Function;

//생성자 참조를 위한 자바 소스 예
public class ConstructorRefEx {
    static void main(String[] args) {

        /*
            Function 내장 함수형 인터페이스 특징)
            1. 인자값도 있고, 리턴값도 있다. 인자값을 리턴값으로 타입변환을 해준다.
        */
        Function<Integer, Member2> fun01 = Member2 :: new;
        // 첫번째 제네릭 타입 Integer는 입력값 타입이고, 두번째 제네릭 타입 Member2는 반환타입.
        Member2 member01 = fun01.apply(7);
        // 함수형 인터페이스 apply(7) 추상메서드의 인자값 7과 동일한 타입 그리고 개수를 가진 Member2 내의 오버로딩 된 생성자 호출

        // BiFunction 내장 함수형 인터페이스는 입력값은 2개이고, 반환값은 하나이다.
        BiFunction<String,Integer,Member2> fun02 = Member2 :: new;
        fun02.apply("자바", 21);

    }
}
