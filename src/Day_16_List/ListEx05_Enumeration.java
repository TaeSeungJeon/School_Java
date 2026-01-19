package Day_16_List;

import java.util.Enumeration;
import java.util.Vector;

/*
    java.util 패키지 Enumeration 인터페이스 특)
    1. 자바 1버전 추가 인터페이스 | 컬렉션에 저장된 복수개의 원소값을 순방향으로 쉽게 읽어오는 용도
       저장되는 컬렉션 자료구조로는 사용하지 않는다.
    2. Iterator 의 구버전으로 한번 사용한 것은 다시 사용하지 못한다. 다시 사용하려면 재 생성해야한다.
    3. 자바 1버전에서 추가된 컬렉션 클래스와 잘 맞는다.
 */
public class ListEx05_Enumeration {
    static void main(String[] args) {

        Vector vec = new Vector();
        for (int i = 1; i <= 7; i++) {
            vec.add(i * 10);        // 10부터 70까지 7개 원소 저장
        }
        Enumeration enum2 = vec.elements();
        while (enum2.hasMoreElements()) {   // 벡터에 원소값이 있으면 참
            System.out.println(enum2.nextElement());    // nextElement() 내장 메서드로 다음 원소값을 가져옴

            //Vector는 동기화된 List 컬렉션으로, 멀티스레드 안전하지만 성능이 느려 현재는 잘 사용되지 않는다.
        }
    }
}
