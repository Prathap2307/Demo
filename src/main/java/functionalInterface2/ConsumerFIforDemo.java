package functionalInterface2;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerFIforDemo {

	 public static void main(String[] args) {

	        List<Item> items = new ArrayList<>();
	        items.add(new Item("chicken", 180));
	        items.add(new Item("pizza",150));
	        items.add(new Item("burger",70));
	        items.add(new Item("chips", 50));

	        Consumer<Item> consumer = (c) -> 
	        System.out.println(c.getItemName().toUpperCase());

	        System.out.println("Without lambda expression\n");
	        items.forEach(consumer);

	        //You can write in single like below, forEach accepts consumer as an argument.
	        //we can leverage the lambda expressions to implement the consumer abstract method like below.

	        System.out.println("\nWith lambda expression\n");
	        items.forEach(item -> System.out.println(item.getItemName().toUpperCase()));
	    }
}
