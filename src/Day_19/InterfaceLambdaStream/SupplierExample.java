package Day_19.InterfaceLambdaStream;

import java.util.function.IntSupplier;

// java.util.function 패키지 Supplier 계열의 내장 함수형 인터페이스 특징)
//  1. 매개값(인자값)은 없고, 리턴(반환)값은 있다.
public class SupplierExample {
    static void main(String[] args) {


        //문제 Math.random() 정적메서드를 사용해서 1부터 6사이의 임의의 정수숫자 난수를 발생해
        //     그 값을 리턴하여 임의의 주사위 눈의 수를 구하는 자바 프로그램코드 완성하시오
        IntSupplier intSupplier = () -> {
            int diceNum = (int) (Math.random() * 6) + 1;
            return diceNum;
        };
        int resultNumber = intSupplier.getAsInt();
        System.out.println("임의의 주사위 눈의 수 : " + resultNumber);
    }
}
