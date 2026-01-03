
public class ClassEx01 {

	void add(int a, int b, int[] result) {
		result[0] = a + b;  //3+5=8, 첫번째 배열 원소값이 0 에서 8로 변경
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		ClassEx01 cex = new ClassEx01();
		
		int result = cex.add(3, 5);
		System.out.printf("3 + 5 = %d \n", result);
		
		int[] arr = {0};
		cex.add(3, 5, arr);
		System.out.println("arr[0] = " + arr[0]);
	}

}
