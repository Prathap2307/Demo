package hashCodeLearn;

import java.util.ArrayList;
import java.util.List;


public class hashCodeDemo {
	
	public static void main(String[] args) {
		
		List<String> listofName = new ArrayList<>();
		
		listofName.add("thor");
		//listofName.add("iron man");
		listofName.add("thor");
		
		for(String name : listofName) {
			System.out.println(name + " -->" + name.hashCode());
		}
		
		String a = "Andrew";  
        String b = "Andrew";  
  
        if(a.equals(b)){   //checking the equality of objects using equals() methods  
            System.out.println("a & b are equal variables, and their respective hashvalues are:" + " "+ a.hashCode() + " & " + b.hashCode());  
          
        }  
        
        Object obj = new Object();
        obj.hashCode();
		
	}
	
}
