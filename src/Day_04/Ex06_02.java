
// 06장. 반복문.pdf No.19쪽 2번문제)
// 1부터 입력받은 숫자값 까지의 홀수를 출력하는 자바 프로그램을 작성해본다.
// (단, 하나는 for 반복문에서 1씩 증가하면서 if 조건문과 % 나머지 연산, ==비교연산을 사용해야하고, 
// 나머지 하나 for 반복문은 2씩 증가하면 된다.
import java.util.Scanner;

public class Ex06_02 {
	public static void main(String[] args) {
/*
        int num = 10;   

        for(int i = 1; i <= num; i++) {
            if(i % 2 == 1) {				  // 홀수인지 확인
                System.out.print(i + " ");
            }
        }
    }
}


*/
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력: ");
		int num = Integer.parseInt(scan.nextLine());

		int i;
		
		for(i = 1; i <= num; i++) {
			if(i % 2 == 1) {                // 홀수 판별

				System.out.print(i + " ");
			}
		}
		
		System.out.println("========================");
		
		for(i = 1; i <= num; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
}