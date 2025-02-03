package edu.exswitch;

public class Ex01switch {

	public static void main(String[] args) {
		
		//switch문 (조건식-true/false 가 아닌 값 자체로 실행구문이 달라짐)
		//주의! 각 case는 독립적이지 않고 특정 case가 실행되는 경우
		//아래있는 모든 구문이 이어지도록 되어 있음 (fall-through)
		
		//해당 case구문만 실행하고 switch문을 중단하고 싶다면 "break" 키워드를 사용해야함
		
		//** break => 실행 흐름 제어(해당 구문 즉시 종료) ~> 반복문, switch문에서 사용

		String teacher = "강예진";
		//String teacher = "권승호";
		
		switch(teacher) {
		case "정연희":
		//case "정연희", "임명진":
			System.out.println("오늘은 한솥 메뉴 크롤링 해봅시다!");
			//break;
		case "권승호":
			System.out.println("오늘은 조건문 활용해서 자판기 예제 풀어볼게요!");
			//break;
		case "강예진":
			System.out.println("오늘은 조건문 활용해서 버스카드 예제 풀어볼게요!");
		}
		
	}

}
