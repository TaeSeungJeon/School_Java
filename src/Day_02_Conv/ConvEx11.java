
// 자바의 산술/수학 연산자

public class ConvEx11 {

	public static void main(String[] args) {

		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d", a, b, a + b);
		
		int result = a * b;
		System.out.println(a + " * " + b + " = " + result);
		
		result = a/b; 
		System.out.println(a + " / " + b + " = " + result);
				
		result = a%b;
		System.out.println(a + " % " + b + " = " + result);
		
		System.out.println(a/(double)b); 
		// int/double 은 자동 산술법에 의해서 더 큰 타입인 double 실수형으로 자동 형변환이된다.
		// 결국 double/double=double 이 되어서 실수 숫자를 나눗셈하면 그 결과는 하나의 소수점을 포함한 실수 숫자값을 구한다.  
	}

}
