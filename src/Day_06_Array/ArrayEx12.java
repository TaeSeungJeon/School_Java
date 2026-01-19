
// String 문자열 배열에 관한 소스)

public class ArrayEx12 {

	public static void main(String[] args) {
		
		String[] cityNames = {"서울시", "대전시", "인천시"};
															// 일반 for 반복문으로 cityNames[] 문자열 배열 원소값 출력
		for(int i = 0; i < cityNames. length; i++) {
			System.out.println("cityNames[" + i + "] : " + cityNames[i]);
		}
		System.out.println("\n===========================\n");
		
		String tmp = cityNames[1];							// 2번째 배열원소값 대전시 저장
		System.out.println("반환된 도시이름: " + tmp); 		
		
		cityNames[2] = "경기도 성남시";						// 3번째 배열 원소값을 인천시에서 경기도 성남시로 변경
		
		for(String cityName:cityNames) {
			System.out.println(" " + cityName);
		}
	}
}