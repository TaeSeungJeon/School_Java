package Day_19.InterfaceLambdaStream;

// 숫자 범위로부터 스트림을 얻어서 1부터 100까지 누적합 구하기.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class FromIntRangeEx {

    static int sum;

    static void main(String[] args) {

        IntStream stream = IntStream.rangeClosed(1, 100); // 1~100 순차적으로 제공하는 IntStream을 생성
        stream.forEach(number -> sum += number);
        System.out.println("1부터 100까지 누적 합: " + sum);

        System.out.println("\n======================");

        sum = 0;
        List<Integer> numList = new ArrayList<>();
        // 야간 진도 보강 문제 1)
        // 일반 for 반복문을 사용해서 1부터 10사이의 정수숫자 난수를 발생한 다음 이것을 numList 컬렉션에 저장하고 출력하는 코드 만들기.

        for (int i = 0; i <= 9; i++) {
            int number = (int)(Math.random()*10)+1;
            numList.add(number);    //컬렉션에 추가
            System.out.print(" " + numList.get(i));
        }


            System.out.println("\n======================");


        // 야간 진도 보강 문제 2)
        // 향상 확장 for 반복문을 사용해서 numList 컬렉션 원소값의 누적합을 sum 변수에 저장한 다음 출력해본다.
        for (int k:numList) {
            sum += k;
        }
        System.out.printf("numList컬렉션 원소 누적함 =%d \n", sum);
    }
}
