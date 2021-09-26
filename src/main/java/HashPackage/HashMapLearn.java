package HashPackage;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearn {
	public static void main(String[] args) {
		
		Map<String, String> listOfMovie = new HashMap<>();
		
		listOfMovie.put("movieName", "thor");
		listOfMovie.put("heroName", "chris");
		
		System.out.println(listOfMovie.size());
		
		listOfMovie.forEach((k,v) -> System.out.println(k + " ------- " +  v));
		
		//for(Map.entry(String, String) e : listOfMovie)
		
		for(Map.Entry<String, String> e : listOfMovie.entrySet()) {
			
			System.out.println(e);
			
		}
		
		

	}
}
