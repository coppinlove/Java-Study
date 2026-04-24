package javaex;

import java.awt.dnd.DragGestureEvent;

class Shape{
	void draw() {
		System.out.println("도형을 그리다");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("원을 그리다");
	}
}

class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("사각형을 그리다");
	}
}

public class Poly {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		s = new Rectangle();
		s.draw();
	}

}
