
// 메서드내의 실행문장 수행 후 절대값을 반환할 때는 return 키워드를 사용한다.
// 리턴타입이 없는 void 형 즉, 반환값이 없다

public class ArrEx04 {
	static int abs(int data) {
		if(data < 0) {
			data = -data; 	//양의 절대치
		}
		return data; 		// 메서드를 호출한 곳으로 양의 절대값을 return 에 의해서 반환
	}
	static void abs2 (int data) {
		if(!(data < 0)) {
			System.out.println("음의 정수 숫자만 입력하세요.");
		}else {
			if(data < 0) {
				data = -data;
			}
			System.out.println("양의 절대값 =" + data);			
		}
	}	
	
	public static void main(String[] args) {
		int resultData = ArrEx04.abs(-100);		// 정적 메서드명 앞의 ArrEx04.은 생략
		System.out.println("-100의 절대값=" + resultData);
		abs2(-700);
		
	}
}
