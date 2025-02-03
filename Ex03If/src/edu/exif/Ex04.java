package edu.exif;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		//자바

		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		//int score = 80; //이번에는 직접 입력받아야함
		int inputScore = sc.nextInt(); //alt+shift+r => 변수명 한번에 바꾸기
				
		if(inputScore >= 90) {
			System.out.println("A학점입니다"); 
		}else if(inputScore>=80) {
			System.out.println("B학점입니다");
		}else if(inputScore>=70) {
			System.out.println("C학점입니다");
		}else {
			System.out.println("F학점입니다");
		}
		
	}

}
