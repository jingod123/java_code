import java.util.Scanner;

public class Ex10농구공 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int input = sc.nextInt();
		
		int box = (input%5>0)?input/5+1:input/5;
		
		System.out.print("필요한 상자 수 : " + box);
		
		sc.close();

	}

}
