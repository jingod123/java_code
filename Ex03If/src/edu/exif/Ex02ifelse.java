package edu.exif;

public class Ex02ifelse {

	public static void main(String[] args) {
		
		// 숫자가 10이상이면 "10이상" 출력, 10보다 작으면 "10이상 아님" 출력
		//파이썬
		// num = 12
		// if num >= 10 :
		//		print('10이상')
		// else :
		//		print('10이상 아님')

		int num = 12;
		
		if(num >= 10) {
			System.out.println("10이상");
		}else {
			System.out.println("10이상 아님");
		}
		
		//실행 문장이 한줄씩이므로 이경우에도 {} 생략 가능
		if(num >= 10)System.out.println("10이상");
		else System.out.println("10이상 아님");
		
	}

}
