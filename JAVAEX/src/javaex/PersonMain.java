package javaex;

class Person{
	private int age;

	public int getAge() { //get: 값을 반환
		return age;
	}

	public void setAge(int age) { //set: 값을 설정
		
		if(age < 1 || age > 100) {
			System.out.println("ERROR: Please input correct age.");
		}
		this.age = age;
	}
	
}

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-10);
		System.out.println("현재나이:" + p.getAge());
		  
	}

}
