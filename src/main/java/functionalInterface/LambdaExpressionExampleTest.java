package functionalInterface;

interface DrawableTest {
	public void draw();

	default String rentMethod1(String s) {

		return "House rented to " + s;
	}

	default String rentMethod2(String s) {

		return "House rented to " + s;
	}

	static void write() {
		System.out.println("write");
	}

	static void write2() {
		System.out.println("write");
	}
}

public class LambdaExpressionExampleTest implements DrawableTest {
	int width = 10;

	public void draw() {
		System.out.println("Drawing " + width * width);
	}

	public static void main(String[] args) {

		LambdaExpressionExampleTest Test = new LambdaExpressionExampleTest();
		Test.draw();
		DrawableTest.write();
		// without lambda, Drawable implementation using anonymous class
		/*
		 * DrawableTest d = new DrawableTest() { public void draw() {
		 * System.out.println("Drawing " + width * width); } };
		 */

		// d.draw();
	}
}
