package DemoMaven.DemoMavenId;

interface Shape1 {
	double calculateArea();

}

class Circle12 implements Shape1 {
	private double radius;

//Constructor for Circle 
	public Circle12(double radius) {
		this.radius = radius;
	}

// Implementing the abstract method from the Shape 
// interface 
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

}

class rectangle2 implements Shape1 {
	private double lenght;
	private double height;

	public rectangle2(double lenght, double height) {
		this.lenght = lenght;
		this.height = height;

	}

	@Override
	public double calculateArea() {
		return lenght * height;
	}

}

public class interfaceExample {

	public static void main(String arg[]) {

		Shape1 sh = new Circle12(4.5);
		double arae = sh.calculateArea();
		System.out.println("Area of circle is : " + arae);

		Shape1 sh1 = new rectangle2(4.5, 8.9);
		double areaRectagle = sh1.calculateArea();
		System.out.println("Area of circle is : " + areaRectagle);
	}

}
