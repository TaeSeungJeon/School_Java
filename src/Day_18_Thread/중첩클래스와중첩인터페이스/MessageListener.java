
package Day_18_Thread.중첩클래스와중첩인터페이스;

import Day_18_Thread.중첩클래스와중첩인터페이스.Button.OnClickListener;

public class MessageListener implements OnClickListener {

    @Override
    public void onClick(){
        System.out.println("문자를 보냅니다.");
    }
}

