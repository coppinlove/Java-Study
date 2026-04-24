package javastart;

import java.util.Scanner; //Scanner클래스 사용
//단축키: ctrl + shift + o
public class ConvertType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //키보드로 입력위해
		//import java.util.Scanner
		
		//문자열 입력
		System.out.println("숫자를 문자로 입력하세요: ");
		String input = sc.nextLine(); //nextLine()은 문자열 1줄
		
		//문자열 -> 숫자 변환
		double d = Double.parseDouble(input); //snum(문자) -> num(정수)
		//Integer(정수): Wrapper class(래퍼클래스)
		//Wrapper class: 기본형을 객체로 감싸는 클래스
		//Integer.parseInt(num): 문자 -> 정수 변환
	
		//숫자 -> 문자열 변환
		String str1 = Double.toString(d); //toString (문자로 변환)
						  //toString 앞에 타입 지정
		String str2 = String.valueOf(d); //valueOf (문자로 변환)
						 //valueOf: 타입 관계 없음
		//출력
		System.out.println("입력 문자열: " + d);
		System.out.println("숫자로 변환: " + d);
		System.out.println("다시 문자열로 변환(toString): " + str1);
		System.out.println("다시 문자열로 변환(valueOf): " + str2);
		
		sc.close();
	}
}
