package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceLearn {
	
	public static void main(String[] args) {
		
		List<Integer> priceList = new ArrayList<>();
		
		priceList.add(1);
		priceList.add(2);
		priceList.add(9);
		priceList.add(4);
		priceList.add(5);
		
		
		Optional<Integer> afterReviewPriceList	= priceList.stream().reduce( (a,b)-> a > b ? a : b);
	
		System.out.println("highest price --->" + afterReviewPriceList);
		
		/*
		 * for(Integer e : afterReviewPriceList) { System.out.println("price --->" + e);
		 * }
		 */
		
	}

}
