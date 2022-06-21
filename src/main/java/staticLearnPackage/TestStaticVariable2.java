package staticLearnPackage;

public class TestStaticVariable2 {

	public static void main(String args[]) {
		//StudentTwo.change();// calling change method
		// creating objects
		StudentTwo s1 = new StudentTwo(111, "Karan");
		StudentTwo s2 = new StudentTwo(222, "Aryan");
		StudentTwo s3 = new StudentTwo(333, "Sonoo");
		// calling display method
		s1.change();
		s1.display();
		s2.display();
		s3.display();
		
		
		//s1.change();
	}

}

class StudentTwo {
	int rollno;
	String name;
	static String college = "ITS";

	// static method to change the value of static variable
	static void change() {
		college = "BBDIT";
	}

	// constructor to initialize the variable
	StudentTwo(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }

	// method to display values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}
// Test class to show the values of objects
