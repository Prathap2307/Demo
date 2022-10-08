package DSA;

/*public class SortByFrequency {

}
*/
import java.util.*;
public class SortByFrequency {
	 static Integer[] arr = {10, 20, 10, 10, 20, 30, 30, 30, 30, 0,20};

	 public static void sortBasedOnFrequencyAndValue(List<Integer> list)
	   {
	       int n = arr.length;
	       final HashMap<Integer, Integer> mapCount = new HashMap<Integer, Integer>();
	       final HashMap<Integer, Integer> mapIndex = new HashMap<Integer, Integer>();
	       
	       for (int i = 0; i < n; i++) {
	           if (mapCount.containsKey(arr[i])) {
	              mapCount.put(arr[i],mapCount.get(arr[i]) + 1);
	           }
	           else {
	              mapCount.put(arr[i],1); // Map to capture Count of elements // count 
	              mapIndex.put(arr[i],i); // Map to capture 1st occurrence of elements // first index
	           }
	       }
	       Collections.sort(list, new Comparator<Integer>(){
	           public int compare(Integer n1, Integer n2)
	             {
	        	   System.out.println("n1, n2 -->"+ n1 + " - "+ n2);
	                  int freq1 = mapCount.get(n1);
	                  int freq2 = mapCount.get(n2);
	                  System.out.println("freq1, freq2 -->"+ freq1 + " - "+ freq2);
	                  if (freq1 != freq2) {
	                      return freq2 - freq1;
	                  }
	                  else {
	                      return mapIndex.get(n1) - mapIndex.get(n2); 
	                  }
	             }
	       });
	       System.out.println(list);
	    }
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(arr);
	       sortBasedOnFrequencyAndValue(list);
	}
}

//[30, 30, 30, 30, 10, 10, 10, 20, 20, 0]
// first count, if equal index first
