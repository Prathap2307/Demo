package DSA;

import java.util.Scanner;

public class CtoJavaTest {
	static int maxn = 2;
	 static int t, n; 
	static int[]   ph, pu, ans;
	static int[] cost =  new int[2];
	static int[] used =  new int[2];
	public static void main(String args[]) throws Exception {
		
	    Scanner sc = new Scanner(System.in);
	    
	    int t = sc.nextInt();
	   
	    
	     
	   // cin >> cost[i];
	    for(int a = 0; a < t; a++){
	    	used[0] = used[1] = 0;
	    	  cost[0] = sc.nextInt();
	 	     cost[1] = sc.nextInt();
	 	    n  = sc.nextInt();
    		for(int i = 0; i < n; i++) {
				for(int j = 0; j < maxn; j++){
					 
					int x;
					 x  = sc.nextInt();
					// System.out.println("i : " + i);
					// System.out.println("x : " + j +"---" +x);
					used[j] = used[j] + x;
				}
    		}	
    		
    		  System.out.println(  Math.min(cost[0] * used[0] + cost[1] * used[1], cost[1] * used[0] + cost[0] * used[1]));
	    }
	  
	   // Math.min(cost[0] * used[0] + cost[1] * used[1], cost[1] * used[0] + cost[0] * used[1]);
	   // min(cost[0] * used[0] + cost[1] * used[1], cost[1] * used[0] + cost[0] * used[1]);
	   // for(int c :  cost) {
	    	// System.out.println("cost : " + c);
	   // }
	    
	    //for(int u :  used) {
	    	// System.out.println("used : " + u);
	   // }
	    
	    
	   
	}

}

