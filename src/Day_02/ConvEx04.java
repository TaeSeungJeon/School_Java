
  // 자바의 비교(관계) 연산자 종류
  //   1. 비교연산자 결과값은 true or false 인 boolean 타입
  //   2. 비교연산자 종류)
  //       ㄴ > (~보다 크다)
  //       ㄴ < (~보다 작다)
  //       ㄴ >= (~보다 크거나 같다)
  //       ㄴ <= (~보다 작거나 같다)
  //       ㄴ == (같다)
  //       ㄴ != (같지않다)

public class ConvEx04 {

	public static void main(String[] args) {

		boolean flag = false;
		int a = 10; // a = 10, b = 9;
		int b = 9;		
		
		flag = (a>b);
		System.out.println(a + " > " + b + " : " + flag);
		System.out.printf("%d > %d : %b \n", a,b,flag); // true, %b 는 boolean 타입 출력행태 지시자
		
		flag = (a == b);
		System.out.println(a + " == " + b + " : " + flag); // false
		
		flag = (a != b);
		//System.out.println(a + " != " + b + " : " + flag);
		System.out.printf("%d != %d : %b \n", a,b,flag); // true
		
		flag = (a+b) > (a-b);
		System.out.println(flag);  //true
		
		
	}

}
