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
	} // 두 변수의 값 교환 방법도 해보기! 
	

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

	public void practice8() { 

		System.out.printf("정수 입력 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("정수를 입력해주세요");

		} else {
			for (int i = num; i > 0; i--) {   // 그냥 받은 값의 줄만 출력하면 됨.

				for (int j = i; j > 0; j--) { // 근데 여기서 받은값을 줄어들게 해서 출력해야하므로 기준값을 처음으로 잡았는데,, 
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
	
	public void practice9Try() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for( int i = 1 ; i <= num ; i++) {
			
			for( int a = num - i ; a > 0; a--) {
				
				System.out.print(" ");
			}
			
			for( int b = 0 ; b < i; b++) {
				
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
	
	
	public void practice10Teacher() {

			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			// 위쪽 삼각형
			for(int row = 1 ; row <= input ; row++) {
				for(int col = 1 ; col <= row ; col++) {
					System.out.print("*");
				}
				System.out.println(); // 줄바꿈
			}
			
			// 아랫쪽 삼각형
			for(int row = input - 1; row >= 1 ; row--) {
				for(int col = 1 ; col <= row ; col++) {
					System.out.print("*");
				}
				System.out.println(); // 줄바꿈
			}
			
			
			System.out.println("====================");
			
			// 줄의 수: input에 2를 곱한값의 -1
			for(int row = 1; row <= input*2-1; row++) {
	         
	    	  if(row < input) {
	        	  
	             for(int col=1; col <= row; col++) {
	                System.out.print("*");
	             }
	             
	          } else {
	             for(int col=input ; col > row-input; col--) {
	                System.out.print("*");
	             }
	          }
	          
	          System.out.println();
	       }

		
	}
	
	

	public void practice11() {

		// 정수 입력 : 4
		// 피라미드

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

	public void practice11Try() { // 11번 피라미드 다른방법 

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
	
	
	public void practice11Try2() { // 11번 피라미드 다른방법2

		System.out.print("정수를 입력해주세요 :");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int j = 0; j < num - i; j++) {

				System.out.print(" ");

			}
			for (int a = 0; a < 2 * i - 1; a++) {

				System.out.print("*");

			}

			System.out.println();
		}
	}
	
	/* 실습문제 11
	다음과 같은 실행 예제를 구현하세요.
	ex.
	정수 입력 : 4
	    *
	   ***
	  *****
	 *******
	*/
	// 양쪽으로 하나씩 늘어남
	// 입력한 정수의 줄 만큼
	public void practice11Teacher() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		// 4입력시
		int input = sc.nextInt();
						// 1) 1 <= 4
		for(int row = 1 ; row <= input ; row++ ) {
	
			// if문을 이용한 풀이   1 <= 4 * 2 - 1;
			for(int col = 1 ; col <= input * 2 - 1; col++) { // 홀수개씩 나오니까.
				// 마지막 줄의 별 갯수: input에 2를 곱한값의 -1
				//		row	  col ||      row  col
				//1)  4 - 1 >= 1  ||  4 + 1 <= 1  true
				//2)  4 - 1 >= 2  ||  4 + 1 <= 2  true
				//3)  4 - 1 >= 3  ||  4 + 1 <= 3  true
				//4)  4 - 1 >= 4  ||  4 + 1 <= 4  false
				if( input-row>=col || input+row<=col) { 
					System.out.print(" ");
					
				}else{
					System.out.print("*");
				}
			}
			
			System.out.println(); // 줄바꿈
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

				if (i % 2 == 0 || i % 3 == 0) {
					System.out.print(i + " ");

					if (i % 2 == 0 && i % 3 == 0) {
						count++;
					}

				}
			}
			System.out.printf("\ncount : %d", count);
		}
	}



}
