package javastart;

import java.util.Scanner;

public class ConvertType2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 문자로 입력하세요: ");
		double s1 = scanner.nextDouble();
		String num = String.valueOf(s1);
	}
}
