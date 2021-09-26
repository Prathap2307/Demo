package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DropwhileLearn {

	 public static void main(String[] args)
	    {
	  
	        // create a stream of numbers from 1 to 10
	        Stream<Integer> stream
	            = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);
	        
	        List<Integer> listOfNumber = new ArrayList<>();
	        listOfNumber.add(10);
	        listOfNumber.add(3);
	        listOfNumber.add(9);
	        listOfNumber.add(11);
	        listOfNumber.add(4);
	        listOfNumber.add(6);
	        listOfNumber.add(8);
	        listOfNumber.add(3);
	        
	  
	        // apply dropWhile to drop all the numbers
	        // matches passed predicate
	        List<Integer> list
	            = stream.dropWhile(number -> (number / 4 == 1))
	                  .collect(Collectors.toList());
	        
	        List<Integer> dropWhileList = listOfNumber.stream().dropWhile(e -> e > 5).collect(Collectors.toList());
	        
	        List<Integer> takeWhileList = listOfNumber.stream().takeWhile(e -> e > 5).collect(Collectors.toList());
	        
	        List<Integer> filterdList = listOfNumber.stream().filter( e -> e > 5 ).collect(Collectors.toList());
            
	     //   listOfNumber.stream().
	        
	        System.out.println(" dropWhileList --> ");
	        for(Integer e : dropWhileList) {
	        	
	        	System.out.println(e);
	        }
	        
	        
	        
	        System.out.println("\n");
	        System.out.println(" takeWhileList --> ");
	        for(Integer e : takeWhileList) {
	        	
	        	System.out.println(e);
	        }
	        
	        
	  
	      
	        System.out.println("\n");
	        System.out.println("  filterdList --> ");
	        for(Integer e : filterdList) {
	        	
	        	System.out.println(e);
	        }
	  
	        // print list
	        //System.out.println(list);
	    }

}
