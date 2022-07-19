package optionalLearn;

import java.util.Optional;

public class OptionalExample {
	   public static void main(String[] args) {  
	        String[] str = new String[10];  
	        str[5] ="test 5";
	        Optional<String> checkNull = Optional.ofNullable(str[5]);  
	        
	        if(checkNull.isPresent()){  // check for value is present or not  
	            String lowercaseString = str[5].toLowerCase();  
	            System.out.print(lowercaseString);  
	            String testSeven = str[7].toLowerCase();  
	        }else  
	            System.out.println("string value is not present");  
	    }  
}
