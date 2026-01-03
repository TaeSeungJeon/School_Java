package Day_10;

// 1. static 키워드로 정의된 변수 count 를 정적변수라 한다. 정적변수는 클래스 변수로 해당 클래스로 직접 접근가능하다.
// 2. 인스턴스 초기화 블록 { } 을 사용해서 정적변수와 인스턴스 변수 초기화를 해보고 그 차이점에 대해서 알아본다.

class Product{
    static int count = 0;       // 정적 변수
    int serialNo;       // 인스턴스 변수 -> 생성된 객체마다 따로 관리한다. (생성된 객체마다 주소값이 달라서 다른 값을 가진다.
    {       // 인스턴스 초기화 블록
            ++count;
            serialNo = count;
    }
    public Product() {
    }
}           // 명시적인 초기화를 하지않아서 기본값 0으로 초기화가 된다.


public class ConsEx02 {
    public static void main(String[] args) {

        Product p01 = new Product();    // 인스턴스 초기화 블록을 호출하고 그 다음에 생성자를 호출
        Product p02 = new Product();    // new Product(); 할때 마다 해당 생성자와 인스턴스 초기화 블록을 호출 실행
        Product p03 = new Product();    // p01,p02,p03 각 객체 주소가 다르다. 그러므로 다른 고유한 값을 가진다

        System.out.println("p01 제품번호(시리얼 번호): " + p01.serialNo);
        System.out.println("p02 제품번호 : " + p02.serialNo);
        System.out.println("p03 제품번호 : " + p03.serialNo);

        System.out.println("총 생산대수: "  + Product.count + "대");
    }
}
