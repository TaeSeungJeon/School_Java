package Day_19.Lambda;

// MyFunInterface2 함수형 인터페이스를 사용해서 람다식을 작성한 소스 예)

public class MyFunInterfaceExample2 {
    static void main(String[] args) {

        MyFunInterface2 fi;

        fi = (x) -> {
            int result = x * 10;
            System.out.println("10 x 10 = " + result);
        };
        fi.method(10);

        fi = (a) -> {
            System.out.println(a + " - 3 = " + (a - 3));
        };
        fi.method(5);

        fi = a -> System.out.println(a + " + 10 = " + (a + 10));    //(), {}; 생략
        fi.method(10);
    }
}
