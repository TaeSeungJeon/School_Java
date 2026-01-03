package Day_09;
// 생성자 또는 메서느 {} 블록내에서 클래스 소속의 멤버변수 중 인스턴스 변수와 생성자나 메서드 소속의 매개변수명이 동일할 때
// 인스턴스 변수명 앞에 this. 를 붙이면 구분이 되어져서 값이 저장 됨.

import org.w3c.dom.ls.LSOutput;

class Board08 {
    private String name;
    private String title;
    private String content;

    public Board08(){ }     // 매게변수 없는 기본 생성자

    public Board08(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }
    public void print(){
        System.out.println("글쓴이: " + name + ", 제목: " + title + ", 내용: " + content);
    }
}

public class ClassEx08 {
    public static void main(String[] args) {

        Board08 board = new Board08("홍","게시판 제목","게시판 내용");
        board.print();
    }
}
