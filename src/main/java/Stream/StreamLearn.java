package Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Movie {
	int id;
	String name;
	Integer price;

	public Movie(int id, String name, Integer price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}

public class StreamLearn {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		List<Float> productPriceList2 = productsList.stream().filter(p -> p.price > 30000)// filtering data
				.map(p -> p.price * 2) // fetching price
				.collect(Collectors.toList()); // collecting as list

		List<Product> filterdObj = productsList.stream().filter(p -> p.price > 30000)// filtering data
				.collect(Collectors.toList()); // collecting as list

		// int hasCodePrice = productsList.stream().filter(p -> p.price > 30000).map(p
		// -> p.price).hashCode();
		// System.out.println("hasCodePrice -->" + hasCodePrice);
		// System.out.println(productPriceList2);

		// System.out.println("filterdObj -->" + filterdObj[0].get);

		for (Product obj : filterdObj) {
			System.out.println("obj -->" + obj.getName());
		}

		List<Product> singleObj = productsList.stream().filter(p -> p.price > 30000)// filtering data
				.collect(Collectors.toList()); // collecting as list

		List<Movie> movieList = new ArrayList<Movie>();

		movieList.add(new Movie(1, "inception", 10));
		movieList.add(new Movie(1, "iron man", 15));
		movieList.add(new Movie(1, "thor", 20));
		movieList.add(new Movie(1, "Captain America", 20));

		Predicate<Movie> noGreaterThan10 = x -> x.getPrice() > 10;

		List<Movie> movieFilteredList = movieList.stream().filter(noGreaterThan10)// filtering data
				.collect(Collectors.toList()); // collecting as list

		
		System.out.println("\n");
		for (Movie movie : movieFilteredList) {
		
			System.out.println("before -->" + movie.getName() + " ----- " + movie.getPrice());
		}

		//for (Movie movie : movieFilteredList) {
			/*
			 * if(movie.getName().equalsIgnoreCase("thor")) {
			 * movieFilteredList.remove(movie); }
			 */
			 
			/*
			 * if(movie.getName() == "thor") { movieFilteredList.remove(movie); }
			 */
		//}
		      
		// for iterator
		for ( Iterator<Movie> fList = movieFilteredList.iterator(); fList.hasNext(); ) {
			Movie movie = fList.next();
		    if (movie.getName() == "thor") {
		    	fList.remove();
		    }
		}
		
		// while iterator
		Iterator<Movie> wList = movieFilteredList.iterator();
		while(wList.hasNext()) {
			
			Movie movie = wList.next();
		    if (movie.getName() == "iron man") {
		    	wList.remove();
		    }
			
		}
		
		
		for (Movie movie : movieFilteredList) {
			System.out.println("\n" + "after -->" + movie.getName() + " ----- " + movie.getPrice());
		}
		
		
	}
}
