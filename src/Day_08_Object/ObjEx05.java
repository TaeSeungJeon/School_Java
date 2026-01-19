
// 참조(레퍼런스)변수만 선언하고 객체주소가 저장안되 상태에서 해당 참조변수로는 클래스내의 멤버변수 (속성)에 접근못한다.

class Board05{
    String writer = "홍길동";    // 글쓴이
    String title = "게시판 글제목";    // 글제목
    String content = "게시판 글내용"; //글내용
}

public class ObjEx05 {
		public static void main(String[] args) {

			Board05 board;
			//System.out.println("글쓴이: " + board.writer + "글 제목: " + board.title + ", 글 내용: " +board.content);
			
			board = new Board05();
			System.out.println(board.writer + "," + board.title + "," +board.content);
	}
}
