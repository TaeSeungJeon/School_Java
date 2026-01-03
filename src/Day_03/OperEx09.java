
// switch ~ case 다중 선택문 실습 소스

import java.util.Scanner;

public class OperEx09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("영문나라 이름 입력(korea):");
		char firstName = scan.nextLine().charAt(0);   // nextLine() 메서드로 문자열로 읽어들인 다음 char At(0) 내장메서드로 첫 단일문자 구함
		                                              // 여기서는 2개의 메서드가 원래 2줄로 되어야하는데 한줄로 코드라인을 줄이면서 연이어 사용
		                                              // 이런 방법을 메서드 체이밍이라고 한다.
	    switch(firstName) {
		case 'k' :
		case 'K' : System.out.println("대한민국"); break;
		case 'c' :
		case 'C' : System.out.println("캐나다"); break;
		case 'j' :
		case 'J' : System.out.println("일본"); break;
		default : System.out.println("해당하는 영문나라 이름이 없습니다.");
		}
	    scan.close();
	}

}
