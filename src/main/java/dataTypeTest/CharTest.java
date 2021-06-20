package dataTypeTest;

import java.util.Scanner;

public class CharTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a character: ");
// reading a character   
		char c = sc.next().charAt(2);
//prints the character   
		System.out.println("You have entered " + c);
	}
}
