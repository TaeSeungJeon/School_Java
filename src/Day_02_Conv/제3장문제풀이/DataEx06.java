package 제3장문제풀이;

  // 03장.자료형.pdf No.35쪽 6번문제

public class DataEx06 {

	public static void main(String[] args) {
		
		// 문제수정) 6번 문제는 에러가 발생한다. 에러가 나지 않도록 수정해보고, 에러가 나는 이유에 대해서도 주석문을 달아본다.
		// 덧셈한 결과값은 byte 형 범위를 벗어난다. 벗어난 값도 출력해보고 소스를 수정해서 정상 덧셈 결과값도 출력해본다.
		
		byte b = 127;
		byte c = 126;
		// byte d = b + c; - 오류해결) 4바이트 덧셈 결과값 'int'를 1바이트 크기 'byte'타입 d 변수에 저장하려하니
		//                          값 손실위험이 발생하기 때문에 자동현 변환을 해주지 않는다 
		//                          이런 경우 캐스팅 연산자인(byte)를 사용해서 형변환 하면된다.
		// byte d = (byte)(b+c);
		// System.out.printf("%d + %d = %d\n", b,c,d;    
		// %d 는 십진수 정수 출력형태 지시자, 덧셈결과값 'int'타입을 'byte'형 d 변수에 저장하려니 최대값 범위를 벗어나 값 손실 발생
		// int sum = b + c;
		// Syetem.out.printf("%d + %d = %d \n", b,c,sum);
		int d = b + c;
		
		System.out.println(d);
		
		// 자바는 덧셈연산을 할 때 가장 효율적이고 빠르고 값 손실위험이 없는 4byte 'int'타입으로 
		// byte, short, char 'int'타입으로 자동형 변환을해서 연산수행을 한다.
		// 결국 byte + byte => int + int = int 가 된다.
		// 덧셈 결과값은 'int'타입이다. 
		
			

	}

}
