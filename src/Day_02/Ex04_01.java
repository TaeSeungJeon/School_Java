
// 04장. 연산자.pdf No.22 쪽 1번 문제 -> 삼항 조건연산자 사용

import java.util.Scanner;

public class Ex04_01 {

	public static void main(String[] args) {
		
		 int num1= 7, num2 =8;
		 String result = "";
		 
		 result = (num1 % 2 == 0)? "짝수" : "홀수";
		 System.out.println(num1 + "은 " + result + "이다");
		 
		 result = (num2 % 2 == 1)? "홀수" : "짝수";
		 System.out.println(num2 + "은 " + result + "이다");
		
		
		
		// [gpt답안]
		/*Scanner scan = new Scanner(System.in);

	        System.out.print("정수를 입력하세요 >> ");
	        int num = scan.nextInt();

	        String result = (num % 2 == 0)? "짝수이다" : "홀수이다";

	        System.out.println(num + "은(는) " + result);
	      */ 
	}

}
