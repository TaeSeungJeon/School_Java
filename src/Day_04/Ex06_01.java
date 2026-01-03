
// 06장. 반복문.pdf No.18쪽 1번문제)
// 문자와 숫자를 입력받아서 해당 문자를 입력받은 숫자만큼 반복 출력하는 자바프로그램을 만들어본다.
// (for 반복문 사용)_

/*import java.util.Scanner;

public class Ex06_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("반복할 문자 입력: ");
		String inputString = scan.nextLine();
		System.out.print("반복할 횟수 입력: ");
		int count = Integer.parseInt(scan.nextLine());
		
		for(int i = 1; i <=count; i++) {
			System.out.print(" " + inputString);
		}
	}

}
*/
public class Ex06_01 {

    public static void main(String[] args) {

        String inputString = "Hello";  // 반복할 문자
        int count = 5;                 // 반복 횟수

        for(int i = 0; i < count; i++) {
            System.out.print(" " + inputString);
        }
    }
}