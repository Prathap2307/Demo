package MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mapListLearn {
	
	public static void main(String args[]) {
		Map<String, List<String>> movieObj = new HashMap<String, List<String>>();
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("apple");
		movieObj.put("movie", fruits);
		for(Map.Entry<String, List<String>> e : movieObj.entrySet()) {
			System.out.println(e);
		}
		
		usingSet();
		
	}
	
	public static void usingSet() {
		Map<String, Set<String>> movieObj = new HashMap<String, Set<String>>();
		Set<String> fruits = new HashSet<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("apple");
		
		
		//movieObj.pu
		movieObj.put("movie", fruits);
		
		for(Map.Entry<String, Set<String>> e : movieObj.entrySet()) {
			System.out.println(e);
		}
	}
	

}
