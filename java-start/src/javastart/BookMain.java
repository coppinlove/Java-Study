package javastart;

class Bookk{
	String title, author;
	//생성자 (객체가 생성 되면서 초기값을 줌) 오버로딩
	Bookk(){ //매개변수 없는 생성자(기본생성자)
//		title = "";
//		author = "";
		this("", ""); //생성자간의 호출 (2)
		System.out.println("기본 생성자 호출"); //5
	}
	Bookk(String title){ //생성자 호출 시 title만 가져옴
//		this.title = title; //왼쪽 title: 멤버변수, 오른쪽 title: 매개변수
//		this.author = "작가 미상";
		this(title, "작가미상"); //7
	}
	Bookk(String title, String author){
		this.title = title; //3 //8 //11
		this.author = author; //4 //9 //12
	}

	void show() {
		System.out.println("Title: " + title + " " + "Author: " + author); //14 //16 //18
	}
}


public class BookMain {
	public static void main(String[] args) {
		Bookk b1 = new Bookk(); //1
		Bookk b2 = new Bookk("나의 고달픈 삶"); //6
		Bookk b3 = new Bookk("나의 고달픈 삶", "김지후"); //10
		
		b1.show(); //13
		b2.show(); //15
		b3.show(); //17
	}
}




//this는 현재 작동 중인 객체 자신을 가리키는 참조 변수입니다. 주로 매개변수와 멤버 변수의 이름이 같을 때 이를 구분하기 위해 사용
//this()는 같은 클래스 안에 있는 다른 생성자를 호출할 때 사용하는 특수한 문법입니다. 코드의 중복을 줄이기 위해 사용
//
//this() 설명
//① 생성자에서만 사용 가능
//this();  // 생성자 안에서만 사용 가능
//**** ② 반드시 첫 줄에 써야 함 ****
//Car() {
//    this("Avante");  // 반드시 첫 줄
//}
//
//Car() {
//    speed = 100;
//    this("Avante"); // 에러
//}
//③ 자기 자신을 계속 호출하면 안됨 (무한루프)
//Car() {
//    this(); //  무한 호출 → 컴파일 에러

