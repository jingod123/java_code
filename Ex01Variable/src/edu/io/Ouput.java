package edu.io;

public class Ouput {

	public static void main(String[] args) {
		
		//콘솔에 출력 단축키 "syso" + ctrl + space
		System.out.println();
		
		//System : 표준 입출력 클래스(값과 기능의 모음) => 입출력에 관련된 값이나 기능을 사용할 수 있다
		//뒤에 ()가 있으면 기능(메서드) / 없으면 값
		//System.out : out(나가는것 -> 출력), System이 가지고 있는 out이라는 값을 쓰겠다 , 출력도구
		
		//출력 : 모니터, 스피커 ... / 여기서는 콘솔(*, 텍스트기반 인터페이스(화면)), 웹브라우저 (HTML 기반 인터페이스(화면))
		
		//System.out.println() : println(출력관련 인데 () 가 있으니까 기능(메서드))
		//            , System.out이 가지고 있는 println() 이라는 기능을 사용하겠다
		
		//**기능(메서드)은 항상 사용 방법을 확인해야함 / println 뒤에 커서두고 ctrl+space
		//println(String x) : void => () 안에 문자열을 넣어줘야 하고 결과값을 따로 없어 (결과값은 나중에 메서드 부분에서 따로 다룸)
		//println(int x) => 정수형을 넣어라
		// => 즉 println의 사용법은 내가 출력하고 싶은 앖을 () 안에 넣어주기만 하면됨!
		//println() 으로 비어져 있는 것도 있음
		
		//System.out.print  => print, printf, println (println 만 빈 메서드가 있음)
		
		//print : 단순 출력
		//println : 출력 후 자동 줄바꿈
		//printf : 서식지정을 통해 일정 형식으로 출력 (파이썬 문자열 포맷팅 .format 하고 비슷)
		
		System.out.print("안녕"); //ctrl+alt+아래방향키로 코드 복사
		System.out.print("안녕");
		System.out.println("안녕");
		//System.out.println(); 나중에 추가 후 확인
		System.out.println("안녕");
		//** 항상 코드는 위에서 아래로 흐름
		System.out.print("안녕");
		System.out.println("안녕");
		
		//타입에 상관없이 출력하고 싶은값 넣기
		System.out.println(1);
		System.out.println('a');
		System.out.println(true);
		System.out.println(3.14);
		
		//printf 사용법 : 서식 지정자를 같이 사용함
		//%d : 정수형, %s : 문자열, %f : 부동소수점(실수)형
		//System.out.printf("서식(서식지정자 활용)", 서식지정자 자리에 들어갈 값 순서대로 넣기);
		
		// 1. 떡볶이 (1000원)  1, 떡볶이, 1000 -> 서식 지정
		System.out.printf("%d. %s (%d원)\n", 1, "떡볶이", 1000);
		System.out.printf("%d. %s (%d원)", 2, "오뎅", 2000);
		//줄바꿈 : printfln 은 없음  => 줄바꿈(개행) 문자 (\n) 사용
		//\n은 유니코드에서 개행문자를 나타내는 특수문자여서 자바에서 뿐만아니라 통상적으로 줄바꿈문자로 사용되고 있음
		
	}

}





