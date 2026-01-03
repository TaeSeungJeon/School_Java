
// switch ~case 다중 선택문을 활용해서 주민번호 뒷자리 첫번째 단일문자 번호를 구한값이 1, 3인 경우는 남자
// 2 또는 4인 경우는 여자를 구하는 실습 소스

import java.util.Scanner;

public class OperEx13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("샘플 주민번호 입력(011210-312456): ");
		String juminNumber = scan.nextLine();  //문자열로 입력받는다
		char juminNo = juminNumber.charAt(7);  
					// charAt(7) 내장메서드는 첫번째 주민번호를 0부터 카운터해서 7에 해당하는 8번째 주민번호 뒷자리 첫 단일문자 번호 하나를 구함 
		switch(juminNo) {				
		 case '1': case '3': System.out.println("당신은 남자입니다."); break; 
		 case '2': case '4': System.out.println("당신은 여자입니다."); break;
		 default: System.out.println("유효하지 않은 주민번호입니다.");
		} // <- switch ~ case 문 닫음

	}
}
