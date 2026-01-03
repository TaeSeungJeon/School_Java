
// 1. 자바의 논리 부정 연산자  !
// 2. 삼향조건 연산자에 대한 실습 소스

public class OperEx01 {

	public static void main(String[] args) {  
		
		boolean flag = true;
		
		System.out.printf("flag = %b \n", flag);  // %b 는 true or false boolean 타입 출력형태
		System.out.printf("!true : %b \n", !flag);  // !true -> false
		System.out.printf("!!true : %b \n", !!flag);  // !!true -> !false -> true
		
		// 삼향조건 연산자 실습
		int x,y,z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = (x >= 0) ? x : -x; // 10이 대입 저장
		absY = (y >= 0) ? y : -y; // 5가 대입 저장
		absZ = (z >= 0) ? z : -z; // 0이 대입 저장
		
		signX = (x > 0) ? '+' : ((x == 0) ? ' ' : '-');  // +
		signY = (y > 0) ? '+' : ((y == 0) ? ' ' : '-');  // -
		signZ = (z > 0) ? '+' : ((z == 0) ? ' ' : '-');  // ' '
		
		
		System.out.printf("x = %c%d \n", signX, absX);  // +10
		System.out.printf("y = %c%d \n", signY, absY);  //-5, %c 는 단일문자 출력형태이고 %d 는 십진수 정수 출력형태
		System.out.printf("z = %c%d \n", signZ, absZ);  // 0
		
		
		
		 //println 타입
		  
		  /* boolean flag2 = true;

		    System.out.println("flag = " + flag); 
		    System.out.println("!true : " + !flag);
		    System.out.println("!!true : " + !!flag);

		    // 삼항조건 연산자 실습
		    int x2, y2, z2;
		    int absX2, absY2, absZ2;
		    char signX2, signY2, signZ2;

		    x2 = 10;
		    y2 = -5;
		    z2 = 0;

		    absX = (x2 >= 0) ? x2 : -x2;
		    absY = (y2 >= 0) ? y2 : -y2;
		    absZ = (z2 >= 0) ? z2 : -z2;

		    signX2 = (x2 > 0) ? '+' : ((x2 == 0) ? ' ' : '-');
		    signY2 = (y2 > 0) ? '+' : ((y2 == 0) ? ' ' : '-');
		    signZ2 = (z2 > 0) ? '+' : ((z2 == 0) ? ' ' : '-');

		    System.out.println("x = " + signX + absX);
		    System.out.println("y = " + signY + absY);
		    System.out.println("z = " + signZ + absZ);
		    */
		
		
		
	}

}
