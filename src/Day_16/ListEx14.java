package Day_16;
/* 제네릭 타입간의 레퍼런스 형변환은 제네릭 와일드카드 문법을 사용하면 제한적으로 허용된다.
 */

import java.util.ArrayList;
import java.util.Objects;

public class ListEx14 {
    static void main(String[] args) {

        ArrayList<String> citiList = new ArrayList<String>();

        citiList.add("seoul");
        citiList.add("daegu");
        citiList.add("busan");

        ArrayList<? extends Object> objList;
        // <? extends Object> 제네릭 타입간의 형변환 와일드 카드 문법 특)
        // Object 을 상속한 자손은 제네릭 타입간의 형변환을 제한적으로 허용. (상한 제한 와일드 카드)
        objList = citiList;

        for (Object obj : objList) {
            System.out.println(obj);
        }
    }
}
