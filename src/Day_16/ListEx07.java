package Day_16;

import java.util.LinkedList;
import java.util.Queue;

/* java.util 패키지의 Queue 컬렉션 인터페이스를 구현 상속한 컬렉션 클래스 LinkedList 특)
    1. 입구와 출구가 다르기 때문에 가장 먼저 입력된 자료가 가장먼저 나가는 구조 (FIFO)

*/
public class ListEx07 {
    static void main(String[] args) {

        Queue Que = new LinkedList();   //업캐 하면서 Que 컬렉션 객체 생성

        Que.offer("1-Java"); //offer() 메서드로 큐에 원소값 추가
        Que.offer("2-Oracle");
        Que.offer("3-Css");
        Que.offer("4-Html");

        while (Que.peek() != null) { // 큐가 비어있지 않다면 반복
            System.out.println(Que.poll()); //poll() 메서드로 큐에서 테이터를 꺼내고 제거, 큐의 맨 앞 원소를 반환하고 제거

        }
    }
}
