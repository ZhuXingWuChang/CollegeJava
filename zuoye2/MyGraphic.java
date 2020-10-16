package zuoye2;
/*
 * 题目2.12
 */
abstract public class MyGraphic {//graphic:形象的;图表的;绘画似的
	abstract double perimeter();
	abstract double area();
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2,4);
		Triangle triangle = new Triangle(3,3,2,2,4);
		Circle circle = new Circle(3);
		System.out.println(rectangle.perimeter());
		System.out.println(rectangle.area());
		System.out.println(triangle.perimeter());
		System.out.println(triangle.area());
		System.out.printf("%.1f\n", circle.perimeter());
		System.out.printf("%.1f\n", circle.area());
	}
}

class Rectangle extends MyGraphic {
	double length = 0;
	double width = 0;
	
	Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
	}
	double perimeter() {
		return 2 * length + 2 * width;
	}
	double area() {
		return length * width;
	}
}

class Triangle extends MyGraphic {
	double base = 0;
	double height = 0;
	double sides1 = 0;
	double sides2 = 0;
	double sides3 = 0;
	
	Triangle(double base,double height,
			double sides1,double sides2, double sides3) {
		this.base = base;
		this.height = height;
		this.sides1 = sides1;
		this.sides2 = sides2;
		this.sides3 = sides3;
	}
	double perimeter() {
		return sides1 + sides2 + sides3;
	}
	double area() {
		return 0.5 * base * height;
	}
}

class Circle extends MyGraphic {
	final double pi = 3.1415926;
	double radius = 0;
	
	Circle(double radius) {
		this.radius = radius;
	}
	double perimeter() {
		return 2 * pi * radius;
	}
	double area() {
		return pi * radius * radius;
	}
}