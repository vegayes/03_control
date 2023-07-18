package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("1 이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for (int i  = 0 ; i < num ; i++) {
				
				System.out.print(i+1+" ");				
			}
		}
			
	
		
		
		
		
		
	}
	
	public void practice2() {
		
		System.out.print("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		
		if( num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}else {
			for ( int i = num ; i >= 1; i-- ) {
				System.out.print(i+ " ");
			}
		}
	}

	public void practice3() {
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++ ) {
			
			if ( i == num ) {
				System.out.printf(" %d =", i);
			}else {
				System.out.printf(" %d +", i);
			}
			sum += i;			
		}	
			System.out.printf(" %d",sum);
	}
	
	public void practice4() {
		
		System.out.print("첫 번째 숫자 : ");
		int first = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int second = sc.nextInt();
		
		if( first < 1 && second <1 ) {
			System.out.println("1 이상의 숫자를 입력해주세요.");		
		}else {
			if(first < second) {
				for( int i = first ; i <= second; i++) {
					System.out.print(i+" ");
				}
			}else {
				for( int i = second ; i <= first; i++) {
					System.out.print(i+" ");					
				}
			}	
		}	
	}
	
	public void practice5() {
	
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.printf("==== %d단 ====\n", dan);
		
		for(int i = 1; i < 10; i++ ) {
			System.out.printf("%d * %d = %d\n", dan, i , dan*i);		
		}		
	}
	
	
}
