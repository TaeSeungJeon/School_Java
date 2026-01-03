package Day_12;
/* 16장. 상속.pdf No.26쪽 4번 문제)
    강의 교안 문제와 UML클래스 다이어 그램을 보고 자바 클래스 설계 자바 코드를 완성해 본다.
 */
class HandPhone05 extends Object{
    protected String model;
    protected String number;

    public HandPhone05(){}

    public HandPhone05(String model, String number) {
        this.model = model;
        this.number = number;
    }
}

class DicaPhone05 extends HandPhone05 {
    protected  String pixel;

    public  DicaPhone05(){}

    public DicaPhone05(String model, String number, String pixel) {
        super(model, number);
        this.pixel = pixel;
    }
    public void prnDicaPhone(){
        System.out.println("모델명 : " + model + ", 폰번호 : " + number + ", 화소수 : " + pixel);
    }
}

public class Ex16_5 {

    public static void main(String[] args) {

        DicaPhone05 dp = new DicaPhone05("아이폰", "010-0000-0000", "2780");
        dp.prnDicaPhone();
    }
}
