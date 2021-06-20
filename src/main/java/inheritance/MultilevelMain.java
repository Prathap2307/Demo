package inheritance;

public class MultilevelMain {
	  public static void main(String[] args) 
	    { 
	        three g = new three(); 
	      //  g.print_geek(); 
	       // g.print_for(); 
	      //  g.print_geek(); 
	        
	        A a = new A();
	        B b = new B();
	        SuperPower sp = new SuperPower();
	        a.speedATest();
	        b.speedTest();
	        sp.speedTest();
	    } 

}
