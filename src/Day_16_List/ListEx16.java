package Day_16_List;
/*  제네릭 와일드 카드 3번째 문법 형식)
        <? super Integer> 는 Integer 타입의 부모만 제네릭 타입간의 형변환을 제한적으로 허용한다.
 */


import java.util.Arrays;
import java.util.List;

public class ListEx16 {
    static void printList(List<? super Integer> list) {
        for (Object o : list) {
            System.out.print(" " + o);
            /*
            for (int i = 0; i < list.size(); i++) {
                System.out.print(" " + list.get(i));
             */
        }
        System.out.println("\n======================");
    }
    static void main(String[] args) {

        Number[] arr = {100, 200, 300};
        Object[] arr2 = {100.2, 200.3};

        List<Number> li = Arrays.asList(arr);
        printList(li);

        List<Object> li2 = Arrays.asList(arr2);
        ListEx16.printList(li2);

    }
}
