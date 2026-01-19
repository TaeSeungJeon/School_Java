
  //자바의 수학 산술연산자 종류 
  // + 덧셈
  // - 뺄셈
  // * 곱셈
  // / 나눗셈 (정수 나눗셈하면 소수점 버려진 몫만 구함, 두 실수를 나눗셈하면 하나의 실수값을 구함)
  // % 나머지

public class ConvEx02 {

	public static void main(String[] args) {

		int a = 10;
		int b = 4;
		int result = 0;  // int a = 10, b = 4, result = 0;
		
		result = a + b;
		System.out.println(a + " + "+ b + " = " + result);
		
		result = a - b;
		System.out.println(a + " - "+ b + " = " + result);
		
		result = a * b;
		System.out.println(a + " * "+ b + " = " + result);
		
		System.out.println(a + " / "+ b + " = " + (a/b));
		
		result = a % b;
		System.out.println(a + " % "+ b + " = " + result);
				
		double c = (double)a/b;   // 자동 산술법에 의해서 double/double 이 된다. 
							      //결국 실수숫자값을 나눗셈하면 하나의 실수숫자값 2.5를 구한다.
		System.out.println("10.0 / 4.0 =" + c);
		
	}

}
