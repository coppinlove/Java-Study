package ex1;

public class Main {
	public static void main(String[] args) {
		//Dog 클래스는 Animal으로부터 상속을 받았기 때문에 Animal에 있는 것을 사용 가능
		Dog d = new Dog(); //자식 객체
		
		System.out.println("부모 멤버 사용");
		d.name = "코그모";
		d.age = 150;
		d.color = "Blue";
		
		d.eat(); //부모
		d.sleep(); //부모
		//자식 클래스 메서드 호출
		d.bark(); //자식
		d.run(); //자식
	//	d.show();
		
	}

}
