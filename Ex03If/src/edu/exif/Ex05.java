package edu.exif;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 입력 : ");
		//int score = 80; //이번에는 직접 입력받아야함
		String inputAlpha = sc.next(); //alt+shift+r => 변수명 한번에 바꾸기
				
		//inputAlpha == "A" 결과값 자체가 false 라는것!
		//비교연산자 >,<,>=,<=,==,!=
		//>,<,>=,<= : 숫자끼리 비교할 때만 씀
		//System.out.println(true>false);
		
		//==, !=
		//기본타입끼리 비교할 때 : 값 자체의 동등성 비교
		//기본타입은 다른 기능 없이 저장한 값만 저장하고 있기 때문
		
		//레퍼런스타입끼리 비교할 때 : 저장하고 있는 값 자체를 비교하는게 아니라 레퍼런스(참조)값을 비교 //~~> 추후 객체에서 설명
		//즉) String 타입은 레퍼런스타입이기때문에 == 으로는 값 자체가 같은지 다른지는 비교할 수 없음
		//레퍼런스는 자기만의 기능을 가지고 있음 / .equals()
						
		if(inputAlpha.equals("A")) {
			System.out.println("A입력"); 
		}else if(inputAlpha.equals("B")) {
			System.out.println("B입력");
		}else if(inputAlpha.equals("C")) {
			System.out.println("C입력");
		}else {
			System.out.println("A,B,C외 입력");
		}
		
	}

}
