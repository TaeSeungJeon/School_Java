package Day_09;
// this 키워드를 사용하는 이유)
//  1. 메서드(생성자){} 중괄호 블록내에서 클래스 소속의 멤버 변수 중 인스턴스 변수와 생성자나 메서드 소속의 매개변수명이 같을 때
//      자바는 어느것이 인스턴스 변수인지 매개 변수인지 구분을 못해서 값이 저장되지 않는다.
//      이를 해결 하기위해 왼쪽의 인스턴스 변수명 앞에 this. 를 붙임으로서 클래스 소속의 인스턴스 변수라는걸 알려주면 구분되어져 저장됨.
//  2. 여기서 this. 를 인스턴스 변수명 앞에 붙이지 않아서 값이 저장안되는 경우에 대해서 알아본다.

class MyDate07 {
    private int year;
    private int month;
    private int date;   // 멤버 변수 중 인스턴스 변수 (속성) 3개 정의

    public  MyDate07() { }      //기본 생성자

    public MyDate07(int year, int month, int date) {
        /*this.*/year = year;
        this.month = month;
        this.date = date;
    }   // 생성자 오버로딩
    public void pr() {
        System.out.println(year + "년 " + month + "월 " + date + "일 ");
    }
}

public class ClassEx07 {
    public static void main(String[] args) {
        MyDate07 md = new MyDate07(2025, 12, 23);
        md.pr();
    }
}
