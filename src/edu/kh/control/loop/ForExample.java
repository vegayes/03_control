package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	/* for문
	 * => 끝이 정해져 있는 (횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법]
	 * for(초기식 ; 조건식; 증감식) {
	 * 	 "반복 수행할 코드";
	 * }
	 * 
	 * ->> 초기식 : for문을 제어하는 용도의 변수 선언
	 * ->> 조건식 : for문의 반복 여부를 지정하는 식
	 * 				보통 초기식에 사용된 변수를 이용하여 조건식을 작성함.
	 * ->> 증감식 : 초기식에 사용된 변수를 
	 * 				for문이 끝날 때 마다 증가 또는 감소시켜
	 * 				조건식의 결과를 변하게 하는 식
	 * 				(=> 증감식이 없으면 항상 초기값을 가지기 때문에 무한 반복함.)  
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// for문 기초 사용법1
		// 1 ~ 10 출력하기
		// 1부터 10까지 1씩 증가하며 출력
		
		// * 반복문은 조건식이 true일 때만 반복한다.
		
		for (int i  =  1 ; i <= 10 ; i++ ) {
			// 초기식   // 조건식  // 증감식
			
			// 반복 수행할 코드
			System.out.println(i);			
		}
	}
		
	public void ex2() {
		// 3에서 7까지 1씩 증가하며 출력		
		for( int i = 3; i < 8 ; i++) {// 어디서부터 시작할 수 있을지 알 수 있음.	
			System.out.println(i);			
		}
	}
	
	public void ex3() {
		//2 부터 15까지 1씩 증가하며 출력		
		for ( int i =2 ; i < 16; i++) {
			System.out.println(i);		
		}		
	}
	
	public void ex4() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		
		System.out.print("입력 값 :");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num ; i++) {
			
			System.out.println(i);
			
		}
		
		
	}

	public void ex5() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1  ; i <= num ; i = i+2) {		
			System.out.println(i);			
		}
		
	}
	
	public void ex6() {
		
		// 1.0부터 입력 받은 실수 까지 0.5씩 증가하며 출력
		
		System.out.print("실수 입력 : ");
		
		double num = sc.nextDouble();
		
		for ( double i = 1.0 ; i <= num; i = i + 0.5) {
			
			System.out.println(i);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
