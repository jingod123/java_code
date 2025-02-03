package edu.exif;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("잔액 : ");
		int cardBalance = sc.nextInt();
		System.out.print("성인/청소년/어린이 : ");
		String ageGroup = sc.next();
						
		if(ageGroup.equals("성인")&&cardBalance>=1800) {
			System.out.println("감사합니다");
		}else if(ageGroup.equals("청소년")&&cardBalance>=1500) {
			System.out.println("반갑습니다");
		}else if(ageGroup.equals("어린이")&&cardBalance>=1000) {
			System.out.println("안녕하세요");
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}

}
