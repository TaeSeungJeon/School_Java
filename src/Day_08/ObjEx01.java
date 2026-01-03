
// 자바의 OOP에서 메서드 오버로딩이란
// 동일한 같은 클래스내에서 같은 이름의 메서드를 여러번 중복해서 정의하는 것을 말한다.

// 오버로딩 된 메서드 구분 요건)
//  1. 매개변수 타입을 다르게한다.
//  2. 매개변수 개수를 다르게한다.

class Mt01{
	int abs(int data) {
		if(data < 0) {
			data = -data;
		}
		return data; 
	}
	double abs(double data) {
		if(data < 0) {
			data = -data;
		}
		return data;
	}						// 매개변수 타입을 다르게한 메서드 오버로딩
	
	void pr(int a, int b) {
		System.out.println(a + "," + b);
	}
	void pr(int a) {
		System.out.println(a); 
	}						// 매개변수 개수를 다르게한 메서드 오버로딩
}

public class ObjEx01 {
	public static void main(String[] args) {
		Mt01 m01 = new Mt01();
		int result = m01.abs(-100);
		System.out.println("-100의 절대값= " + result);
		System.out.println("-100.99의 절대값= " + m01.abs(-100.99));
		
		m01.pr(10);m01.pr(10,20);
	}
}
