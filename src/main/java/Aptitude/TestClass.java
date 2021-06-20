package Aptitude;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*import java.io.*;
import java.util.*;*/

public class TestClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine().trim());
		for (int t_i = 0; t_i < T; t_i++) {
			int N = Integer.parseInt(br.readLine().trim());

			String out_ = Solve(N);
			System.out.println(out_);
		}

		wr.close();
		br.close();
	}

	static String Solve(int N) {
		// Write your code here
		//System.out.println("N -->" + N);
		int[] number = new int[10];

		// List<Integer> = new ArrayList<Integer>();
		int j = -1;
		for (int i = 1; i < N; i++) {
			//System.out.println("n loop -->" + i);
			if (N % i == 0) {

				j++;
				//if (N % i != N) {
					number[j] = N / i == N ? 1 : N / i;
				//}

			}

		}

		int sumOfNumber = 0;
		for (int k = 0; k < number.length; k++) {
			sumOfNumber = sumOfNumber + number[k];

			//System.out.println("number[k] -->" + number[k]);

		}
		// System.out.println("sumOfNumber -->" + sumOfNumber);
		String returnValue = "";
		if (sumOfNumber == N) {
			returnValue = "YES";
			// System.out.println("YES");
		} else {
			returnValue = "NO";
		}
		return returnValue;
	}
}