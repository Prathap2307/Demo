package functionalInterface3;

import java.util.*;
import java.util.function.Predicate;

public class PredicateFIforDemo {

	 public static void main(String[] args) {

	        List<Item> items = new ArrayList<>();
	        items.add(new Item("chicken", 650));
	        items.add(new Item("pizza",250));
	        items.add(new Item("burger",770));
	        items.add(new Item("chips", 530));
	        items.add(new Item("French Fries",570));
	        items.add(new Item("Shawarma", 140));

	        //Returns true if item price is > 500
	        Predicate<Item> pFI = (item) -> item.getPrice() > 500;
	        items.stream().filter(pFI).forEach(item -> System.out.println(item));    
	    }

}
