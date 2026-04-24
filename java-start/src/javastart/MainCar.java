package javastart;



class Car { // 클래스 ( 설계도 ) 생성
   // 클래스 = 멤버 변수(필드) (속성) + 메서드(기능) 구성
   
   String model; // 멤버변수
   int speed; // 멤버 변수
   
   // 생성자 constructor : 객체를 생성할때 값을 부여
   Car(String model, int speed){
	   this.model = model;
	   this.speed = speed;
	   //this: 왼쪽 변수 -> 객체변수, 오른쪽 변수 -> 매개변수
	   //this: 객체 자신
   }
   
   Car(String model){
	   this.model = model;
	   speed = 0;
	   
   }
   
   Car(){
	   model = "Truck";
	   speed = 0;
   }

   void showPrint() {
	   System.out.printf("모델명: %s ㅆpeed: %d\n", model, speed);
   }
   

   
}


public class MainCar { // 실행하는 클래스

   public static void main(String[] args) { // main method
      
	   Car c1 = new Car("Ferrari", 100);
	   Car c2 = new Car("Bugatti", 500);
	   Car c3 = new Car("Porsche");
	   Car c4 = new Car();
	   
	   c1.showPrint();
	   c2.showPrint();
	   c3.showPrint();
	   c4.showPrint();
	   
	   
	   

   }

}
