package edu.io;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		//scanner, inputScanner, sc(간단하게 쓸때만 사용)
		Scanner sc = new Scanner(System.in);
		
		//코드분석
		// =(대입연산자) 기준 오른쪽 부터 보기
		// * 대입연산자 왼쪽에는 변수이름이나 변수 선언 식 (타입 변수명 ex. int a) 만 올수 있다!
		
		// new Scanner(System.in)
		
		// new : 자바에서 새 객체(도구) 생성 시 사용하는 키워드 (자바는 객체지향언어)
		// Scanner : 타입(레퍼런스 타입) -> 클래스파일로 따로 정의되어 있음 (java.util 패키지) -> jdk에 기본적으로 포함
		// new Scanner() => Scanner 타입의 새로운 도구를 만들겠다.
		// *** 일반적으로 타입 뒤에 () 붙지 않음 => 특별한 경우에만 붙음 (새로운 도구 생성할 때)
		
		String s1 = "Hello";
		String s2 = new String("Hello"); //새로운 String 타입의 도구를 생성하겠다
		System.out.println(s2);
		
		//System.in
		//System : 표준 입출력 클래스(값과 기능의 모음) => 입출력에 관련된 값이나 기능을 사용할 수 있다
		//System.in : in(들어오는것 -> 입력(주로 키보드)), System이 가지고 있는 in이라는 값을 쓰겠다, 입력도구
		
		//입력 : 키보드, 카메라, 마이크 ..
		
		//new Scanner(System.in)
		//코드 보는 방법 (실행순서와 동일함)
		//1. 위에서 부터 아래로
		//2. 대입연산자 오른쪽
		//3. 괄호 안 부터
		
		//해석 : System이 가지고 있는 in 값을 사용해서 새로운 Scanner 타입 도구를 생성할거야
		
		//new String("Hello")
		//해석 : "Hello" 값을 사용해서 새로운 String 타입 도구 생성할거야 ~> "Hello" 문자열 생성할거야
		
		//Scanner(스캐너): 그림이나 사진의 화상, 또는 문자나 바코드 등을 읽어 들이는 입력 장치.
		//사진(그림)을 스캐너로 스캔을 하면 -> *디지털화(ex. 이미지-> RGB값)* -> 컴퓨터에 이미지(pdf) 파일이 저장이됨
		
		//=> 키보드를 사용해서 입력(타이핑)을 하면 -> 바이트 코드(0,1 - 2진수)  (System.in)
		// 즉, System.in 만 이용하더라도 입력해서 컴퓨터에 전달을 할 수 있지만 그 값을 0,1 로만 이루어져 있음
		// -> 사람이 알아보기 힘듦
		// -> 사람이 사용하는 언어로 변환 (Scanner 가 하는 역할!!!!)
		
		//new Scanner(System.in) : 입력도구(키보드)로 입력한 값을 사람이 알아볼 수 있는 형태로 변환해주는 Scanner 도구 생성
		//도구를 만들었다! -> 다음에도 사용하려면? -> 보관(저장) => 항상 저장은 변수(상수)에!
		
		Scanner scanner = new Scanner(System.in);
		//일반적으로 new 사용할때에는 new 뒤에 쓴 타입과 같은 타입으로 변수 선언해주면됨!
		
		//Scanner에서 자주 사용되는 메서드(기능)
		String input = scanner.next(); //기능(메서드)의 결과값을 변수에 담을 수 있음
		//String input2 = (String)scanner.nextBoolean(); //boolean에서 String 으로 형변환 안해줌 
													   //일반적으로 기본타입끼리만 형변환 가능 / () ~> 상속에서 설명
		boolean input2 = scanner.nextBoolean(); 
		//String result = System.out.println("test");  void 일 경우에는 불가능
	
		//여기까지만 쓰고 Output 실행해봤을때랑 뭐가 다른지, 콘솔이 정지되지 않았따 (프로그램이 아직 실행중이다!, 입력을 안했기 때문에)
		
		//input2부분 오류 발생
		//Exception in thread "main" java.util.InputMismatchException
		//** Exception 코드 출력 시 무조건 확인! 오류코드 분석! **
		//Exception : 예외상황 (나도 예상치 못한 상황이 발생했다!)
		
		//InputMismatchException : 오류코드!
		//InputMismatch : 입력이 맞지 않다! 
		//nextBoolean : 결과값이 boolean ~~~> "안녕"을 입력함 -> true? false? (변환 불가!) ~~> 잘못된 타입으로 입력했다!
	
	
		int input3 = scanner.nextInt();
	   //next~ 기능의 결과값은 사용자가 입력한 값 => 앞에 선언한 변수에 저장됨
		System.out.println(input3);
		System.out.println(input);
	
	}

}





