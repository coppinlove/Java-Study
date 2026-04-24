package test;

public class DogEx extends AnimalEx{
	String breed;
	DogEx(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
		
	}
	void showdog() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Breed: " + breed);
	}

}
