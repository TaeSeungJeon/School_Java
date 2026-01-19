
// break 문 특징)
// 반복문내에서 break 문을 만나면 해당 반복문을 중단.


public class ForEx03 {

	public static void main(String[] args) {

		int i;
		for( i = 1; i <= 10; i++) { 	// i 를 1로 선언 , i 가 10 작거나 같을 때까지 증감시켜라
			System.out.print("	"+ i); 	// 줄바꿈을 안했기 때문에 가로줄로 출력
		}
		System.out.println("\n=====================\n");				
				
		for (i = 1; i <= 10; i ++) {	 // 위와같은 내용
			if ( i % 4 == 0) {  	// 4로 나눈 나머지값이 0과같을 때 즉, 4의 배수일 때 
				break;
				
			}System.out.println(" " + i);
		}
	}

}
