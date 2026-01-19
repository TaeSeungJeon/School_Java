
// 배열원소 최대값, 최소값 구하기

public class ArrayEx09 {

	public static void main(String[] args) {
		
		int[] javaScore = {94, 99, 100, 90, 95};
		int max = javaScore[0];		// 첫번째 배열원소값을 최대값으로 초기화
		int min = javaScore[0];		// 첫번째 배열원소값을 최소값으로 초기화
		
		// 문제)) 배열의 최대값과 최소값을 구하는 나머지 자바 코드를 완성해본다.
		
		for(int i = 1; i < javaScore.length; i++) {
			if(javaScore[i] > max) {		// 해당 배열원소값이 최대값보다 크면
				max = javaScore[i];			// 해당 배열원소값이 최대값으로 저장
			}else if(javaScore[i] < min) {  // 해당 배열원소값이 최소값보다 작으면
				min = javaScore[i];			// 해당 배열원소값이 최소값으로 저장
		}
	}
		System.out.println("배열의 최소값: " + max);
	   	System.out.println("배열의 최대값: " + min);
  }
}
