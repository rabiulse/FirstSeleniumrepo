package DemoMaven.DemoMavenId;

public class childclass extends parentClass {

	@Override
	void m1() {
		super.m1();// called the method from parent
		System.out.println("This is child implemetation:");// this us the method for child class

	}

	public static void main(String[] args) {

		parentClass ex = new childclass();
		ex.m1();

	}

}
