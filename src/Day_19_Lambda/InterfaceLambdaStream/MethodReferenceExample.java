package Day_19_Lambda.InterfaceLambdaStream;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
    static void main(String[] args) {


        IntBinaryOperator operator;

        operator = (left, right) -> Calculator.staticMethod(left, right);   //람다
        System.out.println("덧셈 결과값= " + operator.applyAsInt(10, 10));

        operator = Calculator :: staticMethod;
        System.out.println("덧셈 결과값 2 = " + operator.applyAsInt(5, 5));

        Calculator cal = new Calculator();
        operator = (left, right) -> cal.instanceMethod(left, right);
        System.out.println("곱셈 결과값= " +operator.applyAsInt(7, 7));

        operator = cal :: instanceMethod;
        System.out.println("곱셈 결과 값2= " + operator.applyAsInt(6, 6));

    }
}
