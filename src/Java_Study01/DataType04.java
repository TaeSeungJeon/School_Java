package Java_Study01;
/* 복합대입연산자 종류)
    i += 1은    i = i + 1과 같다 1씩 증가
    i += 5 복합대입연산자는 5씩 증가 i -= 3은 i = i -3과 같다. 3씩 증가
 */


public class DataType04 {
    static void main(String[] args) {

        int i = 1;
        i += 1;
        System.out.println("i= " + i);

        i += 10;
        System.out.println("i= " + i);

        i -= 3;
        System.out.println("i= " + i);

        i -= 1;
        System.out.println("i= " + i);

        /* 증감연산자 종류)
                i++ (후행증가 : 나중에 1증가)
                ++i (선행증가 : 먼저 1증가)
                i-- (후행감소)
                --i (선행감소)
         */
        i = 10;
        int k = i++;        // 먼저 i 변수값 10을 k변수에 대입 저장하고 나중에 1증가
        System.out.println("k= " + k + ", i=" + i);

        i = 10;
        k = --i;        // 먼저 1 감소한 9를 k 에 저장
        System.out.println("k= " + k + ", i=" + i);
    }
}
