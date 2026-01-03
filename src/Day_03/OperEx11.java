
// 중첩 if else if 다중 조건문을 활용한 A+, A0, A- 등 학점구하기 소스

import java.util.Scanner;

public class OperEx11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int score = 0;		//점수
		char grade = ' ';		//학점
		char opt = '0';		

		System.out.print("0~100사이 정수숫자만 입력: ");
		score  = Integer.parseInt(scan.nextLine());

		if(!(score >= 0 && score <= 100)) {
			System.out.println("0부터 100사이 점수만 입력하세요!");
		}
		else {
			if(score >= 90) {//90점 이상 100점 이하
				grade = 'A';
				if(score >= 97 && score <=100) {
					opt = '+';
				}else if(score >= 90 && score <=93) {
					opt = '-';
				} // if else if -> 나머지 조건인 94점이상 96점 이하는 A0
			}else if(score >= 80) {
				grade = 'B';
				if(score >= 87 && score <= 89) {
					opt = '+';
				}else if(score >= 80 && score <= 83) {
					opt = '-';
				}
				// 문제) C+,C0,C- 부터 D+,D0,D-를 구하는 자바코드 추가
			}else if(score >= 70) {
				grade = 'C';
				if(score >= 77 && score <= 79) {
					opt = '+';
				}else if(score >=70 && score <= 73) {
					opt = '-';
				}
			}else if(score >= 60) {
				grade = 'D';
				if(score >= 67 && score <= 69) {
					opt = '+';
				}else if(score >=60 && score <= 63) {
					opt = '-';
				}						
			}else { //0~59점 일때는 F
				grade = 'F';
			}// outer if else if

			if(grade !='F') {
				System.out.printf("당신이 입력한 점수 %d는(은) %c%c학점입니다.\n", score,grade,opt);
			}else {
				System.out.println("당신이 입력한 점수 "+ score +"는(은) " + grade + "학점입니다.");
			}
		} // if else end
	}
}



