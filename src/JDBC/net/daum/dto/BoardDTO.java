package JDBC.net.daum.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardDTO {     // 중간 데이터 저장빈 클래스 DTO -> tbl_board 테이블의 컬럼명(필드명)과
                            // 일치하는 DTO 빈클래스 멤버변수명 정의

    private int bno;
    private String bname;
    private String btitle;
    private String bcont;
    private String bdate;
}
