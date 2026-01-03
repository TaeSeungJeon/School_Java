
// 1. for 반복문안에 if~else 조건문과 % 나머지 연산을 사용한 홀수/짝수들의 누적합 구하기
// 2. for 반복문을 각각 따로 사용해서 홀수/짝수들의 누적합 구하기


public class ForEx01 {

	public static void main(String[] args) {
		
	int i;
		int odd_tot, even_tot;
		
		for(i = 1, odd_tot = 0, even_tot = 0; i <=10; i++) {
			if(i % 2 == 1) {
				odd_tot += i;
	    	}else {
			even_tot = even_tot + i;
		}
		}
	System.out.printf("홀수들의 누적합= %d \n", odd_tot);
	System.out.println("짝수들의 누적합= " + even_tot);
	
	for(i = 1, odd_tot = 0; i <= 10; i += 2);{
		odd_tot = odd_tot + i;
	}
	System.out.println("홀수들의 누적합= " + odd_tot);
	
	for(i = 2, even_tot=0; i <= 10; i = i + 2) {
		even_tot += i;
	}
	System.out.println("짝수들의 누적합= " + even_tot);
	}

}








    /*    int i;
        int odd_tot, even_tot;

        odd_tot = 0;
        even_tot = 0;

        for (i = 1; i <= 10; i++) {
            if (i % 2 == 1) {         // 홀수
                odd_tot += i;
            } else {                  // 짝수
                even_tot += i;
            }
        }

        System.out.println("[방법 1] if 조건문 사용");
        System.out.println("홀수들의 누적합 = " + odd_tot);
        System.out.println("짝수들의 누적합 = " + even_tot);
        System.out.println();

        odd_tot = 0;

        for (i = 1; i <= 10; i += 2) {   // 1,3,5,7,9...
            odd_tot += i;
        }

        System.out.println("[방법 2] for문 따로 사용");
        System.out.println("홀수들의 누적합 = " + odd_tot);


        even_tot = 0;

        for (i = 2; i <= 10; i += 2) {   // 2,4,6,8,10
            even_tot += i;
        }

        System.out.println("짝수들의 누적합 = " + even_tot);
    }
}*/