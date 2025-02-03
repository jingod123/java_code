
public class Ex07비트시프트연산자 {

	public static void main(String[] args) {
		
		//비트 연산자 : &(AND), |(OR), ^(XOR), ~(NOT)
		//시프트 연산자(비트연산자에 포함됨) : <<(왼쪽 시프트), >>(오른쪽 시프트)
		
		//=> 비트 연산(0,1로 이루어진 2진수 연산)에 사용됨

		int a = 5; //00000101(2)
		int b = 3; //00000011(2)
		
		System.out.println(a&b); //00000001 -> 1
		System.out.println(a|b); //00000111 -> 7
		System.out.println(a^b); //00000110 -> 6
		System.out.println(~a);  //~> -6
		
		System.out.println(b>>1); //00000001 -> 1
		System.out.println(b<<1); //00000001 -> 6
		
	}

}
