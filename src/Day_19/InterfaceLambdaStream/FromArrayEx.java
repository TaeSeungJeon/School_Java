package Day_19.InterfaceLambdaStream;

// 배열로부터 스트림 얻기

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayEx {
    static void main(String[] args) {

        String[] strArray = {"홍길동", "이순신", "신사임당"};
        Stream<String> strStream = Arrays.stream(strArray);

        strStream.forEach(name -> System.out.print(" " + name));
        System.out.println("\n==========================");

        int[] intArray = {100, 200, 300};
        IntStream intStream = Arrays.stream(intArray);

        intStream.forEach(number -> System.out.println(" " + number));

    }
}
