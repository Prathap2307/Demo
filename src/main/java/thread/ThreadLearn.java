package thread;

import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadLearn {
	public static void main(String args[]) {
		/*
		 * System.out.println( "INFO - demo starting.  " + Instant.now() );
		 * 
		 * // Submit tasks to run on background threads. ExecutorService executorService
		 * = Executors.newFixedThreadPool( 3 ); for ( int i = 0 ; i < 100 ; i++ ) {
		 * executorService.submit( ( ) -> System.out.println( "Thread id " +
		 * Thread.currentThread().getId() + " Name --> "+
		 * Thread.currentThread().getName() + " is executing its task at " +
		 * Instant.now() ) );
		 * 
		 * // System.out.println( "Thread Name --> " + Thread.currentThread().getName()
		 * );
		 * 
		 * }
		 * 
		 * // Wait for tasks to complete. executorService.shutdown(); try {
		 * executorService.awaitTermination( 1 , TimeUnit.HOURS ); } catch (
		 * InterruptedException e ) { e.printStackTrace(); }
		 * 
		 * System.out.println( "INFO - demo ending.  " + Instant.now() );
		 */
		
		Thread t1= new Thread("My first thread");  
		
		Thread t2= new Thread("My  thread");  
		t1.start();  
		t2.start(); 
		
		  System.out.println("New Thread 1 name:  "
                  + t1.getName());
System.out.println("New Thread 2 name: "
                  + t2.getName());

System.out.println("New Thread 1 name:  "
        + t1.getId());
System.out.println("New Thread 2 name: "
        + t2.getId());
	     
		/*
		 * System.out.println( "Thread id --> " + Thread.currentThread().getId() +
		 * " Name --> "+ Thread.currentThread().getName() + " is executing its task at "
		 * + Instant.now() );
		 */
	}
	 
}
