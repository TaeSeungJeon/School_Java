

class Vm08{
	void changeNum(int y) {
		y = 2000;
	}
}

public class ObjEx08 {

	public static void main(String[] args) {

		Vm08 vm = new Vm08();
		int x = 1000;
		System.out.println("changeNum() 메서드 호출 전 : " + x);
		vm.changeNum(x);
		System.out.println("changeNum() 메서드 호출 후 : " + x);
	}

}
