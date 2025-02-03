package edu.exif;

public class Ex01if {

	public static void main(String[] args) {
		
		// 숫자가 10이상이면 "10이상" 출력
		//파이썬
		// num = 12
		// if num >= 10 :
		//		print('10이상')  //들여쓰기가 중요!
		
		//자바
		int num = 10;
		//int num = 8; -> 조건식 결과가 false 이므로 아무것도 출력이 되지않음 (프로그램이 종료되는 것은 아님!)
		if(num >= 10) { //조건식은 꼭 () 안에 작성해야함! (필수)
			System.out.println("10이상"); //조건에 해당할 경우 실행할 문장은 {} 안에 작성해야함! (생략할 수 있는 경우가 있음)
			System.out.println("출력");
		}
		
		if(num >= 10) // {} 생략 가능 -> 단, 실행문장이 1개 인경우
					  // but, 생략하는 것은 권장하지 않음! ({}사용해서 정확하게 영역을 구분해주는 것이 좋음)
			System.out.println("10이상");

		if(num < 10)
		System.out.println("10이상이 아님"); //들여쓰기를 하지 않아도 상관은 없지만 들여쓰기 해줄것! (부모-자식 관계)
			System.out.println("여기는 출력이될까?"); //의도한 바로는 출력이 안되야 하는데 출력됨! 
			
		//조건문은 조건을 어떻게 세우느냐가 가장 중요!	
		
		System.out.println("if문 나옴");
	}

}
