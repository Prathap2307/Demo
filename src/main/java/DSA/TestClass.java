package DSA;

import java.util.Scanner;

public class TestClass {
	public static void main(String args[]) throws Exception

	{

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		int[][] mat;

		int s = 0;

		for (int i = 0; i < t; i++)

		{

			s = 0;

			int g = sc.nextInt();

			int p = sc.nextInt();

			int n = sc.nextInt();

			mat = new int[n][2];

			for (int j = 0; j < n; j++)

			{

				for (int k = 0; k < 2; k++)

				{

					mat[j][k] = sc.nextInt();

				}

			}

			if (i % 2 == 0)

			{

				for (int l = 0; l < n; l++)

				{

					if (mat[l][0] == 1)

					{

						s += g;

					}

					if (mat[l][1] == 1)

					{

						s += p;

					}

				}

				System.out.println(s);
			}

			else

			{

				for (int l = 0; l < n; l++)

				{

					if (mat[l][0] == 1)

					{

						s += p;

					}

					if (mat[l][1] == 1)

					{

						s += g;

					}

				}

				System.out.println(s);

			}

		}

	}
}
