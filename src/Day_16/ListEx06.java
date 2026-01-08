package Day_16;

import java.util.Stack;

/* java.util 패키지의 컬렉션 클래스 Stack의 특징)
    1. 자바 1버전에서 추가된 컬렉션 클래스이다.
    2. 입구와 출구가 같은 구조라서 가장 먼저 입력된 데이터가 가장 나중에 출력된다.
       선입후출 First input Last out : FILO
    3. 가장 나중에 입력된 것이 먼저 나가는 구조 Last Input First Output : LIFO
 */
public class ListEx06 {
    static void main(String[] args) {

        Stack stack = new Stack();

        stack.push("1-Java");
        stack.push("2-Oracle");
        stack.push("3-HTML");
        stack.push("4-CSS");

        while(!stack.isEmpty()){ // 스택이 비어있지 않을 동안 반복 -> 비어있지 않으면 참
            System.out.println(stack.pop());    // pop()는 스택 맨 위의 원소를 제거하면서 반환 | 입력된 값 역순으로 출력
        }
    }
}
