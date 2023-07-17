package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {

	Scanner sc = new Scanner(System.in);

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

		String season; // 아래 조건문 수행 결과를 저장할 변수 선언

		if (month == 1 || month == 2 || month == 12) {

			season = "겨울";

			if (temp <= -15) {
				// season = "겨울 한파 경보";
				season += " 한파 경보";
				// season = season + "한파 경보" :: 문자열 이어쓰기
			} else if (temp <= -12) { // 순서 주의!
				season += " 한파 주의보 ";
			}

		} else if (month >= 3 && month <= 5) {

			season = "봄";

		} else if (month >= 6 && month <= 8) {

			season = "여름";

			if (temp >= 35) {
				season += " 폭염 경보";
			} else if (temp >= 33) {
				season += " 폭염 주의보";
			}

		} else if (month >= 9 && month <= 11) {

			season = "가을";

		} else {

			season = "해당하는 계절이 없습니다.";

		}

		System.out.println(season);
	}

	public void ex5() {

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		String people;

		if (age <= 13) {
			people = "어린이";
		} else if (age <= 19) {
			people = "청소년";
		} else {
			people = "성인";
		}

		people += "입니다.";

		System.out.println(people);

	}
	
	public void ex6() {
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
				
		String score1 ;
		
		if(score > 100 || score < 0) {
		 score1 = "잘못 입력하셨습니다.";
		}else if (score >= 90) {
			score1 = "A";
		}else if (score >= 80) {
			score1 = "B";
		}else if (score >= 70) {
			score1 = "C";
		}else if (score >= 60) {
			score1 = "D";
		}else {
			score1 = "F";
		}
		
		System.out.println(score1);
	}

	
	public void ex7() {
	
		System.out.print("나이 , 키  : ");
		int age = sc.nextInt();
		Double height = sc.nextDouble();
		
		String warning ;
		
		if(age <0 || age > 100) {
			
			warning = "잘못 입력 하셨습니다.";
			
		}else if ( age < 12 ) {
			
			warning = "적정 연령이 아닙니다.";
			
		}else if ( height < 140.0) {
			
			warning = "적정 키가 아닙니다.";
			
		}
		
		
		
		
	}
}
