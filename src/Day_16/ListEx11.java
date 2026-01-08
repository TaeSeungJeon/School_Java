package Day_16;

import java.util.HashMap;
import java.util.Map;

/* java.util 패키지의 컬렉션 Map 인터페이스를 구현 상속한 자손 컬렉션 클래스 HashMap 특)
    1. Map과 HashMap은 자바 2버전에서 추가됨
    2. 키, 값 쌍으로 저장되는 사적인 컬렉션 자료구조이다. 저장되는 순서는 보장되지 않는다.
    3. 키를 통해서 값을 검색하기 때문에 검색속도가 빠르다.
 */
public class ListEx11 {

    static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();
        // Map<String, Integer> 제네릭만 봐도 뒷부분 제네릭이 무엇인지 추론가능, 자바 7 부터 뒷부분 제네릭 지정 생략가능 <>
        String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "p"};
        // 문자열 배열 크기가 9인 sample 배열 생성, 초기화 | 문자열 키에 포함된 단어 빈도수 계산
        for (String k : sample) {
            Integer freq = hm.get(k);
            hm.put(k, (freq == null) ? 1 : freq + 1);   // 키, 값 쌍으로 저장 -> 키값인 영단어에 대한 빈도수가 계산되어 값 저장
            // hm.compute(k, (key, freq) -> (freq == null) ? 1 : freq + 1);
        }
        System.out.println(hm.size() + "개의 단어가 있다.");
        System.out.println(hm.containsKey("to"));
        System.out.println(hm);
    }
}
