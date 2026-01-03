package net;
//net.daum.dto 패키지의 데이터 저장빈 클래서 MemberDTO.java를 임포트해서 사용

import net.daum.dto.MemberDTO;

public class MemberMain {
    public static void main(String[] args) {
        MemberDTO member = new MemberDTO();

        member.setMem_id("kkkkk");
        member.setMem_phone("010-9999-9999");
        member.setMem_name("홍길동");
        member.setMem_email("kkkkk@daum.net");
        member.setMem_addr("대전시");

        System.out.printf("아이디 : %s \n", member.getMem_id());
        System.out.printf("회원이름 : %s \n", member.getMem_name());
        System.out.printf("이메일 : %s \n", member.getMem_email());
        System.out.printf("폰번호 : %s \n", member.getMem_phone());
        System.out.printf("집주소 : %s \n", member.getMem_addr());
    }
}
