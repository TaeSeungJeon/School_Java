

class MyDate09{
        int year = 2025;
        int month = 12;
        int date = 22;

    }
    class ReMethod{
        void change(MyDate09 t){
            t.year = 2026; t.month = 1; t.date = 1;
        }
    }

public class ObjEx09 {

    public static void main(String[] args) {
        ReMethod rm = new ReMethod();
        MyDate09 d = new MyDate09();

        System.out.println("change() 메서드 호출 전: " + d.year + "년 " + d.month + "월 " + d.date + "일 ");
        rm.change(d);
        System.out.println("change() 메서드 호출 후: " + d.year + "년 " + d.month + "월 " + d.date + "일 ");
    }

}
