package javastart;

public class Arithmetic2 {
	public static void main(String[] args) {
		int i = 20;
		double j = 10.5;
		int sumsumsum = sum(i, 10);
		double aijey = sum(i, j);
		System.out.println(sumsumsum);
		System.out.println(aijey);
	}
	public static int sum(int a, int b) {
		return a + b;
	}
	public static double sum(double a, double b) {
		return a + b;
	}
}
//메서드 오버로딩 -> 같은 이름의 메서드 생성 매개변수의 타입, 개수, 순서가 다름 반환 타입은 관계없음

//sum(int a, int b)
//sum(double a, double b) ㄱㄴ

//sum(int a, int b)
//sum(int a, int b, int c) ㄱㄴ

//sum(int a, double b)
//sum(double a, int b) ㄱㄴ

//int sum(int a, int b)
//double sum(int a, int b) ㅂㄱㄴ
