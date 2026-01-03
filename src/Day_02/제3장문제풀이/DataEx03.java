package 제3장문제풀이;

  // 03장. 자료형. pdf No.33쪽 문제

public class DataEx03 {

	public static void main(String[] args) {

		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
		
		var4 = var1;  // 1바이트 크기가 8바이트 long 타입으로 암시적 자동형 변환
		System.out.println(var1 + ", " + var2);
		
		var1 = (byte)var3;  // 4바이트가 1바이트로 크기가 줄어들 때 자료손실 위험때문에 자바는 자동 형변환을 해주지 않기 때문에
		                    // (byte) 캐스팅 형변환 연산자를 사용해서 명시적인 형변환을 해야함.
		                    // 저장되는 값이 byte 형 최대값 범위를 벗어나서 최소값이 저장됨.
		System.out.println(var1 + ", " + var3);
		
		float var5 = 123456.789123f;
		double var6 = 123456.789123;
		
		var5 = (float)var6;
		System.out.println(var5 + ", " + var6); // 출력되는 float 타입 변수값은 정밀도가 7자리라 소수점이하 잘려서 출력
		
		var6 = var5;
		System.out.println("var5= " + var5 + ",var06= " + var6);
		
		
		//=================================
		
		  //No.34쪽 5번 문제풀이
		
		  // int false; - false는 키워드(예약어) 이기 때문에, 예약어는 변수명으로 사용불가.
		  // double default; - default도 키워드이기 때문에, 변수명으로 사용불가.
		
		String _object;
		  //String a-class; - 변수명에 ' - '를 포함할 수 없기 때문에 에러발생
		
		
	}

}
