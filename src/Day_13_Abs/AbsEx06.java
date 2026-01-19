package Day_13_Abs;

import net.daum.model01.ShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

public class AbsEx06 {
    public static void main(String[] args) {

        ShapeClass[] arr = new ShapeClass[3];       // 배열크기 3인 arr 객체 배열 생성
        arr[0] = new Circ();    // 업캐
        arr[1] = new Rect();
        arr[2] = new Tria();

        for (int i = 0; i < arr.length; i++) {
            arr[i].draw();
        }

        System.out.println("\n=======================\n");


        for (ShapeClass shapeClass : arr) {         // 향상 확장 for문 (인텔리제이 iter 단축키~)
            shapeClass.draw();
        }
    }
}
