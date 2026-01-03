
/* do-while 반복문 사용 예)
 *   mate.random() 내장메서드는 0.0 이상 1.0 미만의 사이의 실수 숫자 난수를 발생시킨다. 
 *   이를 활용하여 1부터 100 사이 임의의 정수숫자 난수를 발생시키고, 
 *   사용자로부터 1부터 100사이의 임의의 정수숫자를 입려받아서 이를 맞추는 실습 소스
 */
import java.util.Scanner;
public class CaseEx12 {
	
	public static void main(String[] args) {
		
		int number = 0;
		int answer = (int)(Math.random() * 100) + 1;		// random() 메서드는 0.0이상 1.0미만의 사이의 실수 숫자 난수를 발생시킨다
															// -> 여기에 *100하면 0.0이상 100.0미만 사이의 실수숫자 난수 발생
															// -> (int)로 캐스팅 형변환하면 소수점 이하는 버리고 정수숫자만 구함.
															// -> 즉, 0이상 100 미만 사이의 정수숫자 난수발생
															// -> +1하면 1이상 101미만 사이 정수숫자 난수구함. 결국 1부터 100사이 임의의 정수숫자 난수 구함
        Scanner scan = new Scanner(System.in);
        
        do {
        	System.out.print("1~100t 사이의 임의의 정수숫자 입력: ");
        	number = Integer.parseInt(scan.nextLine());
        	
        	if(number > answer) {
        		System.out.println("더 작은 숫자를 입력하세요");
        	}else if(number < answer) {
        		System.out.println("더 큰 숫자를 입력하세요");
        	}
        }while(number != answer);
        System.out.println("정답 숫자는: " + number + " 입니다.");
	}

}
