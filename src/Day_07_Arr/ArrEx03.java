
// 1. 정적메서드는 클래스 객체를 생성하지 않고, 해당 클래스로 직접 호출하는 메서드를 말한다. 정적 메서드는 static 키워드 즉, 예약어로 정의한다.

public class ArrEx03 {
	static void sum(int count) {    // void 는 반환값이 없을을 증명한다. 즉, 리턴타입이 없다.
									// sum 은 메서드명이다. int count 에서 count 는 매개변수명이다.
									// 메서드 호출시 매개변수에 전달되는 값을 인자 값 이라고 한다.
		int total = 0;
		for (int i = 1; i <= count; i++) {
			total += i;
		}
		System.out.printf("1부터 %d까지의 누적합 =%d \n", count, total);
	}

	static void sum2(int count) {
		
		int i = 1;
		int total = 0;
		
		while(i <= count) {
			total += i;
			i++;
			System.out.println("1부터" + count + "까지의 누적= " + total);
		}
	}
	
	public static void main(String[] args) {
		ArrEx03.sum(10);			// 클래스명. 정적메서드(), 같은 클래스 내에서는 정적메서드를 호출할 때 해당 클래스명을 생략할 수 있다.
		// 문제) 리턴타입이 없는 void 형으로 1부터 100까지 누적합을 구하는 정적메서드 
		//      static void sum2(int cnt){}를 정의한다. 이 메서드 실행문장으로 while 반복문을 사용해 누적합을 구하는 자바코드를 만들어본다.
				sum2(100);
	}
}
