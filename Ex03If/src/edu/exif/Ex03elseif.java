package edu.exif;

public class Ex03elseif {

	public static void main(String[] args) {
		
		// 점수가 90점 이상이면 "A", 80점 이상 90미만 이면 "B" 
		// 70이상 80미만이면 "C", 나머지 "F" 출력
		//파이썬
		// score = 84
		// if score >= 90 :
		//		print('A')
		// elif 80<=score<90 :
		//		print('B')
		// elif 70<=score<80 :
		//		print('C')
		// else :
		//		print('F')

		//자바
		int score = 80;
		
		if(score >= 90) {
			System.out.println("A"); //해당하면 아래 else if 문은 확인도 하지 않고 바로 전부 나가버림 `~> 아래 출력문 쪽으로 감
		}else if(score>=80&&score<90) { //어짜피 90이상 값은 이 조건을 확인하지도 않음! -> 90과 비교하는 것은 생략해도됨! (써도 되긴하지만 쓸모없는 연산을 2번 추가하는 꼴임)
			//80<=score<90 는 자바 문법으로는 작성 불가!
			//score가 80이상이면서 90미만일경우 score>=80&&score<90
			System.out.println("B");
		}else if(score>=70&&score<80) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		System.out.println("ifelse문 끝!");
		
		//** if~else 문은 제일 위에 있는 조건부터 차례대로 확인함
		//해당 조건식의 결과가 true 일 경우에는 실행문장 실행 후 전체 블록을 나가버림!
		//조건식의 결과가 false인 경우에는 다음 조건을 확인함
		
		if(score >= 90) {
			System.out.println("A"); 
		}else if(score>=80) { 
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		System.out.println("ifelse문 끝!");
		
		
		//단순 if문 여러개와 if~else문 차이 확인하기
		//1,2,3,4 로 체크해서 실행 순서로 확인하기
		int num = 50;
		if(num<=20) {
			System.out.println("20이하");
		}else if(num <=35) { //이조건은 확인하지 않음! 출력안됨
			System.out.println("35이하");
		}
		
		//두조건 전부 확인함
		if(num<=20) {
			System.out.println("20이하");
		}
		
		if(num <=35) {
			System.out.println("35이하");
		}
		
	}

}







