package functionalInterface;

@FunctionalInterface // It is optional
interface DrawableExample2 {
	public void draw();
}


public class LambdaExpressionExample2 {
	public static void main(String[] args) {
		int width = 10;

		// with lambda
		DrawableExample2 d2 = () -> {
			System.out.println("Drawing " + width);
		};
		System.out.println("d2 -->" + d2);
		d2.draw();
	}
}
