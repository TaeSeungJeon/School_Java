package Java_Study02.net.daum.model02;

import Java_Study02.net.daum.model01.ShapeInterface;

public class Son01 extends ShapeInterface {

    @Override
    public void draw(){
        System.out.println("첫번째 자손을 만든다.");
    }
}
