package Day_16;
/* java.util 패키지의 Map 컬렉션 인터페이스를 구현 상속한 자손 컬렉션 클래스 Hashtable 특)
    1. 키, 값 쌍으로 저장되는 사전적인 컬렉션 자료 구조이다.
    2. 키를 통해서 값을 검색하기 때문에 검색 속도가 빠르다.
    3. 저장된 순서를 보장하지 않는다.
    4. Hashtable 컬렉션 클래스는 jdk 1.0 버전에서 추가, Map 컬렉션 부모 인터페이스 jdk 1.2 버전 추가
 */

import java.util.Enumeration;
import java.util.Hashtable;

public class ListEx10 {
    static void main(String[] args) {

        Hashtable<String, String> fruitHt = new Hashtable <String,String>();

        fruitHt.put("apple", "사과");
        fruitHt.put("orange", "오렌지");
        fruitHt.put("grape", "포도");

        String value = fruitHt.get("apple");
        if (value != null) {
            System.out.println("apple: " + value);
        }

        Enumeration<String> enum2 = fruitHt.keys(); // keys() 메서드는 모든 키에 대한 Enumeration반환

        while (enum2.hasMoreElements()) {   // 읽을 수 있는 요소가 있다면 참
            String k = enum2.nextElement(); // 다음 키를 가져옴
            String v = fruitHt.get(k);      // 키에 대한 값을 구함
            System.out.println(k + " : " + v); // 키, 값 출력
        }
    }
}
