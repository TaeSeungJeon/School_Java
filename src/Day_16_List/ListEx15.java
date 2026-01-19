package Day_16_List;
/* 두번째 제네릭 와일드 카드 문법)
    <?> 모든 객체타입 배치가 가능하다.
 */

import java.util.Arrays;
import java.util.List;

public class ListEx15 {

    static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(" " + obj);
        }
        System.out.println("===================");
    }

    static void main(String[] args) {
        List<Integer> li01 = Arrays.asList(10, 20, 30, 40, 50);
        printList(li01);

        List<String> li02 = Arrays.asList("seoul", "daegu");
        printList(li02);
    }
}
