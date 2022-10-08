package pattern;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: "); // takes input from user

		int rows = sc.nextInt();
		System.out.println("rows --> " + rows);
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
