package Day_16;
/* java.util 패키지의 Iterator 인터페이스를 구현상속한 ListIterator 인터페이스 특징)
    1. 자바 2버전 추가
    2. Iterator 인터페이스를 상속해서 기능을 추가한 것으로 컬렉션에 저장된 복수개의 원소값을 읽어올 때
       양방향으로 모두 읽어올 수 있다는 장점이 있다.
       다만, List 컬렉션 인터페이스를 구현 상속한 자손 컬렉션 클래스인 ArrayList, LinkedList등 에서만 사용 가능하다.
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class ListEx04 {
    static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator it = list.listIterator(); //순방향 즉, 다음 방향으로 읽어옴
        while (it.hasNext()) {
            System.out.print(" " + it.next());
        }
        System.out.println("\n===========");
        // 역방향 즉, 이전 방향으로 읽어옴
        while (it.hasPrevious()) {  //이전 원소값이 있으면 참
            System.out.print(" " + it.previous());
        }
        System.out.println("\n===========");
    }
}
