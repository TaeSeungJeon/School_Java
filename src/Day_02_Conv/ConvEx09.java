


public class ConvEx09 {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 20;
		int c = 0;
		
		c = a & b;
		System.out.println(a + " & " + b + " : " + c); 
		
		c = a | b;
		System.out.println(a + " | " + b + " : " + c);
		
		c = a ^ b;
		System.out.println(a + " ^ " + b + " : " + c);
		
		c = ~a;
		System.out.println("~12 : " + c);
		
	}
}
