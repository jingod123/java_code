import java.util.Scanner;

public class Ex09두수의차 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int input1= sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int input2= sc.nextInt();
		
		int result = (input1>input2)?input1-input2:input2-input1;
		
		System.out.print("두 수의 차 : " + result);
		
		sc.close();
	}

}
