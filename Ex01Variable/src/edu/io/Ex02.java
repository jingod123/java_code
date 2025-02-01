package edu.io;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//이름을 /강 예진/ 이라고 입력해보기
		
		//Scanner sc = new Scanner(System.in);스캐너는 메인메서드에서 시작 부분에 쓰는 것을 권장함
		
		//일단 코드 다시한번 써보기
		System.out.print("이름 : ");

		Scanner sc = new Scanner(System.in);
		//String inputName = sc.next(); 
		String inputName = sc.nextLine(); 

		System.out.print("나이 : ");
		int inputAge = sc.nextInt();
		//이름에 띄어쓰기를 포함하면 나이를 입력하지 않아도 nextInt() 부분에서 예외상황 발생함
		
		//Buffer(버퍼): 임시 데이터 저장소
		//System.in(입력도구 : 키보드) -> "안녕하세요" 라고 입력했다고 가정
		//"안녕하세요" 문장은 한번에 받아들여서 처리하는게 아니라
		// ㅇㅏㄴㄴㅕㅇㅎㅏㅅㅔㅇㅛ (byte형식(0,1)로 자음 모음 하나하나 받아들이기 때문)
		// 입력한 각 음소를 임시저장공간인 버퍼에 입력된 순서대로 일단 저장해둠
		
		//next(), nextInt() 기능이 호출되면 버퍼에서 데이터를 가져와서 쓰는 순서
		
		//* 공백문자(스페이스, 탭, 줄바꿈 -> 따로 입력되는 문자는 없지만 입력하기는 한거임!)
		//next() -> 공백문자는 처리하지 않음
		
		//String inputName = sc.next(); 버퍼: 강 예진  next() -> 강
		//버퍼 : _(공백)예진
		//int inputAge = sc.nextInt(); 예진 을 처리하려고함
		
		// 공백도 같이 처리할 수 있는 기능을 써야함 : nextLine() -> 한줄 한꺼번에 처리
		
		System.out.printf("이름은 %s이고 나이는 %d입니다", inputName, inputAge);

		
		//Resource leak: 'sc' is never closed
		//노란줄은 오류 x, 경고 => 한번쯤은 꼭 확인해보는게 좋음!
		//Resource leak : 자원 누수 -> 사용 후 제대로 닫지 않아서 발생함
		
		//Scanner 는 일반 기본 타입의 변수들과는 다르게 할 수 있는 일이 많음 <- 돈(자원)을 많이 줘야함
		//(자원 : 메모리, 기타 시스템 리소스-Scanner가 동작할 수 있도록 만들어주는 것)
		
		//지금은 코드가 매우 짧은 편이라 프로그램에 크게 영향을 미치지 않음
		//나중에 코드가 길어졌을 때 스캐너를 프로그램의 초반 부분에만 쓰고 더이상 사용하지 않더라도 
		//따로 닫아주지않으면 프로그램이 끝날때 까지 자원을 줘야함 -> 비효율적임
		//"never closed" 라고 뜨는 경우에는 다 사용을 한 후 닫아주는 것이 적절함
		sc.close();
		
		//이 밑에서는 sc(Scanner) 쓸수 없음
		
		//우리눈에는 위쪽에서 닫혔기 때문에 코드자체를 쓸 수 없는 것처럼 느껴지지만 문법자체는 오류가 없기 때문에 오류표시 안해줌
		//하지만 실제 프로그램이 실행이 되면 닫힌다음에 쓰려고 하기 때문에 예외발생으로 판단함
		//(사람입장에서 생각하면 안됨!)
		//sc.next();
		//IllegalStateException: Scanner closed
	}

}











