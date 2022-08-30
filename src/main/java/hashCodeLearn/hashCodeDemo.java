package hashCodeLearn;

import java.util.ArrayList;
import java.util.List;


public class hashCodeDemo {
	
	public static void main(String[] args) {
		
		List<String> listofName = new ArrayList<>();
		
		listofName.add("thor");
		listofName.add("iron man");
		
		for(String name : listofName) {
			System.out.println(name + " -->" + name.hashCode());
		}
		
	}
	
}
