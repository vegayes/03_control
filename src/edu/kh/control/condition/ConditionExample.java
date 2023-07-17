package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {

	public void ex1() {

		// if문
		// 조건식이 true일때만 내부 코드 수행

		/*
		 * [작성법] if(조건식) { "조건식이 true일 때 수행할 코드" }
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int input = sc.nextInt();

		// 입력된 정수가 양수인지 검사
		if (input > 0) {
			System.out.println("양수입니다.");
		}

		if (input <= 0) {
			System.out.println("양수가 아닙니다.");

		}

	}

	public void ex2() {

		// if - else문
		// 조건식 결과가 true면 if문,
		// false면 else 구문이 수행됨.

		/*
		 * if(조건식) { "조건식이 true일 때 수행될 코드" } else { "조건식이 false일 때 수행될 코드" }
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		// 홀짝 검사
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		if (input % 2 != 0) {
			System.out.println("홀수 입니다.");
		} else { // 짝수 또는 0 입력 시 수행
			if (input != 0) {
				System.out.println("짝수 입니다.");
			} else {
				System.out.println("0입니다.");
			}

		}

	}

	public void ex3() {

		// 양수, 음수, 0 판별

		// if - else if - else

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 :");
		int input = sc.nextInt();

		if (input > 0) { // input이 양수일 경우
			System.out.println("양수 입니다.");
		} else if (input < 0) {
			// input이 음수일 경우
			// 바로 위에있는 if문이 만족되지 않은 경우 수행
			System.out.println("음수 입니다.");
		} else {
			System.out.println("o입니다.");
		}

	}

	public void ex4() {

		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 단, 겨울일 때 :: 온도가 -15도 이하 "한파 경보" , -12이하 "한파 주의보"
		// 여름일 때 :: 온도가 35도 이상 "폭염 경보", 33도 이상 "폭염 주의보"

		Scanner sc = new Scanner(System.in);

		System.out.print("month : ");
		int month = sc.nextInt();
		System.out.print("temp : ");
		int temp = sc.nextInt();

		if (month == 1 || month == 2 || month == 12) {
			if (temp <= -15) {
				System.out.println("한파 경보");
			} else if (temp > -15 && temp <= -12) {
				System.out.println("한파 주의보");
			}
			System.out.println("겨울");
		} else if (month == 3 || month == 4 || month == 5) {

			System.out.println("봄");

		} else if (month == 6 || month == 7 || month == 8) {

			if (temp >= 35) {
				System.out.println("폭염 경보");
			} else if (temp >= 33 && temp < 35) {
				System.out.println("폭염 주의보");
			}
			System.out.println("여름");
		} else if (month == 9 || month == 10 || month == 11) {

			System.out.println("가을");
		} else {
			System.out.println("해당하는 계절이 없습니다.");
		}

	}

}
