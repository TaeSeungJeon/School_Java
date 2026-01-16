package Day_19.InterfaceLambdaStream;

// Java.util.function 패키지의 Consumer 계열의 내장 함수형 인터페이스 특징)
// 1. 매개값 (인자값)은 있고, 리턴값은 없다.

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + " 21");
        consumer.accept("Java");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
        biConsumer.accept("Oracle", "21c Express Edition");

        DoubleConsumer doubleConsumer = v -> System.out.println("Java" + v);
        doubleConsumer.accept(21.0);

        ObjIntConsumer<String> objIntConsumer = (t, v) -> System.out.println(t + v);
        objIntConsumer.accept("Java", 21);
    }
}
