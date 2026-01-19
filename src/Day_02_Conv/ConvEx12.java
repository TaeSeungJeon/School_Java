
public class ConvEx12 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);
		// 자동산술법에 의해서 byte 형이 int 타입으로 형변환이 된다. 결국 byte + byte -> int + int = int 가 된다.
		// 덧셈 결과값은 4바이트 int 이다. 이것을 1바이트 크기인 byte형 변수 c에 저장하려고할 때 캐스팅 연산자인 (byte)로 명시적 형변환 해야한다.

		System.out.println(a + " + " + b + " = " + c);
		
		int d = a + b;
		System.out.printf(" %d + %d = %d \n ", a, b, d);
		
		b = 30;
		c = (byte)(a * b);
		System.out.println(a + " * " + b + " = " + c);
		// 곱셈 결과값은 byte 형 범위를 벗어나서 자료손실 발생
		
		d = a * b;
		System.out.printf(" %d * %d = %d \n", a, b, d);
		
		// 아래는 ln 코드
		d = a * b;
		System.out.println(" " + a + " * " + b + " = " + d);
	
	
	}

}
