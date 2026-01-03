
//No.13문제  다음은하나의 속성 변수 x) 을 갖는 Thing 클래스입니다 다음 예제에서 문제점을 발견하고 
//          이를 수정해 봅시다
class Thing02{
	private int x;

    public void setX(int new_x) {
    	x = new_x;
    }
    public int getX() {
		return x;
    	
	}
}

public class ThingTest01 {

	public static void main(String[] args) {
		
		Thing02 thing01;
		thing01=new Thing02();
		thing01.setX(10);
		System.out.println(thing01.getX());
	}
}


