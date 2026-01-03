

public class ObjEx14 {
    static void change(int[] arr) {
        arr[0] = 10000;
        System.out.println("change() 메서드의 arr[0] = " + arr);
    }
    public static void main(String[] args) {
        int[] x = {100};
        System.out.println("main() 메서드의 x[0] = " + x[0]);

        change(x);
        System.out.println("change() 메서드 호출 후 x[0] =" + x[0]);
    }
}
