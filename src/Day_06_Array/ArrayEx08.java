
// 배열 총 합과 편균을 구하는 소스 예제))

public class ArrayEx08 {

	public static void main(String[] args) {
		
		int sum = 0;	// 배열원소 누적 합
		double avg = 0.0;	// 평균
		
		int[]score = {100, 90, 100, 88, 100};
		
		// 향상된 확장 for 반복문 사용 배열원소 누적 합 구하고, 출력
		for(int k : score) {
			sum += k;		// 총 합
			System.out.print(" " + k);
		}
		System.out.println("\n===================\n");	
		
		avg = (double)sum/score.length;		// 평균
		
		System.out.println("총합= " + sum + " 평균= " + avg);
		
	}
}
