package Day_18_Thread;
/* 출금 작업과 같은 특정 작업이 이루어질때는 synchronized 키워드로 동기화를 처리해야 하는데
   이를 하지않아서 출금 후 은행잔고가 음의 정수가 나오는 예)
*/

class Account {
    private int balance = 1000; // 계좌 잔액

    // 동기화를 처리하지 않은 출금작업
    public void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {

            }
            balance -= money;   // 잔액 - 출금액
        }
    }

    public int getBalance(){
        return balance; // 계좌 잔액 반환
    }
}

class Thread8 implements Runnable {

    Account acc = new Account();
    @Override
    public void run() {
        while (acc.getBalance() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            //random()은 0.0이상 1.0미만 사이 실수숫자 난수발생 -> *3 하면 0.0이상 3.0미만 사이 실수숫자난수 발생
            // -> +1 하면 1.0이상 4.0미만 사이 실수숫자 난수 발생 -> (int)형변환 하면 소수점 버림 = 1이상 4미만 정수숫자 난수 발생
            // -> *100 하면 100이상 400미만 (100, 200, 300)중 하나 정수숫자 난수 임의의 출금액이 됨.
            acc.withdraw(money);
            System.out.println("출금후 잔액: " + acc.getBalance());

        }
    }
}

public class Thread08 {

    static void main(String[] args) {

        Thread8 th = new Thread8();
        new Thread(th).start();
        new Thread(th).start();

    }
}
