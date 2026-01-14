package Day_19.Lambda;

//MyFunInterface 함수형 인터페이스를 활용해서 람다식을 작성한 소스 예)

public class MyFunInterfaceExample {
    static void main(String[] args) {

        MyFunInterface fi;
        fi = () -> {    //오버라이딩 한 메서드는 생략
            String result = "method() 호출1";
            System.out.println(result);
        };  // 첫번째 람다식
        fi.method();

        fi = () -> { System.out.println("method() 호출2"); };
        fi.method();

        fi = () -> System.out.println("method() 호출3");
        fi.method();
    }
}
