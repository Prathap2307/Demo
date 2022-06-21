package objectClassLearn;

public class LearnObject {
	
	
	public static void testFn(){
		Object response = " ";
		
		if(response == "") {
			System.out.println("test  1");
		}
		
		if(response.toString().equalsIgnoreCase(" ")) {
			System.out.println("test  2");
		}
		
		if(response.equals("")) {
			System.out.println("test  3");
		}
	}
	
	public static void main(String[] args) {
		
		
		testFn();
		
		
	}

}
