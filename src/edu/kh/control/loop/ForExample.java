package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	/*
	 * for문 => 끝이 정해져 있는 (횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법] for(초기식 ; 조건식; 증감식) { "반복 수행할 코드"; }
	 * 
	 * ->> 초기식 : for문을 제어하는 용도의 변수 선언 ->> 조건식 : for문의 반복 여부를 지정하는 식 보통 초기식에 사용된 변수를
	 * 이용하여 조건식을 작성함. ->> 증감식 : 초기식에 사용된 변수를 for문이 끝날 때 마다 증가 또는 감소시켜 조건식의 결과를 변하게
	 * 하는 식 (=> 증감식이 없으면 항상 초기값을 가지기 때문에 무한 반복함.)
	 */

	Scanner sc = new Scanner(System.in);

	public void ex1() {
		// for문 기초 사용법1
		// 1 ~ 10 출력하기
		// 1부터 10까지 1씩 증가하며 출력

		// * 반복문은 조건식이 true일 때만 반복한다.

		for (int i = 1; i <= 10; i++) {
			// 초기식 // 조건식 // 증감식

			// 반복 수행할 코드
			System.out.println(i);
		}
	}

	public void ex2() {
		// 3에서 7까지 1씩 증가하며 출력
		for (int i = 3; i < 8; i++) {// 어디서부터 시작할 수 있을지 알 수 있음.
			System.out.println(i);
		}
	}

	public void ex3() {
		// 2 부터 15까지 1씩 증가하며 출력
		for (int i = 2; i < 16; i++) {
			System.out.println(i);
		}
	}

	public void ex4() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력

		System.out.print("입력 값 :");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println(i);

		}

	}

	public void ex5() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i += 2) {
			System.out.println(i);
		}

	}

	public void ex6() {

		// 1.0부터 입력 받은 실수 까지 0.5씩 증가하며 출력

		System.out.print("실수 입력 : ");

		double num = sc.nextDouble();

		for (double i = 1.0; i <= num; i += 0.5) {

			System.out.println(i);
		}

	}

	public void ex7() {

		// 영어 알파벳 A부터 Z까지 한줄로 출력
		// ABCDEF ... Z

		// * char 자료형은 문자형이지만, 실제로 정수(문자표 번호)를 저장한다.

		// 첫 번째 방법
		for (char i = 'A'; i < 'Z'; i++) {
			System.out.print(i);
		}

		System.out.println("\n---------------밑에는 int로 받아와서 char로 강제 형변환---------------\n");

		// 두 번째 방법
		for (int i = 'A'; i < 'Z'; i++) {
			System.out.print((char) i);
		}

	}

	public void ex8() {
		// 10 ~ 1 까지 1씩 감소

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}

	public void ex9() {
		// for문 응용 1 : 반복문을 이용한 값의 누적

		// 1부터 10까지 모든 정수의 합 구하기

		int sum = 0; // 반복되어 증가되는 i값의 합계를 저장할 변수
						// 0으로 시작하는 이유 : 아무것도 더하지 않음으로
						// 정확히 결과를 도출할 수 있기 때문

		for (int i = 1; i <= 10; i++) { // i가 11일 때 끝남.
			sum += i;
		}

		System.out.println(sum);

	}

	public void ex10() {
		// for문 응용

		int sum = 0;

		for (int i = 0; i < 5; i++) {

			System.out.printf("정수 입력 %d :", i + 1);
			int num = sc.nextInt();

			sum += num;

		}

		System.out.println("합계 : " + sum);

	}

	public void ex11() {

		System.out.print("입력 받을 정수의 개수 : ");
		int input = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < input; i++) {

			System.out.printf("입력 %d :", i + 1);
			int num = sc.nextInt();

			sum += num;
		}

		System.out.println(sum);

	}

	public void ex12() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 5의 배수 ()를 붙여서 출력
		// ex) 1 2 3 4 (5) 6 7 8 9 (10) 11 ... (20)

		for (int i = 1; i <= 20; i++) {

			if (i % 5 == 0) {

				System.out.printf("(%d)", i);

			} else {
				System.out.print(i + " ");
			}

		}

	}

	public void ex13() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력 받은 수의 배수는 () 표시

		// ex)
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) ...

		// 괄호를 표시할 배수 : 4
		// 1 2 3 (4) 5 6 7 (8) 9 ...

		System.out.print("괄호를 표시할 배수 : ");
		int Dr = sc.nextInt();

		for (int i = 1; i <= 20; i++) {

			if (i % Dr == 0) {
				System.out.printf("(%d) ", i);
			} else {
				System.out.print(i + " ");
			}

		}

	}

	public void ex14() {
		// [구구단 출력]
		// 2~9사이 수를 하나 입력받아 해당 단을 출력
		// 단, 입력받은 수가 2 ~ 9 사이 숫자가 아니면 "잘못 입력 하셨습니다."를 출력
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		
		if( dan >= 2 && dan <= 9) {
			
			for(int i = 1; i <= 9; i++) {		
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);			
			}					
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}

	}
	
	public void ex15() {
		// #2) 구구단 출력2 (19단까지)
	    //	2 ~ 19단 사이 단을 입력 받아서 x 1 ~ x 19까지 출력
		// 단, 2 ~ 19 사이 단이 입력되지 않으면 "잘못 입력 하셨습니다." 출력
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan > 19 || dan < 2) {
			System.out.println("잘못 입력하셨습니다.");	
		}else {
			for ( int i = 1 ; i < 20 ; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
		}
	}
	
	
	
	
}
