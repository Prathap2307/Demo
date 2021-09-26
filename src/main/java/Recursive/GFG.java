package Recursive;

//Java code to implement factorial
public class GFG {

//Factorial function
	static int f(int n) {

		// Stop condition
		if (n == 0 || n == 1)
		{
			System.out.println("if check -->" + n);
			return 1;
		}
			

		// Recursive condition
		else
		{
			System.out.println("n --->" +n);
			return n * f(n - 1);
		}
	}

//Driver code
	public static void main(String[] args) {
		int n = 5;
		System.out.println("test");
		System.out.println("factorial of " + n + " is: " + f(n));
	}
}

//This code is contributed by divyesh072019.
