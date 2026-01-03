
// 06장. 반복문.pdf No.21쪽 4번 문제)
// A부터 Z까지의 알파벳 출력하는 자바 프로그램을 작성해본다.
// (단, 하나는 for 반복문과 int 타입을 사용해야하고, 
// 또 다른 하나는 for 반복문과 char 타입을 사용해야한다.
// 자바에서 증감연산자 (++,--)는 자료 손실이 없는 더 큰 타입으로 자동 형변환하는 자동 산술법이 적용되지 않는다.

public class Ex06_04 {
	public static void main(String[] args) {
		
		// int 타입
		for (int i = 65; i <= 90; i++) {
			System.out.print((char)i+" ");
		}		
		System.out.println("================");
		
		// char 타입
		for(char a= 'A'; a <= 'Z'; a++) {
			System.out.print(a+" ");
		}
		
	}

}
