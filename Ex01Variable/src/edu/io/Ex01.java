package edu.io;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//실제 이름하고 나이만 키보드로 입력받는것
		//나머지는 전부 출력만 하는것
		
		//문제 결과 예시볼 때 주의할점!
		//무조건 위에서 아래로, 왼쪽에서 오른쪽으로 봐야함!

		//System.out.println("이름 : ");
		System.out.print("이름 : ");
		
		//스캐너 코드 외우려고 하지말고 그냥 가져오기
		Scanner sc = new Scanner(System.in);
		String inputName = sc.next();  //코드 직접 먼저 써보기
		
		//확인 -> 코드 다쓰고 확인하면 오류 발생시 해결하기 힘듦 / 내 기준으로 단계를 나누어 단계별로 확인할 것
		//=> 디버깅(Debugging) : 프로그램의 오류나 문제를 찾아 수정하는 과정, 코드가 의도한 대로 동작하는지 확인하고 오류 해결
		
		//비슷한게 있다면 코드를 가져와서 수정하는 것이 좋음 => 이전 코드는 이미 잘 동작하는지 확인했으니까!
		System.out.print("나이 : ");
		
		//스캐너 코드 외우려고 하지말고 그냥 가져오기
		//Scanner sc = new Scanner(System.in); 내가 사진 스캔을 하고 싶을때마다 새 스캐너를 사나요? 스캐너는 하나면 됨
		int inputAge = sc.nextInt(); //코드 먼저 바꿔보기
		//String으로 해도 문제는 없음! 왜? 계산을 안하고 출력만 할것이기 때문
		//만약 한해가 지나면 자동으로 나이를 1씩 증가하는 등 숫자 계산을 하려면 무조건 정수형으로 써줘야됨
		
		System.out.printf("이름은 %s이고 나이는 %d입니다", inputName, inputAge);
		//문자열 포맷팅
		System.out.println("이름은 "+inputName+"이고 나이는 "+inputAge+"입니다");
		//문자열 더하기
		
	}

}
