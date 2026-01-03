package Day_12;
// 29쪽
class Base {
    Base() {
        super();
        System.out.println("base");
    }
}
    class Alpha extends Base{


}
public class Ex16_7 {
    public static void main(String[] args) {
        new Alpha();
        new Base();
    }
}
