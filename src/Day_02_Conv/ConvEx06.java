
  // 자바의 논리연산자 종류
  //  1. 논리연산자 결과값은 boolean 타입인 true or false 이다.
  //  2. 논리연산자 종류)
  //      ㄴ && (논리곱) : 입력값 모두 true 이면 결과값도 true 이다. 나머지는 모두 false
  //      ㄴ || (논리합:or) : 2개의 조건중 하나라도 참이면 결과값도 참. 즉, true . 둘다 false 일때만 결과값은 false
  //      ㄴ |(논리부정:not) : 입력값이 true 이면 결과값은 false, 반대로 입력값이 false 이면 결과값은 true

import java.util.Scanner;

public class ConvEx06 {

	public static void main(String[] args) {
		
		boolean result = false;
		result = (true && true);
		System.out.printf("%b && %b : %b \n", true,true,false);  // true
		
		result = (false || false);
		System.out.println("false || false : " + result); // false
		
		result =!false;  //false 의 반대는 true
		System.out.println("!false : result");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 입력 >>");
		
		int age = Integer.parseInt(scan.nextLine());  // 문자열 숫자로 입력받아서 정수숫자로 변경
		
		String resultAnswer = (age >= 20 && age <= 29)? "20대이다." : "20대가 아니다.";  // 삼향 조건연산자
		
		System.out.println(age + "세는" + resultAnswer);
		

	}

}
