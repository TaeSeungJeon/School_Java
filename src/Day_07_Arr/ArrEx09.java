
// new 키워드로 서로 다른 객체를 생성했지만 같은 객체주소를 


 class Tv09{
	 int channel;
 }
public class ArrEx09 {

	public static void main(String[] args) {
		
		Tv09 tv01 = new Tv09();
		Tv09 tv02 = new Tv09();
		
		tv02 = tv01;	// tv01 객체주소가 tv02 에 대입됨. 그럼 기존 tv02 객체주소 사라짐
						// 결국 tv01과 tv02는 같은 객체주소를 가르킨다. 즉, 동일하게 가리키는 객체 주소는 tv01 됨
		tv01.channel = 7;
		System.out.println("변경된 tv01 채널번호 : " + tv01.channel + "변경된 tv02 채널번호: " + tv02.channel);
		
		
		
	}
}
