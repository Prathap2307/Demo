package Generics;

public class MainGenerics {
	public static void main(String[] args) {

		// initialize the class with Integer data
		DemoClass demo = new DemoClass();

		// generics method working with String
		demo.<String>genericsMethod("Java Programming");
		demo.genericsMethod("prathap");

		// generics method working with integer
		demo.<Integer>genericsMethod(25);
	}
}
