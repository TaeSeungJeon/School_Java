
// 클래스와 객체 관계인 객체지향 프로그래밍(OOP: Object-Oriented Programming

class Tv07{
	String color;		// tv 색상
	boolean power;		// 전원 상태(on/off)
	int channel;		// 3개의 클래스 소속 멤버변수 (속성) 각각 정의
						// 클래스 소속 멤버변수(속성) 기본값)
						// 멤버 변수만 선언하고 명시적인 코드로 초기화를 하지않으면 기본값으로 초기화된다. 이 초기값에 대해서 알아본다. 
						// int 타입 속성은 0으로 초기화
						// boolean 타입 속성은 0으로 초기화
	                    // double 타입 속성은 0.0 기본값으로 초기화
						// String 참조타입 멤버변수는 null 기본값으로 초기화
	
				// 3개의 메서드 정의
	void power() {
		power = !power;  // !false -> true
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
	}
}
public class ArrEx07 {
	public static void main(String[] args) {
		
		Tv07 tv;				// 객체주소가 저장안된 참조변수 tv
		tv = new Tv07();		// 객체주소가 저장된 참조변수 tv
		
		tv.channel =10;			// 채널번호 10 저장
		tv.channelUp();			// 채널번호 1 증가
		System.out.println("1 증가된 채널번호: " + tv.channel);
		
		tv.channelDown(); tv.channelDown();						// 채널번호 2감소
		System.out.println("2 감소된 채널번호: " + tv.channel);		//9
		
		tv.power();												//!false -> true
		System.out.println("tv on/off : " + tv.power);  		// true
	}
}
