
  // 문제) java.util 패키지의 스캐너를 활용해서 다음과 같이 "Daejeon" 영문 도시이름을 입력받아서 
  //      맨앞 첫 단일문자를 구한 다음 삼향조건 연산자와 &&(논리곱연산자)등을 사용해서 구한 첫 영문 단일문자가
  //      영문 대문자인지 소문자인지 판별하는 자바 프로그램을 만들어본다.

import java.util.Scanner;

public class ConvEx07 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("\"Daejeon\"영문 도시이름 입력>>"); // \"oooooo\" = 출력 "oooooo"
	String CityName = scan.nextLine();  // 문자열로 입력받음
	char FirstCityName = CityName.charAt(0);  // 영문 도시이름에서 첫 단일문자를 구함
	
	String result = (FirstCityName >= 'A' && FirstCityName <= 'Z') ? "영문 대문자이다." : "영문 소문자이다.";
	
	System.out.println("입력하신 영문도시 이름\'" + CityName + "\' 에서 첫 단일문자인 /'" + FirstCityName + "\'은(는)" + result);
	
	scan.close();
		

	}

}
