package net.daum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data                   // 기본 생성자, canEqual(), equals(), setter(), getter(), hashCode(), toString() 메서드 자동생성
@AllArgsConstructor     // Constructor는 생성자란 뜻이고, @AllArgsConstructor 애노테이션을 사용하면
                        // 기본생성자는 사라지고, 멤버변수(인스턴스 변수:속성) 개수만큼 매개변수를 가진 생성자가 오버로딩한다.
public class GuestBookDTO {     //방명록 데이터 저장빈 클래스

    private String writer;
    private String title;
    private String content;
}

// 롬복 확인하는 법 alt + 7