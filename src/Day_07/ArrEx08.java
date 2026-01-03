

class Tv08{
	int channel;
}
public class ArrEx08 {

	public static void main(String[] args) {
		
		Tv08 tv01 = new Tv08();
		Tv08 tv02 = new Tv08();
		
		System.out.println("tv01 채널번호 : " + tv01.channel + ", tv02 채널번호 : " + tv02.channel);
		
		tv01.channel = 10;
		System.out.printf("tv01 채널번호 = %d, tv02 채널번호 = %d \n", tv01. channel, tv02.channel);
	}
}
