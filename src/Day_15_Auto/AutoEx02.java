package Day_15_Auto;

class Point02 extends Object {

    int x, y;

    public Point02(){}

    public Point02(int x, int y) {      // 매개변수 타입을 다르게 한 생성자 오버로딩
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return ("x 좌표값= " + x + ", y 좌표값= " + y);
    }
}

public class AutoEx02 {
    static void main(String[] args) {
        Point02 pt02 = new Point02(100, 200);
        System.out.println(pt02.toString());
        System.out.println(pt02);
    }
}
