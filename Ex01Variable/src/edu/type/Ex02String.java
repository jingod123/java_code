package edu.type;

public class Ex02String {
	
	public static void main(String[] args) {
		
		//기본타입 문자형 => char : 문자 한개 저장할 수 있음
		//문장을 표현하려면? 파이썬 리스트 같은 구조인 배열을 활용해야함 => 불편 => String (기본타입 x, 레퍼런스타입)
		//내부적으로는 char 형을 사용하는 형태로 동작함
		
		String s = "Hello World";  //"" 큰따옴표 사용
		//char -> 'H' => 작은따옴표 사용
		//파이썬에서는 '', "" 둘다 상관없이 문자열을 표현할 수 있음
		//=> 자바가 파이썬보다 문법을 '엄격히' 확인함
		
		//기본타입(Primitive) VS 레퍼런스타입(참조타입) (Reference)
		//1. 기본타입은 8개로 고정 그외에는 전부 레퍼런스타입
		//boolean, char, byte, short, int, long, float, long
		
		//2. 타입의 가장첫번째 글자가 소문자면 기본 / 대문자면 레퍼런스
		
		//3. 기본타입은 데이터 저장외에 기능 없음, 레퍼런스 타입은 데이터 저장 뿐 아니라 다양한 기능을 가지고 있음
		int a = 10;
		String b = "hi";
		
		//a.  -> 기능 x
		//b. b -> String (String 이 가지고 있는 기능 확인)
		
		//* 레퍼런스는 타입이 라이트모드 기준으로 자주색 x -> 예약어가 아님 => 변수명으로 사용 가능하지만 사용하지 말것!!!
		//         => 일단 헷갈림!
		int String = 10;  //권장하지 않음

		String c = "Hello";
		//문제, 위 데이터 타입의 크기는?
		
		//저장된 데이터에 따라서 달라짐!
		//내부적으로는 문자 하나하나를 char 로 다룸 => 문자 하나당 2byte
		
		//문자 5개 문자 => 10byte + 약 16byte (String 자체 크기)
	}
	
}
