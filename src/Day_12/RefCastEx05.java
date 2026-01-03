package Day_12;
// instanceof 형변환(레퍼런스간의 업캐스팅과 다운캐스팅) 유무 판단 연산자
class Phone06 extends Object{
    protected String model;
    protected String number;

    public Phone06() {}

    public Phone06(String model, String number) {
        this.model = model;
        this.number = number;
    }
}
class DicaPhone06 extends Phone06{
    protected String pixel;

    public DicaPhone06(){}

    public DicaPhone06(String model, String number, String pixel) {
        super(model,number);    // 부모 매개변수 2개짜리 오버로딩 된 생성자 호출
        this.pixel = pixel;
    }
    public void printDicaPhone(){
        System.out.println("폰 모델명: " + model + ", 폰번호" + number + ", 화소수" + pixel);
    }
}

public class RefCastEx05 {
    public static void main(String[] args) {
        DicaPhone06 dp = new DicaPhone06("아이폰", "010-0000-0000", "2056");
        dp.printDicaPhone();

        if (dp instanceof Phone06) {    // dp는 Phon06 부모타입으로 업캐 가능한가? = 참
            Phone06 hp = dp;
            System.out.println("업캐스팅 가능");
        }else{
            System.out.println("업캐스팅 불가능");
        }
        System.out.println("\n=======================>\n");

        Phone06 hp = new Phone06();
        if (hp instanceof DicaPhone06) { // 가능한가? = 거짓
            DicaPhone06 dp6 = (DicaPhone06) hp; //명시적인 다운캐스팅 -> 사전에 업캐 안해서 캐스팅 연산 예외 오류
            System.out.println("다운캐스팅 가능");
        }else{
            System.out.println("사전에 업캐를 하지않아서 명시적인 다운캐 불가능");
        }
    }
}
