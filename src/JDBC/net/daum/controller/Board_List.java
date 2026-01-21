package JDBC.net.daum.controller;

import JDBC.net.daum.dao.BoardDAOImpl;
import JDBC.net.daum.dto.BoardDTO;

import java.util.List;

/* 게시판 목록보기 */
public class Board_List {
    public static void main(String[] args) {

        BoardDAOImpl bdao = new BoardDAOImpl();
        List<BoardDTO> blist = bdao.getBoardList();

        System.out.println("####### 게시판 목록 #######");
        System.out.println("번호 \t 글제목 \t 글쓴이 \t 글내용 \t 등록날짜");
        System.out.println("==========================================");

        if (blist != null && blist.size() > 0) {
            for (BoardDTO b : blist) {
                System.out.println(b.getBno() + "\t" + b.getBtitle() + "\t" + b.getBname() +
                        "\t" + b.getBcont() + "\t" + b.getBdate());
            }
        } else {
            System.out.println("게시판 목록이 없습니다!");
        }
    }
}
