package Day_19_Lambda.InterfaceLambdaStream;

// 컬렉션에 저장된 복수개의 원소값을 자바2 버전에서 추가된 Iterator 인터페이스를 사용해 다음 원소값을 쉽게 읽어오는 기존방법과
// 자바8 에서 추가된 람바식과 스트림을 사용해서 보다 더 간결한 코드로 컬렉션 원소값을 읽어오는 비교 예

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorAsStreamEx {

    static void main(String[] args) {

        List<String> list = Arrays.asList("서울시", "부산시", "대전시"); //컬렉션 List로 변환

        // Iterator를 사용해서 컬렉션의 다음 원소값을 읽어옴
        // -> 컬렉션에 원소값을 저장하는 용도로 사용하는 컬렉션 자료구조는 아니다.
        //    한번사용하면 다시 사용 못함. 다시 사용하려면 재 생성 해야함.
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String cityName = iterator.next();
            System.out.print(" " + cityName);
        }
        System.out.println("\n=================================");

        //stream 사용
        Stream<String> stream = list.stream();  // 스트림 객체 생성
        stream.forEach(name -> System.out.print(" " + name)); //람다식-> 사용해서 간결하게 읽어온다

    }
}
