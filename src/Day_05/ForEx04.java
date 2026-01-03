
// 자바의 이중 for 반복문에서 맨 안쪽 반복문안에 break 문을 사용하면 가장 근접한 안쪽 반복문만 중단하고, 바깥 반복문은 중단 못한다.
// 이런경우 바깥 반복문까지 모두 중단하고 싶을 땐 맨 바깥 반복문위에 임의의 레이블명을 지정하면 된다.
public class ForEx04 {

	public static void main(String[] args) {
		
		int a,i; 
		
		//이중 반복문에서 맨 안쪽 반복문만 중단
		for (a = 1; a <= 5; a++) {
			for (i = 1; i <= 5; i++) {
				if (i % 3 == 0) {		// 3으로 나눈 나머지값이 0 일때 실행
					break;	
				}
			   System.out.print(" i -> " + i); 		// 1 2
			}
			System.out.println("\n a-> " + a);		// 바깥 반복문은 중단 못함
		}
		System.out.println("\n==========================\n");		
		
		
		//이중 반복분 중단 
		
		exit_A:		// 임의의 레이블명 지정
			for ( a = 1; a <=5; a++) {
			    for ( i = 1; i <= 5; i ++) {
			    	if (i % 3 == 0) {
			    		break exit_A;		//이중  for 반복문 모두 중단
			    	}
			    	System.out.print(" i => "+ i);
			    }
			    System.out.println("\n a -> " + a);		// 반복 안함
			}
		System.out.println("\n==========================\n");
		
		
		for( a = 1; a <= 3; a++) {
			System.out.println(">> a -> " + a);
			
			exit_A:		// 중간 for 반복문위에 임의의 레이블 명 지정
				for (int b = 1; b <= 5; b++) {
					for(int c = 1; c <= 9; c++) {
						if (c % 3 == 0) {
							break exit_A;
						}
						System.out.print(" c -> " + c);
					}
					System.out.println("\n b-> " + b);
				}
			//System.out.println("\n << a 반복 계속 >> \n");		//a 반복은 계속됨
		}
		
		
		
	}
}
