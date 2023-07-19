package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {

	/*
	 * while문 => 별도의 초기식, 증감식이 존재하지는 않고 반복 종료 조건을 자유롭게 설정하는 반복문.
	 * 
	 * ** 확실히 언제 반복이 끝날지는 모르지만, 언젠가 반복 조건이 false가 되는 경우 반복을 종료한다.
	 * 
	 * [작성법] while ( 조건식 ){
	 * 
	 * 조건식이 true일 때 반복 수행할 구문
	 * 
	 * 
	 * }
	 * 
	 */
	Scanner sc = new Scanner(System.in);

	public void ex1() {

		int input = 0; // while문의 종료 조건

		while (input != 9) {
			// input에 저장된 값이 9가 아닌 경우 반복

			System.out.println("=".repeat(5) + "메뉴선택" + "=".repeat(5));
			System.out.println("1. 떡볶이");
			System.out.println("2. 튀김");
			System.out.println("3. 순대");
			System.out.println("9. 종료");

			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();

			switch (input) {

			case 1:
				System.out.println("떡볶이를 주문하셨습니다.");
				break;
			case 2:
				System.out.println("튀김를 주문하셨습니다.");
				break;
			case 3:
				System.out.println("순대를 주문하셨습니다.");
				break;
			case 9:
				System.out.println("종료를 주문하셨습니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}

		}

	}

	public void ex2() {

		// 입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복 종료 후 결과 출력
		// ->> 0이 입력되지 않으면 계속 반복해라.

		int sum = 0; // 모든 정수의 합을 저장하는 변수

		int input = -1; // 양수보다 누르지 않을 거 같은 수로 초기화 함. (입력 받은 값을 저장할 변수)

		while (input != 0) {

			System.out.print("합을 구할 정수를 입력해주세요! \n(단, 0은 종료됨) \n>>");

			input = sc.nextInt();

			sum += input; //

		}
		System.out.print("종료합니다. \n누적된 합은 = " + sum);
	}

	public void ex3() {

		int input = 0; // 입력 받은 값을 저장할 변수 ( => while문 진행할건데 0으로 초기화 하고 싶을 때)

		int sum = 0;

		// do - while 문 :: while문을 최소 한번은 수행하는 반복문

		do {
			System.out.print("합을 구할 정수를 입력해주세요! \n(단, 0은 종료됨) \n>>");

			input = sc.nextInt();

			sum += input;

		} while (input != 0); // 위 상황과 동일하게 입력된 값이 0이면 종료함.

		System.out.print("종료합니다. \n누적된 합은 = " + sum);

	}

}
