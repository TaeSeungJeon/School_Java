/*
package Day_16;

import java.util.ArrayList;
import java.util.Objects;

*/
/* 제네릭 타입간의 레퍼런스간의 형변환은 허용되지 않는다.
   그 이유는 제네릭 타입들 간에는 상속관계가 성립되지 않기 때문이다.
   만약 허용한다면 자료의 안정성이 깨질 수 있기 때문에 자바 컴파일러가 이를 막는다.
   따라서 자바 컴파일러는 이를 엄격히 제한하며 컴파일 단계에서 오류를 발생시킨다.
 *//*

public class ListEx13 {
    static void main(String[] args) {

        ArrayList<String> fruitList = new ArrayList<>();

        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("orange");

        ArrayList<Object> objList;
        objList = fruitList;

        for (Object obj : objList) {
            System.out.println(obj);
        }
    }
}
*/
