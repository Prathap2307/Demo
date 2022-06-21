package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> priceList = new ArrayList<>();
		
		priceList.add(2);
		priceList.add(4);
		priceList.add(6);
		priceList.add(8);
		priceList.add(10);
		Optional<Integer> findFirstPriceList = 	priceList.stream().findFirst();
		
	 
		Optional<Integer> filteredPriceList = priceList.stream().filter( e -> e > 4).findFirst();
		
		
		System.out.println("findFirstPriceList -->" + findFirstPriceList);
		System.out.println("filteredPriceList -->" + filteredPriceList);
		
		System.out.println( findFirstPriceList );
	

	}

}
