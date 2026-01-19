
// 클래스와 객체 지향에 관한 소스 => 객체지향 프로그래밍(OOP:Object-Oriented Programming)

class Animal06 {			// class 키워드로 Animal06 클래스 정의
	String name;
	int age; 			// 클래스 소속의 멤버변수 (속성) name,age 정의, 멤버변수 중 객체 생성해서 접근하는 인스턴스 변수이다.
}				

class Thing{
	int x;
}					
public class ArrEx06 {
	public static void main(String[] args) {
		
		Animal06 a;					// 객체주소가 저장안된 참조변수
		a = new Animal06();			// new 키워드로 객체명을 생성하면 a 참조변수에는 객체주소가 저장되어 객체 주소가 저장된 참조변수가 된다. a 를 객체명이라고도 한다.
		
		a.name = "홍길동";			// 객체명. 속성으로 접근
		a.age = 20;
		
		System.out.println("이름: " + a.name + ", 나이: " + a.age);
		System.out.println("\n-----------------------\n");
		
	// 문제 1) 11장. 클래스와 객체.pdf No.10쪽 1번 문제. | b 객체를 하나 더 생성해서 b 로 접근하도록 하고, 이름은 "펭귄", 나이는 12를 저장 출력
		
		Animal06 b = new Animal06();
		
		b.name = "펭귄";
		b.age = 12;
		
		System.out.println("이름: " + b.name + ", 나이: " + b.age);
		System.out.println("\n-----------------------\n");
		
	// 문제 2) 11장. No10쪽 2번 문제. |	하나의 속성(int 형 x)을 같는 Thing 클래스를 설계한 후, 객체 thing 을 생성해서 멤버변수 x에 값10을 저장 출력
		
		Thing thing = new Thing();
		thing.x = 10;
		
		System.out.println("thing.x=" + thing.x);
		}
	}

