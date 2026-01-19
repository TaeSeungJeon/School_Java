package Day_19_Lambda.Lambda;

// 자바 내장 함수형 인터페이스인 Runnable 은 자바 8버전에서 @FunctionalInterface가 도입되어져서 람다식을 구현할 수 있게 되었다.
// 여기에는 추상메서드 void run(); 딱 하나만 온다. 결국 멀티스레드 문장을 람다식 문법으로 구현할 수 있게 되었다는 것을 의미.


// 문제 1) 함수형 인터페이스인 Runnable을 사용하면 람다식 익명객체를 구현할 수 있다.
// 그러므로 스레드의 스케줄링 메서드인 sleep()을 잘 활용해서 람다식 문법코드로 1초 간격으로 10부터 1까지 카운트다운되는
// 스레드 예제를 for문을 사용해서 구하는 자바코드를 완성해본다.

public class RunnableEx {
    static void main(String[] args) {

        Runnable CountDown = () -> {
            for (int i = 10; i >= 1; i--) {
                System.out.println("카운트 다운: " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
            System.out.println("카운트 다운 종료");
        };
        Thread thread = new Thread(CountDown);
        thread.start();

        System.out.println("========================");

        // 문제2) Runnable 자손인 Thread 클래스와 for 반복문, sleep()을 활용해서 람다식 문법으로
        //       동시에 1부터 10까지 카운터 되는 스레드 프로그램 만들기

        Thread countUp = new Thread(() ->{
            for (int i = 1; i <= 10; i++) {
                System.out.println("카운트 업: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        });
        countUp.start();
    }
}
