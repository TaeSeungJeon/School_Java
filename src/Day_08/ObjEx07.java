
class MyDate07{
	int year = 2025;
	int month = 12;
	int date = 22;
}

public class ObjEx07 {

	public static void main(String[] args) {

		MyDate07 d = new MyDate07();
		MyDate07 t = d;
		
		System.out.println(d.year + "년 " + d.month + "월 " + d.date + "일 ");
		System.out.printf("%d년 %d월 %d일 \n", t.year, t.month, t.date);
		
		t = new MyDate07();
		t.year = 2026; t.month = 1; t.date = 1;
		
		System.out.printf("%d년 %d월 %d일 \n", d.year, d.month, d.date);
		System.out.println(t.year + "년 " + t.month + "월 " + t.date + "일 ");
	}

}
