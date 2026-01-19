
// 1. 중첩 switch ~ case 문 사용 예 소스
// 2. 중첩 switch ~ case 문은 실제 프로젝트 개발에 잘 사용안된다. 이유는 가독성이 떨어져 유지보수가 어렵다
//    그러므로 위의 중첩 switch ~ case 문을 중첩 if else if 다중 조건문으로 변경하는 문제

import java.util.Scanner;

public class OperEx14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("샘플 주민번호 입력 (011210-3123456):");
		char juminNo = scan.nextLine().charAt(7);  // 메서드 체이닝 방법을 사용해서 주민번호를 문자열로 입력받아서
		// 뒷자리 첫 단일문자 하나를 구한다.

		switch(juminNo) {
		case '1': case '3':
			switch(juminNo) {
			case '1': System.out.println("당신은 2000년 이전에 태어난 남자입니다."); break;
			case '3': System.out.println("당신은 2000년 이후에 태어난 남자입니다."); break;
			}  // inner switch ~ case
			break;

		case '2': case '4':
			switch(juminNo) {
			case '2': System.out.println("당신은 2000년 이전에 태어난 여자입니다."); break;
			case '4': System.out.println("당신은 2000년 이후에 태어난 여자입니다."); break;
			}  // inner switch ~ case
			break;

		default:System.out.println("유효하지 않은 주민번호입니다.");
		} // outer switch ~ case

		// 문제) 위 중첩 switch ~ case 다중 선택문을 중첩 if else if 다중조건문으로 변경하시오
		//      단 if 조건식 문으로 ||(or 논리합), ==같다 연산만 사용해야한다.


		if(juminNo == '1' || juminNo == '3') {
			if(juminNo =='1') {
				System.out.println("당신은 2000년 이전에 태어난 남자입니다!");
			}else if(juminNo == '3') {
				System.out.println("당신은 2000년 이후에 태어난 남자입니다!");
			} 
		}else if(juminNo == '2' || juminNo == '4') { 
			if(juminNo == '2') {
				System.out.println("당신은 2000년 이전에 태어난 여자입니다!");
			}else if(juminNo == '4') {
				System.out.println("당신은 2000년 이후에 태어난 여자입니다!");
			}
		}else {
			System.out.println("유효하지 않은 주민번호입니다!");
		}
	}
}
