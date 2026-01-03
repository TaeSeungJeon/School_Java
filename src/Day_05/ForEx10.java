
// while, for 무한루프문을 사용한 겨울 음식메뉴 선택 프로그램)
// 다중 반복문을 중단하기 위해서 임의의 이름붙은 레이블명을 지정한다.

import java.util.Scanner;

public class ForEx10 {

	public static void main(String[] args) {
		
		int menuNumber = 0;
		int moneyPrice = 0;
		
		Scanner scan = new Scanner(System.in);
		
		exit_Loop:		// 다중 반복문을 중단하기 위한 임의의 레이블명 지정
			while(true) {
				System.out.println("1- 육계장");
				System.out.println("2- 짬뽕");
				System.out.println("3- 순대국밥");
				System.out.print("원하는 겨울음식 메뉴(1~3)번호를 입력해 주세요.(종료:0)>>");
				
				menuNumber = Integer.parseInt(scan.nextLine());
				
				if(menuNumber == 0) {
					System.out.println("겨울음식 선택 메뉴판을 종료합니다.");
					break;		// 무한루프문 종료
				}else if (!(menuNumber >= 1 && menuNumber <= 3)) {
					System.out.println("잘못된 메뉴번호를 입력했습니다.");
					continue;		// 아래 문장 수행안하고 반복문 처음으로 돌아가서 다음반복
				}
				for(;;) {
					System.out.print("계산할 값 입력: ");
					moneyPrice = Integer. parseInt(scan.nextLine());
					
					if(moneyPrice == 0) {
						break; //		for 무한루프문 종료, 즉 계산 종료
					}
					
					if(moneyPrice == 99) {
						break exit_Loop;
					}
					
					switch(menuNumber) {
						case 1: System.out.println("육계장 값 =" + moneyPrice);
						break;
						
						case 2: System.out.println("짬뽕 값 =" + moneyPrice);
						break;
						
						case 3: System.out.println("순대국밥 =" + moneyPrice);
						break;


					}
				}
			}		// while 무한루프
	}
}
