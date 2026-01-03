
  // 자바언어에서 + 연산기호 특징)
  // 1. 숫자 + 숫자는 덧셈
  // 2. 숫자 + 문자는 문자를 우선하여 숫자가 문자로 변경.  
  //    그래서 '문자 + 문자'가 되어 연결한다. 여기서는 문자열 연결 연산기호로 사용된다
  
public class ConvEx03 {

	public static void main(String[] args) {

		int a = 7;
		int b = 7;
		int result = a + b;  //숫자 + 숫자
		
		System.out.println(result);
		//System.out.printf("%d + %d = %d \n",a,b,result);
		
		String result2 = a+"7";  // 숫자 + 문자에서 문자를 우선해서 숫자가 문자로 변경된다. 즉, 문자 + 문자인 7 + 7이 됨
		System.out.println(result2);
		//System.out.printf("result02=%s \n, result02);  //%s 는 문자열 출력형태 지시자 -> 문자열 77로 출력
	}

}
