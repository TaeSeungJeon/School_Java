package Day_18_Thread;
/* 멀티스레드의 스케줄링 메서드 중에서 wait(), notify() 메서드에 관한 실습예제)
 */

import java.util.ArrayList;

class Table {
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;     // 테이블에 추가할 수 있는 최대 음식개수
    private ArrayList<String> dishes = new ArrayList<>();   // 음식 추가할 컬렉션 제네릭 객체 생성 (문자열만 가능)

    // 동기화 된 음식추가
    public synchronized void add(String dish) {
        while (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName(); //현재 실행중인 스레드 이름 반환
            System.out.println(name + "is waiting");

            try{
                wait(); //요리사 스레드를 기다리게 함
                Thread.sleep(500);
            }catch (InterruptedException ie){}
        }
            dishes.add(dish);   // 음식추가
            notify();   // 기다리는 손님 스레드를 깨워서 음식 식사하게 함
            System.out.println("추가한 음식목록: " + dishes.toString());

    }

    //동기화 된 음식 제거
    public void remove(String dishName) {
        synchronized (this) {
            String name = Thread.currentThread().getName();
            while (dishes.size() == 0) {    //테이블에 음식이 없는 경우
                System.out.println(name + " is waiting");

                try{
                    wait();
                    Thread.sleep(500);
                }catch (InterruptedException ie){}
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify();
                        return;
                    }
                }
                try {
                    System.out.println(name + " is waiting");
                    wait(); //원하는 음식이 없다면 손님스레드를 기다리게 함
                    Thread.sleep(500);
                }catch (InterruptedException ie){}
            }
        }// 특정영역 동기화
    }

    public int dishNum(){
        return dishNames.length;
    }
}

// 소비자 스레드
class Customer implements Runnable {

    private Table table;
    private String food;

    public Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            }catch (InterruptedException ie){}
            String name = Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name + " ate a " + food);

        }
    }
}

// 요리사 스레드
class Cook implements Runnable {

    private Table table;

    public Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            int idx = (int) (Math.random() * table.dishNum());  // random()은 0.0이상 1.0미만 사이 실수숫자 난수 발생 ->
                                                                // *3 하면 0.0~3.0미만 발생 ->(int) 형변환 0~3미만 발생
            table.add(table.dishNames[idx]);    // 테이블에 음식추가
            try{
                Thread.sleep(10);
            }catch (InterruptedException ie){}
        }
    }
}


public class Thread09 {
    static void main(String[] args) throws Exception{

        Table table = new Table();
        new Thread(new Cook(table), "COOK01").start();  // 요리사 스레드 시작
        new Thread(new Customer(table, "donut"), "CUST01").start();
        new Thread(new Customer(table, "burger"), "CUST02").start();

        Thread.sleep(2000);
        System.exit(0);
    }
}
