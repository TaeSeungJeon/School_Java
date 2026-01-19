
// 자바에서 OOP(Object-Oriented Programming)인 객체지향 프로그래밍을 사용하는 목적
// 1. 높은 재사용성 | 2. 중복코드 제거

class Arr11{
	void printArr(int[] arr) {
		for(int k:arr) {
			System.out.print(" " + k);
		}
		System.out.println("\n=====================\n");
	}
}

public class ArrEx11 {

	public static void main(String[] args) {

		int[] numArr = new int[5];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
		}
		for(int i = 0; i < numArr.length; i++) {
			System.out.println("numArr[" + i + "]: " + numArr[i]);
	}
		System.out.println("\n=====================\n");
		
		Arr11 arr = new Arr11();
		arr.printArr(numArr);
		arr.printArr(numArr);
	}
}
