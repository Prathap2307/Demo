package Common;

/*class Movie {
	
	void testFn(){
		System.out.println("Movie testFn");
	}
	
}*/

public class VariableTest {
	
	static int x = 0;
	
	//VariableTest obj = new VariableTest();
	
	void testFn(){
		System.out.println("test testFn");
	}
	
	
	public static void main(String[] args) {
		 
		VariableTest obj = new VariableTest();
		
		System.out.println("x --> " + x);
		System.out.println("obj.x --> " + obj.x);
		
		obj.testFn();
	}

}
