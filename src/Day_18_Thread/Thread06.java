package Day_18_Thread;
/* 자바 스윙 GUI를 사용한 멀티스레드 예)
    카운터 다운과 스윙 GUI 입력폼 실행이 멀티스레드에 의해서 동시작업
*/

import javax.swing.*;

class Thread6 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i++) {
            System.out.println(i);

            try{
                sleep(1000);    // 1초간 일시정지 -> 1초 간격으로 카운터 다운이 이루어진다.
            }catch (InterruptedException ie){}
        }
    }
}


public class Thread06 {

    static void main(String[] args) {

        Thread6 th = new Thread6();
        th.start();

        String name = JOptionPane.showInputDialog("이름 입력 >>");
        System.out.println("입력한 이름: " + name);
    }
}
