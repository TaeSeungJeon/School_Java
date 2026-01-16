package Day_19.InterfaceLambdaStream;

// 람다식, 스트림 활용 컬렉션 원소값을 쉰게 읽어오는 예제소스

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaStreamEx {
    static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 100),
                new Student("이순신", 100)
        );
        Stream<Student> stream = studentList.stream();
        stream.forEach(s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println("학생명: " + name + ", 점수: " + score);
        });
    }
}
