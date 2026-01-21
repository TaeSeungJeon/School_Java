package JDBC.net.daum.controller;

/* 게시판 입력폼과 저장)
    스캐너로 게시판 글쓴이, 글제목, 글내용을 입력받아서 BoardDTO 빈클래스에 저장한 다음 BoardDAOImpl로 전달해서
    tbl_board 테이블에 저장되게 한다. 저장 후 반환값은 1을 리턴받아서 if조건문으로 1일때 "게시판 저장에 성공했습니다." 출력
*/

import JDBC.net.daum.dao.BoardDAOImpl;
import JDBC.net.daum.dto.BoardDTO;

import java.util.Scanner;

public class Board_insert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BoardDAOImpl bdao = new BoardDAOImpl();

        System.out.println("####### 게시판 입력 #######");
        System.out.println("----------------------------");

        System.out.print("글쓴이 입력: ");
        String name = sc.nextLine();

        System.out.print("글제목 입력: ");
        String title = sc.nextLine();

        System.out.print("글내용 입력: ");
        String cont = sc.nextLine();

        BoardDTO b =  new BoardDTO();
        b.setBname(name);
        b.setBtitle(title);
        b.setBcont(cont);

        int re = bdao.insertBoard(b);

        if (re == 1)
            System.out.println("게시판 저장에 성공했습니다!");
    }
}
