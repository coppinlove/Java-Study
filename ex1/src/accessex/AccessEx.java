package accessex;

class Sample {
	public int a;
	private int b;
	int c; //defualt 생략
	
	void show() {
		System.out.println("a의 값:" + a);
		System.out.println("b의 값:" + c);
	}
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
//		sample.b = 10; //같은 클래스가 아니기 때문에 오류가 발생한다.
		sample.c = 10;
		sample.show();
	}

}
