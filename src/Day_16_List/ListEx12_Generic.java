package Day_16_List;
/* 제네릭 클래스
 */

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class GenericClass<T> {
    private T value;

    // 상단 롬복 Setter, Getter 해도 됨 아직 안보이면 코드 이해가 안되니 작성해놓음
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class ListEx12_Generic {
    static void main(String[] args) {

        GenericClass<Integer> obj01 = new GenericClass<Integer>();

        obj01.setValue(100);
        System.out.println("반환된 정수숫자 값 = " + obj01.getValue());

        GenericClass<Boolean> obj02 = new GenericClass<>();
        obj02.setValue(true);
        System.out.println("반환되는 boolean 타입 = " + obj02.getValue());

        GenericClass<Double> obj03 = new GenericClass<Double>();
        obj03.setValue(100.7);
        System.out.println("반환되는 실수 숫자 값 = " + obj03.getValue());

    }
}
