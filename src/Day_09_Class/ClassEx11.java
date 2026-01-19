package Day_09_Class;
// this() 에 의해 같은 클래스내에서 오버로딩 된 다른 생성자를 호출해본다

class Car11{
    String color;
    String gearType;
    int door;

    Car11(){
        this("white", "auto", 4); // 같은 클래스 내에서 매개변수 3개짜리 오버로딩 된 생성자 호출
    }

    Car11(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    void print(){
        System.out.println("차 색상: " + color + ", 변속기 종류: " + gearType + ", 차 문 개수: " + door);
    }
}

public class ClassEx11 {
    public static void main(String[] args) {
        Car11 car = new Car11();
        car.print();
    }
}
