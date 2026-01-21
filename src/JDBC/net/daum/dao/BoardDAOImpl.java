package JDBC.net.daum.dao;

import JDBC.net.daum.dto.BoardDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl {
    String driver = "oracle.jdbc.OracleDriver";         //oracle.jdbc.driver는 패키지명, OracleDriver는 오라클 jdbc 드라이버클래스명
    String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; //오라클 접속 주소, 1521은 오라클 연결 네트워크 포트번호
    String user = "week";                               //오라클 접속 사용자
    String password = "week";                                //사용자 비번

    Connection con = null;              //데이터베이스 연결 con
    PreparedStatement pstmt = null;     //쿼리문을 수행할 pstmt
    ResultSet rs = null;                //검색 결과 레코드를 저장할 rs
    String sql = null;                  //쿼리문 저장 변수

    public BoardDAOImpl() {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int insertBoard(BoardDTO b) {
        int re = -1;
        try {
            con = DriverManager.getConnection(url, user, password);
            sql = "insert into tbl_board values(bno_seq.nextval,?,?,?,sysdate)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, b.getBname());
            pstmt.setString(2, b.getBtitle());
            pstmt.setString(3, b.getBcont());

            re = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        try {
            if (pstmt != null) pstmt.close();
            if (rs != null) rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return re;
    }

    public List<BoardDTO> getBoardList() {
        List<BoardDTO> blist = new ArrayList<>();

        try {
            con = DriverManager.getConnection(url, user, password);
            sql = "select * from tbl_board order by bno desc";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                BoardDTO b = new BoardDTO();

                b.setBno(rs.getInt("bno"));
                b.setBtitle(rs.getString("btitle"));
                b.setBname(rs.getString("bname"));
                b.setBcont(rs.getString("bcont"));
                b.setBdate(rs.getString("bdate"));

                blist.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return blist;
    }

    public BoardDTO getFindBno(int bno) {
        BoardDTO b = null;

        try {
            con = DriverManager.getConnection(url, user, password);
            sql = "select * from tbl_board where bno=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, bno);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                b = new BoardDTO();
                b.setBno(rs.getInt("bno"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return b;
    }

    public int updateBoard(BoardDTO eb) {
        int re = -1;
        try {
            con =  DriverManager.getConnection(url, user, password);
            sql = "update tbl_board set bname =?, btitle=?, bcont=? where bno=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, eb.getBname());
            pstmt.setString(2, eb.getBtitle());
            pstmt.setString(3, eb.getBcont());
            pstmt.setInt(4, eb.getBno());

            re = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return re;
    }
    public int delBoard(int bno) {
        int re = -1;
        try {
            con = DriverManager.getConnection(url, user, password);
            sql = "delete from tbl_board where bno=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, bno);
            re = pstmt.executeUpdate();

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return re;
    }

}
