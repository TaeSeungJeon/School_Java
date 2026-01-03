
// 가변 배열(래그드 배열) 또는 래기드 배열)이란?
// 2차원 이상의 다차원 배열을 생성할 때 행의 길이는 고정시키고 각 행의 열의 길이는 지정하지 않고
// 나중에 각각 각 행의 열의 길이를 가변적으로 설정해서 배열을 생성함으로서 고정된 형태 배열이 아닌 
// 각 행의 열의 길이가 유동적인 배열을 말한다.

// 가변 배열 생성 형식)
// int[][] score = new int[5][];		// 행의 길이 5 고정, 각 행열길이 지정않고 가변적 설정

public class ArrayEx15 {

	public static void main(String[] args) {
		final int MAX_ROWS = 5; 							// final 로 선언된 변수는 한번만 초기화할 수 있으면 값의 변경이 불가능하다. 
															// 이러한 변수를 상수라고한다.
															// 상수는 관례적으로 대문자로 설정, 반드시 최초값을 저장하는 초기화 과정을 해야 함.
		int [][] ragged = new int[MAX_ROWS+1][]; 			// 행의 길이 6고정 각 행 열 길이 지정하지않은 가변배열 ragged 생성
		  for(int r = 0; r <= MAX_ROWS; r++) {
			  ragged[r] = new int[r + 1];					// 각 행의 열의 길이(크기)를 생성(첫번째 행의 열 길이 1 | 6번째 행 열의 길이 6)
		  }
		  													// 일반 이중 for 반복문으로 가변배열 원소값 초기화
		  for(int r = 0; r <ragged.length; r++) {			// ragged.length 는 행의 길이 6 반환
			  for(int c = 0; c <ragged[r].length; c++) {	// ragged[r].length 는 각 행의 열의 길이를 반환 (1 부터 6)
				  ragged[r][c] = c;
			  }			  
		  }
		  													// 이중 for 문으로 가변 배열 원소 값 출력
		  for(int r = 0; r < ragged.length; r++) {
			  for(int c = 0; c < ragged[r].length; c++) {
				  System.out.print(" " + ragged[r][c]);
			  }
			  System.out.println();
		  }
	}
}