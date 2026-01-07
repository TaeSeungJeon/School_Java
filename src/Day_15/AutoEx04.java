package Day_15;
// Object 내장 메서드 중 하나인 equals()를 자손에서 오버라이딩을 한 경우)

class Point04 extends Object {
    int a, b;

    public Point04(){}

    public Point04(int a, int b) {
        this.a = a;
        this.b = b;
    }// 생성자 오버로딩

    @Override
    public boolean equals(Object obj) {
        Point04 pt = null;

        if (obj instanceof Point04) { // 다캐 가능 ?
            pt = (Point04) obj; // 명시적 다캐
        }
        if ((a == pt.a) && (b == pt.b)) {
             return true;
        }else{
            return false;
        }
    }
}

public class AutoEx04 {
    static void main(String[] args) {

        Point04 pt01 = new Point04(100, 200);
        Point04 pt02 = new Point04(100, 200);

        if (pt01 == pt02) {
            System.out.println("같다.");
        } else {
            System.out.println("다르다.");
        }
        if (pt01.equals(pt02)) {
            System.out.println("값이 같다.");
        } else {
            System.out.println("값이 다르다.");
        }
    }
}
