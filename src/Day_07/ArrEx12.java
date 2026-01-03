

class Obj12{
	int add(int a, int b) {
		return a + b;	
	}
	void printGu() {
		System.out.println("\n=========================\n");
		for(int j = 1; j <= 9; j++) {
			for(int i =2; i <= 9; i++) {
				System.out.print(i + "x" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}

public class ArrEx12 {

	public static void main(String[] args) {

		Obj12 obj = new Obj12();
		System.out.println("7 + 7 = " +obj.add(7, 7));
		obj.printGu();
	}

}
