package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortArrayElementsByFrequencyProgram {
	 private static void sortArrayElementsByFrequency(int[] inputArray)
	    {
	        //Create LinkedHashMap with elements as keys and their occurrences as values
	        //Remember LinkedHashMap maintains insertion order of elements
	         
	        Map<Integer, Integer> elementCountMap = new LinkedHashMap<>();
	         
	        //Check presence of each element in elementCountMap 
	         
	        for (int i = 0; i < inputArray.length; i++) 
	        {
	            if (elementCountMap.containsKey(inputArray[i]))
	            {
	                //If element is present in elementCountMap, increment its value by 1
	                 
	                elementCountMap.put(inputArray[i], elementCountMap.get(inputArray[i])+1);
	            }
	            else
	            {
	                //If element is not present, insert this element with 1 as its value
	                 
	                elementCountMap.put(inputArray[i], 1);
	            }
	        }
	         
	        //Create an ArrayList to hold sorted elements
	         
	        ArrayList<Integer> sortedElements = new ArrayList<>();
	         
	        //Java 8 code to sort elementCountMap by values in reverse order
	        //and put keys into sortedElements list
	         
	        elementCountMap.entrySet()
	                        .stream()
	                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
	                        .forEach(entry -> { 
	                            for(int i = 1; i <= entry.getValue(); i++) 
	                                sortedElements.add(entry.getKey());
	                                });
	         
	        //Printing sorted array elements in descending order of their frequency
	         
	        System.out.println("Input Array :"+Arrays.toString(inputArray));
	         
	        System.out.println("Sorted Array Elements In Descending Order Of their Frequency :");
	         
	        System.out.println(sortedElements);
	    }
	     
	    public static void main(String[] args) 
	    {
	        sortArrayElementsByFrequency(new int[] {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3});
	    }
}
