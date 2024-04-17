package DemoMaven.DemoMavenId;

abstract class Shape {
	String color;

	// these are abstract methods
	abstract double area();

	@Override
	public abstract String toString();

	// abstract class can have the constructor
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}

	// this is a concrete method
	public String getColor() {
		return color;
	}
}

class Circle extends Shape {
	double radius;

	public Circle(String color, double radius) {

		// calling Shape constructor
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color is:  " + super.getColor() + " : and area is : " + area();
	}
}

class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		// calling Shape constructor
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle color is " + super.getColor() + "and area is : " + area();
	}
}

//driver class as java is bottom up approach : 
public class AbstractionExample {
	public static void main(String[] args) {
		Shape s1 = new Circle("yellow", 2.3);
		System.out.println(s1.toString());

		Shape rectangle = new Rectangle("red", 3.5, 6.7);
		double totalarea = rectangle.area();

		System.out.println(totalarea + ": This is total area of rectangel:");

	}
}
