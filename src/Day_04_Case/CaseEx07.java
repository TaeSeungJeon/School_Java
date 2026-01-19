
// 스캐너를 활용한 이중 for 반복문 실습소스)

import java.util.Scanner;

public class CaseEx07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("$특수문자를 출력할 라인행 줄수를 입력: ");
		int lineNumber = Integer.parseInt(scan.nextLine());
		
				/* 문제 : 이중 for 반복문을 사용해서 $를 다음과 같이 출력되게 하는 코드를 생성하시오
				 * $
				 * $ $
				 * $ $ $
				 */
		for (int i = 1; i <= lineNumber ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		scan.close();
	}
}
