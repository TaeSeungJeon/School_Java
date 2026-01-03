
// 10 장. 메서드 No.10 쪽 1번, 2번 문제
import java.util.Scanner;
public class ArrEx05 {
		static void name_print(String name) {
			System.out.print(name);
		}
		
	public static void main(String[] args) {
		// 1번 문제) Scanner 로 부터 자기 자신 성과 이름을 입력받아서 매개변수 인자값으로 전달해서 출력하는 다음과같은 정적 메서드를 정의하라
		//   		static void name_print(String name){
		//			}

		Scanner scan = new Scanner(System.in); 
		System.out.print("성을 입력하세요");
		String f_name = scan.nextLine();
		System.out.println("이름을 입력하세요");
		String l_name = scan.nextLine();
		
		ArrEx05.name_print(f_name);
		name_print(l_name);
		
		System.out.println();
	
		
		// 2번 문제) 스캐너로 부터 입력받은 정수 숫자를 정적 메서드 인자값으로 전달해서 해당 숫자 구구단을 구하는 다음과 같은 정적메서드를 별도로 만들어 본다.
		//  		static void gu(int guguDan){ 메서드 실행문장으로 if else 조건문을 사용해서 2부터 9사이 숫자가 아닌 경우는 
		//			'2부터 9사이 정수숫자만 입력하세요' 라는 유효성 검증 경고메시지(validate)를 띄우고 2~9사이 정수 숫자를 입력한 경우는 해당 숫자 구구단을 구해라
		//			단, 구구한 제목도 출력하고 구구단을 구할 땐 for 반복문 사용
		System.out.print("구할 구구단 숫자만 입력(2 ~ 9): ");
		
		gu(Integer.parseInt(scan.nextLine()));
	}
	
	static void gu(int gugudan) {
		if(!(gugudan >= 2 && gugudan <= 9)) {
			System.out.println("2부터 9사이 정수숫자만 입력하세요");		    
		}else {
			System.out.println("구구단" + gugudan + "단 입니다");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d \n",gugudan,i,gugudan*i);
			}
		}
	}
}