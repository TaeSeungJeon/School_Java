
// 객체 배열 

class Tv10{
	int channel;
	
	void channelUp() {
		++channel;		//채널번호 1증가
	}
}

public class ArrEx10 {

	public static void main(String[] args) {

		Tv10[] tvArr = new Tv10[3];		// 배열크기가 3인 객체배열 tvArr 생성
		// Tv10 객체를 생성해서 tvArr 객체 배열의 각 요소에 저장
		for(int i = 0; i < tvArr.length;i++) {
			tvArr[i] = new Tv10();
			tvArr[i].channel = i+10;
			System.out.printf("tvArr[" + i + "].channel=%d \n ",tvArr[i].channel);
		}
		System.out.println("\n======================\n");
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.println(tvArr[i].channel);
		}
	}
}
