
public class Ex11치환 {

	public static void main(String[] args) {
		
		
		String 왼손 = "빨강";
		String 오른손 = "파랑";

		System.out.println(왼손); //빨강
		System.out.println(오른손); //파랑
		System.out.println("==============");
		
		//파이썬 : 왼손,오른손 = 오른손,왼손 => 자바에서는 작성 불가능한 문법!
		//어떻게 써야 아래에서 출력할 때는 바뀌어서 나올수 있을까?
		String temp = 왼손;
		왼손 = 오른손;
		오른손 = temp;

		System.out.println(왼손); //파랑
		System.out.println(오른손); //빨강
	}

}
