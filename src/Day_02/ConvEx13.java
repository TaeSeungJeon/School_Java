
//char 단일문자 타입 값은 십진수 정수로 저장된다. 이를 활용한 예제소스

public class ConvEx13 {

	public static void main(String[] args) {
		
		char a = 'a';   // 'a'는 십진수 정수 97
		char d = 'd';   // 'd'는 십진수 정수 100
		char zero = '0';   // '0'은 십진수 정수 48
		char two = '2';   // '2'는 십진수 정수 50
		
		System.out.printf(" '%c' - '%c' = %d \n", d, a, d - a);   // %c 는 단일문자 출력형태, 100 - 97 =3
		System.out.printf(" '%c' - '%c' = %d \n", two, zero, two - zero);   // 50 - 48 = 2
		
		//문제 ) 영문소문자 단일문자 'a'를 영문 대문자 'A'로 변환하는 프로그램을 만들어본다
		//힌트 ) 단일문자에 해당하는 십진수 정수값을 활용
		
	    char lowerChar = 'a'; //'a'는 십진수 정수 97 , 'A'는 십지수 정수 65 , 97 - 32 = 65
	    char upperChar = (char)(lowerChar - 32);
	    
	    System.out.println("a->A 변환 : " + upperChar);
		 
		
		
		// gpt 답안
        /*char lower = 'a';             // 소문자
        int lowerCode = (int) lower;  // 십진수 정수값 (97)

        int upperCode = lowerCode - 32; // 대문자 ASCII 만들기
        char upper = (char) upperCode;  // 다시 문자로 변환

        System.out.println("소문자 : " + lower);
        System.out.println("정수값 : " + lowerCode);
        System.out.println("대문자 : " + upper);
		*/
	}

}
