
// 06장. 반복문.pdf No.20쪽 3번 문제)
// 10부터 1사이의 짝수를 10,8,6,4,2 로 출력하는 자바 프로그램을 만들어본다.



public class Ex06_03 {

	public static void main(String[] args) {
		
		int i = 10;
		while (i > 2) {
			System.out.print(i + ",");
			i-=2;
		}
		System.out.println(i);
		
		
		System.out.println("=======================");
		i = 10;
		while (i >= 2) {
			System.out.print(i);
			
			if (i > 2) {
				System.out.print(",");
			}
			i = i -2;
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* int num = 10;   

	        while(num >= 1) {
	            if(num % 2 == 0) {            // 짝수 판별
	                System.out.print(num + " ");
	            }
	            num--;  // 1씩 감소
	        }
	    }
	}*/
