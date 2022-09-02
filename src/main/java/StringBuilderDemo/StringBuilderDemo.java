package StringBuilderDemo;


class print {
	 public void safePrintln(StringBuilder s) {
   	  synchronized (System.out) {
   	    System.out.println(s);
   	  }
   	}
	 
	 public static StringBuilder sb = new StringBuilder();
	 synchronized void testFn(){
	//	public static StringBuilder sb = new StringBuilder();
		 //public static StringBuffer sBuffer = new StringBuffer();
		 
		 sb.append (" something ");
		// sb.replace(0, 4, "");
		// sb.append (" do ");
		//StringBuilderDemo.sBuffer.append (" EGG ");
		
	//	System.out.println(sb);
		//System.out.println(sBuffer);
	 }
	
	
	
}

 public class StringBuilderDemo implements Runnable
{
	
    print obj = new print();
     public void run ()
    {
    	
    	 obj.testFn();
    	
    }

    public static void main (String[] args)
    {
        // start two threads
        new Thread (new StringBuilderDemo()).start();
        new Thread (new StringBuilderDemo()).start();
        new Thread (new StringBuilderDemo()).start();
        new Thread (new StringBuilderDemo()).start();
        new Thread (new StringBuilderDemo()).start();
  
    }
    
   
}
