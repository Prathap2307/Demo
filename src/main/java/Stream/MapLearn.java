package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] priceArray = {1, 2, 3, 4, 5};
		
		//priceArray
		
		
		
		List<Integer> priceList = new ArrayList<>();
		priceList.add(1);
		priceList.add(2);
		priceList.add(3);
		priceList.add(4);
		priceList.add(5);
		
		List<Integer> afterReviewPriceList	= priceList.stream().map(e -> e * 3).collect(Collectors.toList());
	
		
		
		for(Integer e : afterReviewPriceList) {
			System.out.println("price --->" + e);
		}
		
		
	}

}
