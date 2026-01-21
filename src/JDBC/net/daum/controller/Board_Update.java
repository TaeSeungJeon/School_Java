package JDBC.net.daum.controller;

import JDBC.net.daum.dao.BoardDAOImpl;
import JDBC.net.daum.dto.BoardDTO;

import java.util.Scanner;

/* 게시판 수정
    스캐너로 게시판 번호값을 입력받아서 tbl_board 테이블로 부터 검색한 다음 해당 번호가
    없으면 유효성 검증 경고메시지를 띄우고 있다면 글쓴이, 글제목, 글내용을 입력받아서 번호를 기준으로 수정되게 한다.
*/
public class Board_Update {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BoardDAOImpl bdao = new BoardDAOImpl();

        System.out.println(" ####### 게시판 수정 ####### ");
        System.out.println("=============================");
        System.out.print("게시판 번호 입력: ");

        int bno = Integer.parseInt(sc.nextLine());

        BoardDTO find_bno = bdao.getFindBno(bno);

        if (find_bno == null) {
            System.out.println("해당 게시판 번호가 존재하지 않습니다.");
        } else {
            System.out.print("수정할 글쓴이 입력: ");
            String edit_name = sc.nextLine();

            System.out.print("수정할 글제목 입력: ");
            String edit_title = sc.nextLine();

            System.out.print("수정할 글 내용 입력: ");
            String edit_cont = sc.nextLine();

            BoardDTO eb = new BoardDTO();
            eb.setBno(bno);
            eb.setBname(edit_name);
            eb.setBtitle(edit_title);
            eb.setBcont(edit_cont);

            int re = bdao.updateBoard(eb);

            if (re == 1)
                System.out.println("게시판 수정 성~공 짝짝!");
        }
    }
}
