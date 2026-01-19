package Day_12_Ref;
// 17장. 레퍼런스 형변환.pdf No.19쪽 2번 문제) 강의교안 소스참조,
//       명시적 다캐할 때 if 조건문과 instanceof 연산자 추가해서 ture인 경우만 안전하게 명시적 다캐 되게 소스 변경
//       이렇게하면 OOP에 가까운 코드가 된다.
//       SubClass 부모클래스에 리턴타입이 없는 void형 pr(){} 메서드를 정의하고 다캐한 foo로 해당 메서드를 호출해서 i값을 출력
class SubClass extends Object{
    int i = 3;

    void pr(){
        System.out.println("i =" + i);
    }
}
public class Ex17_01 {
    public static void main(String[] args) {
       /* Object o = new SubClass();
        SubClass foo = (SubClass)o;
        System.out.println("i= " + foo.i);*/

        Object obj = new SubClass();          //업캐

        if (obj instanceof SubClass) {        //obj는 SubClass 자손타입으로 다캐 가능한가? 참! Why~ 사전에 업캐 해놔서 다캐 가능
            SubClass foo = (SubClass) obj;
            foo.pr();
            System.out.println("명시적 다캐 가능.");
        }else{
            System.out.println("다캐 불가능");
        }
    }
}
