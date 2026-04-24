package test;

class Book {
	String title;
	
	Book(String title){
		this.title = title;
		
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Book[] b = new Book[100];
		b[0] = new Book("Java의 정석");
		b[1] = new Book("Python의 정석");
		b[2] = new Book("C의 정석");
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i].title);
		}
	}

}
