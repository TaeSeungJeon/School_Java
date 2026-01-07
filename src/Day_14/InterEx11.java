package Day_14;
/* 부모 인터페이스의 default메서드와 부모클래스의 일반 메서드명이 동일한 경우 부모 인터페이스의 디폴트 메서드는
   자손에서 상속되지 않고 부모 클래스의 일반 동일 메서드가 상속되어 진다. */

    class ParentClass11 {
        public void display() {
            System.out.println("부모 일반 메서드");
        }
    }

    interface ParentInter11 {
        default void display() {
            System.out.println("부모 인터페이스의 디폴트 메서드");
        }
    }

    class ChildClass11 extends ParentClass11 implements ParentInter11 {

    }

    public class InterEx11 {
        static void main(String[] args) {

            ChildClass11 child11 = new ChildClass11();
            child11.display();
        }
    }

