package test;

class Car{
	String model;
	int speed;
	
	Car(String model, int speed){
		this.model = model;
		this.speed = speed;
	}
	
	void show() {
		System.out.println("Model: " + model + " ||| " + "Speed: " + speed);
	}
}



public class Ex04 {
	public static void main(String[] args) {
		Car c1 = new Car("mclaren p1 gtr", 400);
		Car c2 = new Car("lamborghini aventador", 300);
		
		c1.show();
		c2.show();
	}

}
