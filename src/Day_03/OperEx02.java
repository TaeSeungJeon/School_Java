
// if 조건문 형식)
//   if(조건식){ 조건식이 참이면 실행; }
//  실행문장이 한줄 이상이면 반드시 {} 중괄호 블록으로 같이 묶어야한다. 하지만 한줄인 경우 {} 블록을 해도되고 안해도된다.

import java.util.Scanner;


public class OperEx02{

	
	// 스캐너로부터 음의 정수를 입력받아서 if 조건문을 활용해 절대값을 구하는 소스



    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("음의 정수 숫자 입력>>");
		int number = Integer.parseInt(scan.nextLine()); // nextLine() 메서드로 문자열로 입력받아서, parseInt() 정적메서드로 정수숫자로 변경
		
		if(number <0) {
			number = -number; //절대값을 구한다.
		}  //if end
		
		System.out.printf("양의 절대값 = %d \n", number);
		
		
	}

}
