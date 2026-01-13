
package Day_18.중첩클래스와중첩인터페이스;


import Day_18.중첩클래스와중첩인터페이스.Button.OnClickListener;

public class CallListener implements OnClickListener {

    @Override
    public void onClick(){
        System.out.println("전화를 겁니다.");
    }
}

