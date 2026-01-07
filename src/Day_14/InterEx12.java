package Day_14;
// 봉인된/비봉인된 인터페이스를 활용한 소스 예)

public class InterEx12 {
    static void main(String[] args) {

        ImpClass imp = new ImpClass();

        InterfaceA ia = imp;
        ia.methodA();
        System.out.println("===================");

        InterfaceB ib = imp;
        ib.methodA();
        ib.methodB();
        System.out.println("===================");

        InterfaceC ic = imp;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
