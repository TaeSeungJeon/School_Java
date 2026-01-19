package Day_16_List;

import java.util.ArrayList;
import java.util.List;

/* java.util 패키지의 List 컬렉션 인터페이스 구현 상속한 자손 ArrayList 컬렉션 클래스 특징)
    1. 저장되는 순서를 보장한다.
    2. 중복원소값을 허용한다.
    3. 실제 자바 프로젝트 개발에서 가장 사용빈도가 높다.
    4. 복수개의 원소값을 동시 저장 가능하고 가변적 크기이다.
    5. 배열주소 인덱스 번호처럼 0부터 시작한다. 복수개의 자료형을 동시 저장할 수 있다.
 */
public class ListEx02_ArrayList {
    static void main(String[] args) {

        List list = new ArrayList();    // 부모 인터페이스 타입 업캐

        list.add(100);      // 기본타입 int 참조 래퍼타입 Integer로 오토박싱 + Integer가 부모타입 Object로 업캐
        list.add(100);      // 오토박싱, 업캐, 중복허용
        list.add("대전시");  // 업캐
        list.add(10.7);     // 오토박싱, 업캐
        list.add(false);     // 오토박싱, 업캐

        System.out.println("list컬렉션 원소개수: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
