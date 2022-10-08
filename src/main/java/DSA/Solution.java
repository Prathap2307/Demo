package DSA;

public class Solution {

	private static int minCostPathHelper(int[][] cost, int n, int m, int x, int y) 
    {
		if (x == 1 && y == 1) 
        {
			return cost[0][0];
		}

		int minCost = Integer.MAX_VALUE;

		if ((x - 1) > 0) 
        {
			minCost = Math.min(minCost, cost[x - 1][y - 1] + minCostPathHelper(cost, n, m, x - 1, y));
		}

		if ((y - 1) > 0) 
        {
			minCost = Math.min(minCost, cost[x - 1][y - 1] + minCostPathHelper(cost, n, m, x, y - 1));
		}

		if ((x - 1) > 0 && (y - 1) > 0) 
        {
			minCost = Math.min(minCost, cost[x - 1][y - 1] + minCostPathHelper(cost, n, m, x - 1, y - 1));
		}

		return minCost;
	}

	public static int minCostPath(int[][] cost, int x, int y) 
    {
		int n = cost.length;
		if (n == 0) 
        {
			return Integer.MAX_VALUE;
		}

		int m = cost[0].length;
		return minCostPathHelper(cost, n, m, x, y);

	}
	
	public static void main(String[] args) {
		
		//3 4
		
		
		//3 4
		
		  //int[][] arr = { { 1, 2 }, { 3, 4 } };
		int[][] cost = new int[][] { 
	        { 11, 2, 8, 6 }, { 2, 12, 17, 6  }, { 3, 3, 1, 8  }
	};
	
		 int x = 3;
		 int y = 4;
		System.out.println(minCostPath(cost,  x,  y) );
	}

}
