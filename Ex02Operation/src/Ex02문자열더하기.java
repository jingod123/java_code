
public class Ex02문자열더하기 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 7;
		
		String num3 = "10";
		String num4 = "7";
		
		//다음 출력문 결과와 연산 결과의 타입은?
		System.out.println(num1+num2);   //17, int
		System.out.println(num3+num4);
		System.out.println(num1+num4);
		
		//다음 출력문 결과와 연산 결과의 타입은?
		System.out.println(10 + 7 + "");
		System.out.println(8 + "" + 2);
		System.out.println("" + 5 + 2);
	}

}
