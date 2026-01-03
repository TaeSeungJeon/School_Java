
// for 반복문 안에 continue 문을 사용해서 1부터 10까지 자연수 중에서 4의 배수만 빼고 누적합을 구한다 

public class ForEx08 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		for(i = 1; i <= 10; i++) {
			if(i % 4 == 0) {
				continue;  
			}
		     sum += i;
		}
		 System.out.printf("4의 배수만 제외한 누적합 = %d \n", sum);
    }
}
