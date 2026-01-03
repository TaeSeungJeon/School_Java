
// 자바의 기본자료형과 레퍼런스 참조형의 차이점 01)
// 기본타입 (자료형)으로 선언된 변수는 값을 저장하고, 참조타입으로 선언된 변수에는 객체주소를 저장해서 주소값을 공유해서 값도 함께 공유 수정가능하다.

class MyDate06{
	int year = 2024;
	int month = 12;
	int date = 22;
	
}

public class ObjEx06 {

	public static void main(String[] args) {
		
		int x = 7;
		int y = x;
		
		MyDate06 d = new MyDate06();
		MyDate06 t = d;
		
		
		System.out.println("x=" + x + ",y=" + y);
		System.out.println(d.year + "년 " + d.month + "월 " + d.date + "일 ");
		System.out.println(t.year + "년 " + t.month + "월 " + t.date + "일 ");
		
		y = 10 ;
		System.out.printf("x = %d, y= %d \n", x, y);
		
		t.year = 2025; t.month = 10; t.date = 31;
		System.out.printf("%d년 %d월 %d일 \n",d.year, d.month, d.date);
		System.out.println(t.year + "년 " + t.month + "월 " + t.date + "일 ");
	}
}
