package Aptitude;

public class Lcm {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	
	 public static void main(String[] args) {

		    int n1 = 9, n2 = 6, lcm;

		    // maximum number between n1 and n2 is stored in lcm
		    lcm = (n1 > n2) ? n1 : n2;

		    // Always true
		    
		    System.out.println("100/99 -------------------------------->" + 30 % 12);
		    while(true) {
		    	
		    	System.out.println("lcm % n1 -------------------------------->" + lcm % n1);
		    	System.out.println("lcm % n2 --------------------->" + lcm % n2);
		    	System.out.println("lcm -------------->" + lcm);
		      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
		        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
		        break;
		      }
		      ++lcm;
		    }
		  }

}
