package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	 public static void main(String[] args)   
     {   
         HashMap<Number, String> listOfName=new HashMap();   
         listOfName.put(100,"Stark");   
         listOfName.put(101,"Michale");   
         listOfName.put(102,"Ani");   
         listOfName.put(null,"Sofia");   
        // System.out.println(h);  
         
         for(Map.Entry<Number, String> obj: listOfName.entrySet()) {
        	// System.out.println("obj -->" + obj);
         }
         
         
        Map<String, Object> listOfObject =new HashMap();   
         
         listOfObject.put("nameDetails", "bar");
         
         for(Map.Entry<String, Object> obj: listOfObject.entrySet()) {
        	 System.out.println("obj -->" + obj);
         }
         
         
     }   

}
