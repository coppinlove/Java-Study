package pack2;

import pack1.Parent;

public class Child extends Parent{
	public void printChild() {
	System.out.println("=== 자식 클래스 접근 ===");
	System.out.println("public a= " + a);
	System.out.println("protected b = " + b);
//	System.out.println("default c = " + c); default 동일 패키지 내에서만
//	System.out.println("private d = " + d); private 동일 클래스 내에서만
	}
	

}
