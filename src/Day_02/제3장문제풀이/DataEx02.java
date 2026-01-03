package 제3장문제풀이;

// 03장. 자료형.pdf No.32쪽 2번문제

public class DataEx02 {

	public static void main(String[] args) {

		
		byte var1 = -128;
		    // 틀린 예제 byte var1 = 128; - byte 형 최대값 범위를 벗어남 
	   	    // '-128 ~ 127'까지가 byte 범위
		
		short var2 = 128;
		
		long var4 = 128L;
		
	    int var04 = 28; 
	        // 틀린 예제 int var04 = 28L;
	        //int 타입으로 선언된 변수에 저장되는 값에는 접미사 L or l을 붙이지 않는다
	    
		float var5 = 123456.789123f;
		    // 틀린 예제 float var5 = 123456.789123; - float 형은 끝에 접미사 'f'가 붙어야함
		
		double var6 = 123456.789123;
		    // double 은 실수 숫자값 뒤에 접미가 'd'가 생략됨 ( 'double'은 자바의 실수숫자 기본타입이기 때문이다.)
		
		    // *** 자주 사용하는건 int, double, long *** //
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}

}
