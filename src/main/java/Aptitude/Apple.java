package Aptitude;

import java.util.Scanner;

public class Apple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m1 = sc.nextInt();
		int p1 = sc.nextInt();
		int m2 = sc.nextInt();
		int p2 = sc.nextInt();;

		int min_cost = -1;
		for (int i=0; m1*i <= n; i++) {
			int count2 = n - i*m1;
			if (count2%m2 == 0) {
				int cost = p1 * i + p2 * (count2/m2);
				min_cost = (cost < min_cost || min_cost == -1) ? cost : min_cost;
			}
		}
		if (min_cost != -1)
			System.out.println(min_cost);
		else
			System.out.println("Invalid inputs");
	}

}

