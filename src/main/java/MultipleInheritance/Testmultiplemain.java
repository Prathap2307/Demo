package MultipleInheritance;

public class Testmultiplemain {
	public static void main(String[] args) 
    { 
		
	//	mi.printMini();
		
		/*
		 * Maxi ma = new Maxi(); ma.printMaxi();
		 * 
		 * Large la = new Large();
		 */
		Large la = new Large();
		
		Mini mi = new Mini();
		mi.printLarge();
    } 
}
