/*
package Day_18;
*/
/*첫번째 멋티스레드 생성법
    1. Thread 클래스를 상속하는 법
    2. run() 메서드를 오버라이딩 해서 멀티 스레드 문장 구현
    3. Thread 클래스를 상속받은 자손클래스에서 스레드 문장을 구현하면 기능이 간단한 멀티스레드 프로그램을 만들 때
        좋지만, 보다 더 복잡한 멀티스레드 프로그램을 만들때는 불리하다.
        단점으로 하나의 부모로 부터만 단일상속만 가능
      *//*



class ThreadEx01 extends Thread {
    public Thread01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int num = 1; num <= 5; num++) {
         for (int k = 1; k < 100000000; k++) {
            System.out.println(getName() + " : " + );
        }
    }
}
public class ThreadEx01 {
    static void main(String[] args) {

        ThreadEx01 th01 = new Thread01("첫번째 스레드");
        ThreadEx01 th02 = new Thread01("두번째 스레드");
        th01.start();

    }
}
*/
