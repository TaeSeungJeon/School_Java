package JDBC.net.daum.controller;

/* 글 번호 기준으로 게시판 삭제 */
// 스캐너로 게시판 번호를 입력받은 다음 해당 테이블로부터 검색해서 번호값이 있다면 삭제되게하고, 없다면 유효성 검증 경고 메시지 띄운다.

import JDBC.net.daum.dao.BoardDAOImpl;
import JDBC.net.daum.dto.BoardDTO;

import java.util.Scanner;

public class Board_Del {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BoardDAOImpl bdao = new BoardDAOImpl();

        System.out.println("####### 게시판 삭제 #######");
        System.out.print("기준이 되는 게시판 번호 입력: ");
        int bno = Integer.parseInt(sc.nextLine());

        BoardDTO db_Bno = bdao.getFindBno(bno);
        if (db_Bno == null) {
            System.out.println("해당 게시판 번호가 없어서 삭제할 수 없습니다.");
        } else {
            bdao.delBoard(bno);
            // 문제) 리턴타입이 없는 delBoard(bno)메서드 작성해본다.
            // 번호를 기준으로 게시물이 삭제되면 성공 -> 야호 성공함!!!
        }
    }
}
