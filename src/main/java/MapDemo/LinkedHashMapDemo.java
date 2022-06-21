package MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	// Main driver method
	public static void main(String args[])
	{

		// Initialization of a LinkedHashMap
		// using Generics
	LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>();
		//HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		// Add mappings to Map
		// using put() method
		hm1.put(2, "For");
		hm1.put(3, "Geeks");
		
		hm1.put(1, "Geeks");

		// Printing mappings to the console
		System.out.println("Mappings of LinkedHashMap : "
						+ hm1);
	}
}
