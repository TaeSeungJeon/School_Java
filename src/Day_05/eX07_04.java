// 각 단이 아래로 출력되지 않고 오른쪽으로 출력되도록 구구단 프로그램을 작성하시오 .(Ex07_04.java 이중 for문 )

public class eX07_04 {

	public static void main(String[] args) {
			int i, j;
			for (j = 1; j <= 9; j++) {
				for( i = 2; i <= 9; i ++) {
					System.out.print(i + "*" + j + "=" + (i*j) + "\t");
				}System.out.println();
			}
	}
}