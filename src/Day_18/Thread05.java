package Day_18;
/* 특정은행 ATM 계좌에서 입금, 출금과 같은 특정한 작업이 이루어 질때에는 한번에 하나의 스레드에 의해서만
   입/출금작업이 이루어지도록 synchronized 키워드로 동기화 즉, 임계영역을 만들어줘야 한다.
*/

class Atm {
    private int money;

    public Atm(int money) {
        this.money = money; //생성자 주 기능인 클래스 소속 멤버변수 중 인스턴스 변수 초기화
    }

    // 입금작업
    public synchronized void deposit(int amount, String name) {
        money += amount;    // 잔액 + 입금액
        System.out.println(name + ": 입금 금액: " + amount);
    }

    // 출금작업 동기화
    public synchronized void withdraw(int amount, String name) {
        if ((money - amount) > 0) {
            money -= amount;
            System.out.println(name + ": 출금금액: " + amount);
        } else {
            System.out.println(name + ": 잔액부족으로 출금 못함.");
        }
    }

    public void printMoney() {
        System.out.println("계좌잔액: " + money);
    }
}
// AtmUser 스레스 클래스
class AtmUser extends Thread{
    boolean flag = false;
    Atm obj;

    public AtmUser(Atm obj, String name) {
        super(name);    // 부모클래스 오버로딩 된 생성자를 호출하면서 스레드 이름 반환
        this.obj = obj;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sleep(500);
                // 스레드 일시정지
            } catch (InterruptedException ie) {

            } if (flag) {   // == true 생략
                obj.deposit((int) (Math.random() * 10 + 2) * 100, getName());

            } else {
                obj.withdraw((int) (Math.random() * 10 + 2) * 100, getName());
                // random() 메서드는 0.0이상 1.0미만 사이 실수숫자 난수 발생
                // -> *10 하면 0.0이상 10.0미만 사이 실수숫자 난수 발생
                // -> +2 하면 2.0이상 12.0미만 사이 실수숫자 난수 발생
                // -> (int)로 형 변환하면 소수점이하는 버리고 2 이상 12미만 사이 정수숫자 난수 발생
                // -> *100하면 200이상 1200미만 즉, 200부터 1100사이 정수숫자 난수로 출금작업. getName() 메서드는 스레드 이름 반환
                obj.printMoney();   // 출금 후 잔액 출력
            }
            flag = !flag;       // !false -> true, !true -> false
        }
    }
}
public class Thread05 {
    static void main(String[] args) {

        Atm obj = new Atm(1000);    // 계좌 개설, 입금
        AtmUser user1 = new AtmUser(obj, "홍길동");
        AtmUser user2 = new AtmUser(obj, "이순신");
        AtmUser user3 = new AtmUser(obj, "사임당");

        user1.start();  // 멀티스레드 시작
        user2.start();
        user3.start();
    }
}
