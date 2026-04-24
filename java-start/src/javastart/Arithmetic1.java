package javastart;

public class Arithmetic1 {
	//main 메서드
	public static void main(String[] args) {
		int x = 20, y = 10;
		int jeongwooooo = add(x, y);
		int wooooooojeong = sub(x, y);
		
		System.out.printf("%d %d", jeongwooooo, wooooooojeong);

	}
	public static int add(int a, int b) {
		
		return a + b;
		
	}
	public static int sub(int a, int b) {
		return a - b;
	}
}
