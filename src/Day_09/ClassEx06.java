package Day_09;

class GuestBook06 {
    String writer;      // 글쓴이
    String title;       // 제목

    // 생성자를 오버로딩해서 기본생성자 묵시적 제공 안함
    public GuestBook06(String new_write, String new_title) {
        writer = new_write;
        title = new_title;
    }

    public void pr() {
        System.out.println("방명록 근쓴이: " + writer + ", 방명록 제목: " + title);
    }
}       //방명록 클래스

public class ClassEx06 {
    public static void main(String[] args) {

        GuestBook06 guest = new GuestBook06("고길동", "고고길동동");  //new GuestBook06(); 에 의해 묵시적으로 제공하지 않는 기본생성자를 호출하려다가 에러
        guest.pr();

        GuestBook06 guest02 = new GuestBook06("홍길동", "방명록 제목입니다. ");    // 매개변수 2개짜리 오버로딩 된 생성자 호출
        guest.pr();
    }
}
