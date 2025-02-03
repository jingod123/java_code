
public class Ex01산술 {

	public static void main(String[] args) {
		
		// + - * /(몫) %(나머지)

		int num1 = 30;
		int num2 = 10;
		int num3 = 3;
		
		System.out.println(num1+num2); // 30 + 10 -> 40
		System.out.println(num1-num2); // 30 - 10 -> 20
		System.out.println(num1*num2); // 30 * 10 -> 300
		System.out.println(num1/num2); // 30 / 10 -> 3
		System.out.println(num1%num2); // 30 % 10 -> 0
		
		System.out.println(num2/num3);
		System.out.println(num2%num3);
		
		//정수끼리 계산 -> 무조건 결과는 정수
		
		double num4 = 10; //눈에 보이는건 정수 10이지만 double 부동소수점형 이기 때문에 10.0000000000213 이런 느낌임(오차가있음)
		double num5 = 7;
		//num4 -> 10.0 / num5 -> 7.0
		//System.out.println(num4);
		//int 10 / int 7 -> 1
		System.out.println(num4/num5); //계산기로 10/7 계산햇을 때의 결과가 나옴
		System.out.println(num4%num5); //10/7의 나머지의 3이지만 부동소수점 형으로 나옴
		
		double num6 = 10.3;
		double num7 = 7.4;
		System.out.println(num6/num7);
		System.out.println(num6%num7);
		
		//실수끼리 계산 -> 무조건 결과 실수
		
		System.out.println(num6/num3);
		//정수-실수 계산 -> 무조건 결과 실수
		
		//* float/double 부동소수점 형이기때문에 오차가 조금 있다! 더 정확하게 계산하려면 float 보다는 double형 사용이 좋음
	
		// % 사용하는 경우 : 배수확인(2의배수, 3의배수), 짝수(2의배수)/홀수 판단
	}

}
