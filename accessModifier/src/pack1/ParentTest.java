package pack1;

public class ParentTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		
		System.out.println("=== 같은 패키지 테스트 ===");
		System.out.println("public a = " + p.a);
		System.out.println("protected b = " + p.b);
		System.out.println("default c = " + p.c);
//		System.out.println("private d = " + p.d); //Parent 클래스에서 d는 private로 정의 되었기 떄문에 오류가 발생한다.
		
		System.out.println("\n=== 몌서드 호출 ===");
		p.show();
		
	}
}
