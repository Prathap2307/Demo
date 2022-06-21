package inheritance;

import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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
	        b.speedSuperTest();
	        sp.speedSuperTest();
	        
     
	    } 

}
