package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("1 이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 0; i < num; i++) {

				System.out.print(i + 1 + " ");
			}
		}
	}

	public void practice2() {

		System.out.print("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice3() {

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {

			if (i == num) {
				System.out.printf(" %d =", i);
			} else {
				System.out.printf(" %d +", i);
			}
			sum += i;
		}
		System.out.printf(" %d", sum);
	}

	public void practice4() {

		System.out.print("첫 번째 숫자 : ");
		int first = sc.nextInt();

		if (first < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			System.out.print("두 번째 숫자 : ");
			int second = sc.nextInt();

			if (second < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				if (first < second) {
					for (int i = first; i <= second; i++) {
						System.out.print(i + " ");
					}
				} else {
					for (int i = second; i <= first; i++) {
						System.out.print(i + " ");
					}
				}
			}
		}
	}

	public void practice5() {

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan < 2) {
			System.out.println("<Error!> 2 이상 정수로 입력해주세요.");
		} else {

			System.out.printf("==== %d단 ====\n", dan);

			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		}
	}

	public void practice6() {

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num < 2 || num > 9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for (int i = num; i < 10; i++) {

				System.out.printf("==== %d단 ====\n", i);

				for (int j = 1; j < 10; j++) {

					System.out.printf("%d X %d = %d\n", i, j, i * j);
				}

				System.out.println();
			}

		}

	}

	public void practice7() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1이상의 정수로 입력해주세요!");
		} else {
			for (int i = 0; i < num; i++) {

				for (int j = 0; j <= i; j++) {

					System.out.printf("*");
				}
				System.out.println();
			}
		}
	}

	public void practice8() { // ******

		System.out.printf("정수 입력 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("정수를 입력해주세요");

		} else {
			for (int i = num; i > 0; i--) {

				for (int j = i; j > 0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public void practice9() {

		System.out.print("정수 입력 : "); // 3
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // \n
			for (int j = 1; j <= num - i; j++) { // 한 줄
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice10() {

		System.out.print("정수 입력 :");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = num - 1; i > 0; i--) {

			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice11() {

		// 정수 입력 : 4
		// *
		// ***
		// *****
		// *******

		System.out.print("정수 입력 :");
		int num = sc.nextInt();

		// num = 5
		for (int i = 1; i <= num * 2; i += 2) { // 1 :: 3

			for (int j = num * 2; j >= i; j -= 2) { // 10 8 6 4 2 :: 10 8 6 4
				System.out.print(" ");
			}
			for (int a = 1; a <= i; a++) { // 1 :: 1 2
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice12() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // \n코드 OO

			if (i == 1 || i == num) {// 첫 번째 줄이랑 마지막 줄
				for (int j = 1; j <= num; j++) { // 한 줄의 코드 OO
					System.out.print("*");
				}
				System.out.println();
			} else { // 다른 줄은 첫번째랑 마지막만 *
				for (int w = 1; w <= num; w++) {
					if (w == 1 || w == num) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		System.out.println();

	}

	public void practice13() {

		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int count = 0;

		if (num < 1) {
			System.out.println("자연수로 다시 입력해주세요");
		} else {

			for (int i = 1; i <= num; i++) {

				if (i % 2 == 0 | i % 3 == 0) {
					System.out.print(i + " ");

					if (i % 2 == 0 && i % 3 == 0) {
						count++;
					}

				}
			}
			System.out.printf("\ncount : %d", count);
		}
	}

	public void practice14() { // 11번 피라미드 다른방법 

		System.out.print("정수를 입력해주세요 :");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num - 1 - i; j++) {

				System.out.print(" ");

			}
			for (int a = 0; a < 2 * i + 1; a++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

}
