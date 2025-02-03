
public class Ex05증감연산 {

	public static void main(String[] args) {
		
		// ++ : 1증가
		// -- : 1감소
		
		int a = 10;
		a++; // a = a+1 or  a+=1 와 같은 코드
		System.out.println(a); //11
		
		//위치가 변수의 앞 or 뒤 둘다 쓸 수 있음 (실행되는 시점이 달라짐)
		a++; //변수 뒤에 붙어 있는 경우 : 일단 현재 a가 가지고 있는 값(11)을 사용한 후에 1증가 or 1감소
		//a => 12
		++a; //변수 앞에 붙어 있는 경우 : 일단 현재 a가 가지고 있는 값을 1증가(13) or 1감소 후 사용
		//a => 13
		
		//ppt에 간단한 예시로 일단 연습 
		
		int b = 0;
		b += 3;
		System.out.println(b++);
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);

	}

}
