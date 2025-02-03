import java.util.Scanner;

public class Ex04초계산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("초 입력 : ");
		int inputSec = sc.nextInt();
		
		int hour = inputSec/3600;
		int min = inputSec%3600/60;
		int sec = inputSec%60;
		
		System.out.printf("%d시 %d분 %d초", hour, min, sec);
		
		sc.close();
	}

}
