package Day_16;

import java.util.HashSet;
import java.util.Set;

/* java.util 패키지의 set 컬렉션 인터페이스를 구현 상속한 자손 HashSet 컬렉션 클래스 자료구조 특징)
    1. 저장되는 순서를 보장하지 않는다.
    2. 중복 원소값을 허용하지 않는다.
 */
public class ListEx01_HashSet {
    static void main(String[] args) {

        Set set = new HashSet();    // 부모 인터페이스 타입으로 업캐
        set.add("홍길동");           // String이 부모클래스타입인 Object로 업캐 하면서 저장
        set.add(7);                 // int 참조 래퍼타입인 Integer로 오토박싱, 그리고 Integer가 부모타입 Object타입으로 업캐
        set.add("홍길동");           // 중복원소값 허용안함
        set.add(10.3);              // double->Double 오토박싱+Object타입으로 업캐
        set.add(true);

        System.out.println("set컬렉션 원소개수(크기): " + set.size());   //5가 아니고 4 반환
        System.out.println(set);
    }
}
