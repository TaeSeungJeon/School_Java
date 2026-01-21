package JDBC.net.daum.controller;

/*
   스캐너로 부터 고객번호를 입력받아서 오라클 DB로 부터 검색한 다음 해당 고객번호가 있는 경우 고객번호를 기준으로
   customer테이블로 부터 해당 고객정보 레코드를 삭제되게하고, 없다면 유효성 검증 경고 메시지를 띄운다.
*/

import JDBC.net.daum.dao.CustomerDAOImpl;
import JDBC.net.daum.dto.CustomerDTO;

import java.util.Scanner;

public class Customer_Del01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        CustomerDAOImpl cdao = new CustomerDAOImpl();
        System.out.println(" ##### 고객 정보 삭제 ##### ");
        System.out.print("검색할 고객번호 입력");
        int cus_no = Integer.parseInt(scan.nextLine());

        CustomerDTO db_CusNo = cdao. getFindCusNo(cus_no);

        if (db_CusNo == null) {
            System.out.println("해당 고객번호가 없어서 삭제 못합니다! 올바른 고객번호를 입력하세요!");
        } else {
            int result = cdao.delCustomer(cus_no);

            if (result == 1)
                System.out.println("고객번호 삭제 성공!~");
        }
    }
}
