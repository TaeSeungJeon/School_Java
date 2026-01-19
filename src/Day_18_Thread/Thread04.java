package Day_18_Thread;

/* 자바 GUI는 그래픽 사용자 인터페이스(Graphical User Interface)의 약자이다.
    즉, 자바 언어로 그림그리는 것을 말한다.
    자바 언어로 그림그리는 것은 AWT, Swing, FX가 있다.
    여기서 AWT를 사용해서 프레임윈도우창을 만들고,
    여기에 멀티스레드 왼쪽에서 부터 오른쪽으로 오렌지색글자가 항상 지나가게 만들어본다.
   */

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame04 extends Frame implements Runnable {
    int x = 0;

    public Frame04(){
        this.setBackground(new Color(0, 0, 0));
        setSize(370,150);   // 프레임 윈도우 폭과 높이를 지정
        setVisible(true);               // 프레임 윈도우를 항상 나오게한다

        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                dispose(); //자원 해제
                System.exit(0);     // 현재 프로그램(열려진 AWT 프레임 윈도우 창) 정상 종료
            } // 현재 프레임 윈도우 닫기할 때 호출
        }); // 프레임 윈도우 이벤트 등록메서드 -> 익명클래스 즉 내부 무명클래스 ( 외부클래스$번호.class -> Frame04$1.class)로 컴파일
    }
    @Override
    public void run() {

        while (true) {
            try{
                Thread.sleep(100); //스레드 일시정지
            }catch (InterruptedException ie){}
            repaint();  // 자바 GUI에서 컴포넌트 객체를 다시 그리고자 할 때 사용. 결국 paint()
            // 메서드를 간접적으로 호출
            x = x + 5;  // 프레임 윈도우 x좌표 5증가
        }//무한루프문
    }

    @Override
    public void paint(Graphics g) {
        Dimension d;                // 폭과 높이를 가지는 클래스
        d=getSize();                // 프레임 창의 크기를 구해서 Dimension 객체 반환
        g.setColor(Color.orange);   // 클자색 오렌지 사용
        g.drawString("java", x, d.height / 2);
        // 프레임 윈도우 중간높이에 java 문자 출력, 스레드에의해서 x좌표값은 항상 변경

        if(x > d.width){ // 프레임 폭을 벗어나면
            x = 0;       // 다시 왼쪽 처음부터 반복
        }
    } // 무엇을 그리고자 할 때 이 메서드를 오버라이딩
}

public class Thread04 {
    static void main(String[] args) {

        Frame04 f = new Frame04();
        Thread th = new Thread(f);
        th.start();
    }
}
