
public class Ex08삼항연산자 {

	public static void main(String[] args) {
		
		//삼항연산자 : 간단한 조건을 활용해 제어 처리할 수 있는 연산자
		//파이썬 : a if 조건식 else b
		//자바   : 조건식?a:b
		
		int x = 10;
		int y = 3;
		
		String result = x>y?"x가 크다":"y가 크다";
		System.out.println(result);
		
		System.out.println(x>y?"x가 크다":"y가 크다");
	}

}
