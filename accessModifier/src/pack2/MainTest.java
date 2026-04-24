package pack2;

import pack1.Parent;

public class MainTest { //public클래스는 어디서나 객체 생성이 가능하다 하지만 다른 패키지일 경우 import를 해야한다
	public static void main(String[] args) {
		Parent pa = new Parent();
		Child ch = new Child();
		
		System.out.println("=== 일반 객체 접근 ===");
		System.out.println("public a = " + pa.a);
//		System.out.println("protected b = " + pa.b); //상속(extends) 받지 않아서 안됨
//		System.out.println("default c = " + pa.c); //동일 패키지가 아님
//		System.out.println("private d = " + pa.d); //동일 클래스가 아님
		
		ch.printChild();
	}

}
