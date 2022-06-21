package optumInterviewQuestions;

class A {

	public void A1(int i) {

		System.out.println("A");

	}

	public void testFn(String s) {
		System.out.println("A testFn");

	}

}

class B extends A {
	
	public void A1(int i) {

		System.out.println("B");

	}

	/*
	 * public void A1(String s) { System.out.println("B");
	 * 
	 * }
	 */

	public void testFn(String s) {
		System.out.println("B testFn");

	}

}

public class C {

	/*
	 * public void A1(int i) {
	 * 
	 * System.out.println("c");
	 * 
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();

		obj.A1(1994);
		//obj.A1("prathap");

		obj.testFn("AP");
	}

}
