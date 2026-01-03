
/*07장. 제어문의 다양한 활용.pdf No.8쪽 3번 문제)
    1. 부터  100사이 짝수를 출력하되 한 줄에 10개씩 출력하시오
       단, 하나는 2씩 증가되면 for 반복문, 또 다른 하나는 if 조건문, %나머지연산 등을 사용한 1씩 증가되는 for 반복문 사용
    
2 4 6 8 10 12 14 16 18 20
22
24 26 28 30 32 34 36 38 40
42
44 46 48 50 52 54 56 58 60
62
64 66 68 70 72 74 76 78 80
82
84 86 88 90 92 94 96 98 100
 */

public class Ex07_03 {

	public static void main(String[] args) {
		int i = 0;
		int count = 0;
		
		for(i = 1; i <= 100; i++) {
			if( i % 2 == 0) {
				System.out.print(i+" ");
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
				
			}
				
		}
		
		
		System.out.println("\n=====================\n");
		
		count = 0;
		
		for(i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
			count++;
			if (count %10 == 0) {
				System.out.println();	
			}
			
		}

	}

}

