
// 07장. 제어문의 다양한 활용.pdf No8쪽 1번 문제)
// 22부터 76까지의 짝수의 개수와 그 합을 구하는 자바프로그램을 작성하시오 
// 짝수의 갯수 -> 28
// 그 합-> 1372

// 힌트 = 짝수의 개수를 구할때 ++ 증감 연산자 활용
// 단, 2씩 증가된 for 반복문과 1씩 증가된 for 반복문을 각각 사용한다.

public class Ex07_01 {

	public static void main(String[] args) {
		
		int i; 
		int count, sum;
		
		count = 0;       // 갯수 구할때 변수 갯수구할때 갯수구할 때 사용 갯수구할때 count 갯수구할때count사용 
		sum = 0;
		
		// i = 22 24 26 28 30 32 ----
		for(i = 22; i<=76; i++) {
			if (i % 2 == 0) { // 짝수 만들기
				count++; // 짝수 갯수 카운트
				sum += i;
			}
		}
		System.out.println(count);  // 짝수들의 갯수
		System.out.print(sum);  //짝수들 누적 합
		
		
		
		System.out.println("\n=====================\n");
		
		
		
		for(i = 22, count = 0, sum = 0; i <= 76; i++) {
			if (!( i% 2 == 1)) {
				count++;
				sum += i;
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}
}
