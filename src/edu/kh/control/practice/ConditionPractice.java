package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		String result;

		if (num > 0) {
			
			if (num % 2 == 0) {				
				result = "짝수";				
			} else {				
				result = "홀수";				
			}
			result += "입니다.";
			
		} else {			
			result = "양수만 입력해주세요.";		
		}
		
		System.out.println(result);		
	}
	
	public void practice2() {
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();

		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0 ;
		
		String result ;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.1f\n", avg);
			result = "축하합니다, 합격입니다!";			
		}else {
			result = "불합격입니다.";
		}
		
		System.out.println(result);
	}
	
	
	public void practice3() {
		
		System.out.print("1 ~ 2 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		int date = 0;
		
		switch(month) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			date = 31;
			break;
		case 2:
			date = 28;
			break;
		case 4: case 6: case 9: case 11: 
			date = 30;
			break;
		default :
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
			return;
		}
		System.out.printf("%d월은 %d까지 있습니다.", month, date);
	}
	
	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result;
		
		if(bmi >= 30 ) {	
			result = "고도비만";
		}else if ( bmi >= 25) {
			result = "비만";
		}else if ( bmi >= 23) {
			result = "과체중";
		}else if ( bmi >= 18.5) {
			result = "정상체중";
		}else {
			result = "저체중";
		}
		
		System.out.printf("BMI 지수 : %.14f\n", bmi); //?? 소수점 까지 세야하나?
		System.out.printf(result);		
	}
	
	public void practice5() {
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int last = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int assignment = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int attendance = sc.nextInt();
		
		System.out.println("============결과============");
		
		double midScore = mid * 0.2;
		double lastScore = last * 0.3;
		double assignmentScore = assignment * 0.3;
		double attendanceScore = attendance *5 * 0.2;
		double absentStandard = 20 * 0.7; // 6번
		
		double total = midScore + lastScore + assignmentScore + attendanceScore;
		
		String result;
		
		if( attendance < absentStandard) {
			System.out.printf("Fail [출석 횟수 부족(%d/20)",attendance);
			return;
		}else {
			
			System.out.printf("중간 고사 점수(20) : %.1f\n", midScore);
			System.out.printf("기말 고사 점수(30) : %.1f\n", lastScore);
			System.out.printf("과제 점수     (30) : %.1f\n", assignmentScore);
			System.out.printf("출석 점수     (20) : %.1f\n", attendanceScore);
			System.out.printf("총점 : %.1f\n", total);
			
			if(total < 70) {
				result = "Fail [점수 미달]";
			}else {
				result = "PASS";
			}
		}
			System.out.println(result);
	}
}
