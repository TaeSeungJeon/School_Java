
// Animal07 클래스를 설계할 때 클래스 소속 멤버변수인 속성을 private 로 정의하면 외부 클래스에서 접근 못함.
// 이런경우 어떻게 처리하는지에 대해 알아보는 소스.

class Animal07{
	String name;
	private int age;		// private 정의하면 Animal07 클래스 외부에서 접근 못함. 이게 자바의 데이터 보안성이다. 
							// 이런 경우 값을 저장할 때 setter() 메서드를 호출해서 사용, 값을 반환할 땐 getter() 메서드 호출해서 사용
	public void setAge(int new_age) { // new age 매개변수명
									  // set + 속성명(멤버변수명으로 가고 첫글자는 대문자) -> 값 저장 메서드이다. 통칭 setter() 메서드라 함.
		
		age = new_age;
	}
	
	public int getAge() {		// get+속성명(멤버변수명으로 가고 첫글자는 대문자) -> 값 반환 메서드 통칭 getter() 메서드라 함
		return age;				// return 에 의해서 메서드 호출한 곳으로 나이를 반환(되돌림).
	}
}

public class AnimalEx07 {
	public static void main(String[] args) {
				
		Animal07 a;				// 객체 주소가 저장안된 참조변수 (레퍼런스 변수)
		a = new Animal07();		// 객체 주소가 저장된 참조변수 a(객체명)
		
		a.name = "이순신";
		//a.age = 20; 			// age 멤버변수는 private 로 정의해서 외부클래스에서 접근 불가 | 에러발생
		a.setAge(20);
		
		System.out.println("이름: " + a.name + "나이: " + a.getAge());
	}
}
