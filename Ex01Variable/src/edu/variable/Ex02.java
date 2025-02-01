package edu.variable;

public class Ex02 {

	public static void main(String[] args) {
		
		//변수명 규칙
		//1. 키워드(예약어) 사용 불가 => 라이트모드 기준 자주색깔 글씨 전부 예약어
		//int public = 1; 예약어는 작성 자체가 불가능, 색깔만 잘 확인해도 이유를 알 수 있음
		//Syntax error on token "public", invalid VariableDeclaratorId

		//2. 대소문자 구분
		int num = 1;
		int Num = 1;
		
		//3. 변수명 길이 제한 없음, 단, 너무 긴 경우에는 가독성이 떨어짐
		//4. 특수문자는 _와 $만 허용함
		//_ : snake case, 상수 선언 시 활용
		int max_size = 10; //snake case (파이썬에서 정통적으로 사용하는 방식)
		int maxSize = 10; //camel case (자바에서 정통적으로 사용하는 방식)
		final int MAX_SIZE = 10; //상수선언시는 camel이 불가능해 snake 사용 
	
		//$ : 변수명에는 잘 사용하지 않음, 컴파일러가 자동 생성 하는 경우 이름에 사용되는 경우 있음
		
		//5. 한글 사용 가능 (but, 사용하지 말 것)
	}

}
