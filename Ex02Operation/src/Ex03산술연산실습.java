
public class Ex03산술연산실습 {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2); //정수끼리 계산이라 실수 결과가 나올 수 없음
		
		//num1, num2 둘중 하나는 실수
		System.out.println((double)num1/num2);
		System.out.println((double)(num1/num2)); //산술 연산은 기본 순서에 따름 () 먼저 연산
		
		
		System.out.println("더하기 결과 : " + (num1+num2));
		System.out.println("빼기 결과 : " + (num1-num2));
		System.out.println("곱하기 결과 : " + (num1*num2));
		System.out.println("나누기 결과 : " + ((double)num1/num2));
	}

}
