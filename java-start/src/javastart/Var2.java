package javastart;

public class Var2 {

	public static void main(String[] args) {
		
		final double PI = 3.14; //final = 불변
		double res = PI * 10;
 
		System.out.println(res);
		
		//var은 알아서 변수의 타입을 지정해줌, 초기값을 보고 판단
		var x = 5;
		System.out.println(x++ + ++x);
		//왼쪽 x는 5 -> 6 후위니까 5 +    오른쪽 x는 6 -> 7  따라서 5 + 7 = 12
		System.out.println(2*1500+300+"  Hello");
		var k = 30.5;
		var y = 12.3f;
		var n = "java";
		
		System.out.println(x+"  "+k+"  "+y+"  "+n);
		System.out.printf("%d %f %f %s", x,k,y,n);
	}

}
