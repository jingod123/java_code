
public class Ex06논리연산 {

	public static void main(String[] args) {
		
		//논리연산 : NOT(!) / AND(&&) / OR(||)
		//** 논리연산은 boolean 타입의 값만 연산할 수 있고 결과도 무조건 boolean 타입으로 나옴
		// boolean 값과 같이 쓰여야 하기때문에 비교연산자(결과값 무조건 boolean)와 같이 쓰이는 경우가 많음
		
		//비교연산이 연산순위가 높기 때문에 (먼저수행되기때문에) 괄호 칠 필요없음
		System.out.println(1<3&&4<5);
		System.out.println(2<1&&4<5);
		System.out.println(1<3||4<2);
		System.out.println(2<1||4<2);		
		
		//dead code 확인하기

	}

}
