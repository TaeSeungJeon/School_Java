package Day_16;

import java.util.ArrayList;
import java.util.List;

/*  컬렉션에서 제네릭이 나온 배경에대해서 알아볼 수 있는 예)
     1. <제네릭타입>은 기본타입으로 지정할 수 없고, 참조 레퍼런스 타입으로 지정해야 한다.
        <제네릭타입>은 자바 5버전에서 추가됨.
     2. 제네릭 타입을 지정하면 지정한 자료형으로만 저장 가능.
     3. 제네릭 타입을 지정하지 않으면 불필요한 레퍼런스간의 형 변환인 업캐, 다캐를 해야한다.
        프로그램 실행 속도가 떨어지고, 코드가 복잡해져서 가독성이 떨어짐과, 원하는 자료 추출이 어렵고, 안정성이 떨어진다.
 */
public class ListEx08 {

    static void main(String[] args) {

        List nameList = new ArrayList();    // 제네릭 타입을 지정하지 않은 상태에서 컬렉션객체 nameList를 업캐

        nameList.add("Hong");  //Object타입으로 업캐 하면서 지정
        nameList.add("Lee");
        nameList.add("Kang");

        String name = null;

        for (int i = 0; i < nameList.size(); i++) { // size() 메서드는 컬렉션 원소개수 반환 -> 1부터 카운터
                                                    // List 계열 컬렉션 주소 인덱스 번호는 배열처럼 0부터 시작
            if (nameList.get(i) instanceof String) { // 다캐 가능 ? 참 !
                name = (String) nameList.get(i);     // 명시적 다캐
            }
            System.out.println("영문 이름을 영대문자로 변경: " + name.toUpperCase());
        }
    }
}
