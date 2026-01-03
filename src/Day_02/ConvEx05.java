
  // 자바의 삼향조건 연산자 형식)
  //  조건식? 조건식이 참이면 실행 :   조건식이 거짓이면 실행 ;

import java.util.Scanner;

public class ConvEx05 {
	  // 스캐너로부터 첫번째 정수, 두번째 정수값을 각각 입력받아서 정수숫자로 변경한 뒤 
	  // 다음 삼향조건 연산자로 두 수중 더 큰수를 구하는 실습소스
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		// 이클립스에서 외부 패키지인 java.util 의 Scanner 클래스를
		// 임포트하기 위해 ctrl+shift+o(영문자)를 사용하면 된다
		// Scanner 내장 api 클래스 특징
		// 1. 자바 5(jdk1.5)버전에서 추가된 것으로 텍스트 콘솔모드로부터 입력받은 값을 읽어들일 때 사용
		// 2. System.in 은 키보드 입력장치와 연결 new 키워드로 새로운 객체명 scan 생성
		
		System.out.print("첫번째 정수숫자 입력>>");
		String number1 = scan.nextLine();  //문자열로 읽어들임
		int num1 = Integer.parseInt(number1);  //읽어들인 문자열 parseInt()메서드로 정수숫자로 변경
		
		System.out.print("두번째 정수숫자 입력>>");
		int num2 = Integer.parseInt(scan.nextLine());  // 읽어들인 문자열 숫자를 정수숫자로 변경
		
		int max = (num1 > num2) ? num1: num2;  // 삼향조건연산자 사용
		//System.out.println(num1 + "과" + num2 +"중 더 큰수는 ?" + max);
		System.out.printf("%d 와 %d중 더 큰수는 ? %d \n", num1, num2, max);
		
		
		// ln 이용한 정리본 
		
	    Scanner scan2 = new Scanner(System.in);
	    
	    System.out.print("첫번째 정수숫자 입력>>");
	    int num3 = Integer.parseInt(scan.nextLine());

	    System.out.print("두번째 정수숫자 입력>>");
	    int num4 = Integer.parseInt(scan.nextLine());

	    int max2 = (num3 > num4) ? num3 : num4;

	    System.out.println(num3 + "과 " + num4 + " 중 더 큰 수는? " + max2);
	    
	    // ln 정리예제2
	    
	    Scanner scan3 = new Scanner(System.in);
	    
	    int num01;
	    int num02;
	    int max01;

	    System.out.print("첫번째 정수숫자 입력>>");
	    num01 = Integer.parseInt(scan.nextLine());

	    System.out.print("두번째 정수숫자 입력>>");
	    num02 = Integer.parseInt(scan.nextLine());

	    max01 = (num01 > num02) ? num01 : num02;

	    System.out.println(num01 + "과 " + num02 + " 중 더 큰 수는? " + max01);
	  		

	}

}
