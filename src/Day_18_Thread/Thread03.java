package Day_18_Thread;
/* 두번째 자바 멀티스레드 구현 법 )
    1. Runnable 인터페이스를 구현 상속 받아서 스레드 프로그램을 만들면 다중 상속을 받을 수 있는 장점이있다.
        때문에 보다 더 다양한 스레드 프로그램을 만들 때 유리하다.
    2. 단점은 Runnable 인터페이스를 구현 상속받은 자손으로 스레드를 시작하는 start() 메서드를 호출할 수 없다.
        이유는 start()메서드는 Runnable의 자손 클래스인 Thread 클래스의 소속 메서드이기 때문이다.
        그래서 이 인터페이스를 구현상속 받은 자손클래스 객체를 Thread 생성자 인자값으로 전달해서 다시 한번 더
        객체 생성되는 과정을 해야 한다.
 */

class Run03 implements Runnable {

    @Override
    public void run() {
        for (int a = 1; a <= 5; a++) {
            for (int k = 1; k < 100000000; k++) ;
            System.out.println(Thread.currentThread().getName() + " : " + a);
        }
    } // 스레드 문장 구현
}

public class Thread03 {
    static void main(String[] args) {

        Run03 r = new Run03();
        Run03 r2 = new Run03();
        Thread th = new Thread(r, "첫번째 스레드");
        Thread th2 = new Thread(r2, "두번째 스레드");

        th.start(); // 멀티스레드 시작
        th2.start();

    }
}
