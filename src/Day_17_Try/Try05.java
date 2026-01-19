package Day_17_Try;
// 배열주소 인덱스 번호 범위를 벗어나면 예외오류
public class Try05 {
    static void main(String[] args) {

        int[] arr = {10, 20, 30};

        try {
            System.out.println("Test-1 ");
            arr[2] = 40;
            System.out.println("Test-2 ");
            arr[3] = 20;        // 배열은 0~2 까지만 있기때문에 예외 발생
            System.out.println("Test-3 ");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
