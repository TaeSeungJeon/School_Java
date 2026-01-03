
// 문제 스캐너를 활용해서 첫번째 정수값, 두번째 정수값을 입력받아서 
// if~else 조건문을 사용해서 최대값과 최소값을 구하는 프로그램을 만들어보시오.

import java.util.Scanner;

public class OperEx04 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수값 >> ");
		int num1 = Integer.parseInt(scan.nextLine());
		
		System.out.print("두번째 정수값 >> ");
		int num2 = scan.nextInt();
		
		int max = 0;
		int min;
		
		if (num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}

		System.out.printf("최대값 = %d \n", max);
		System.out.printf("최소값 = %d \n", min);
		
	}

}
