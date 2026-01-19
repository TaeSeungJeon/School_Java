
class Data11{
    int x;
}

public class ObjEx11 {
    static void change(int a) {
        a =1000;
        System.out.println("change() a =" + a);
    }

    public static void main(String[] args) {

        Data11 d = new Data11();
        d.x = 100;
        System.out.println("main() x= " + d.x);

        ObjEx11.change(d.x);
        System.out.println("change()메서드 호출 후 main() x= " +d.x);
    }
}
