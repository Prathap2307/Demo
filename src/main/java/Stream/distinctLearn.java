package Stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class MovieDistinct {

	int id;
	String name;
	Integer price;

	String director;

	public MovieDistinct(int id, String name, Integer price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public MovieDistinct(String name) {

		this.name = name;

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

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}

public class distinctLearn {

	public static void main(String[] args) {

		List<MovieDistinct> movieList = new ArrayList<MovieDistinct>();

		movieList.add(new MovieDistinct(1, "inception", 10));
		movieList.add(new MovieDistinct(1, "iron man", 15));
		movieList.add(new MovieDistinct(1, "thor", 20));
		movieList.add(new MovieDistinct(1, "Captain America", 20));
		movieList.add(new MovieDistinct(1, "Captain America", 20));

		List<MovieDistinct> movieFilteredList = movieList.stream().distinct().collect(Collectors.toList()); // collecting
																											// as list

		System.out.println("\n");
		for (MovieDistinct movie : movieFilteredList) {

			// System.out.println("before -->" + movie.getName() + " ----- " +
			// movie.getPrice());
		}

		System.out.println("\n");
		// create test data
		List<String> students = new ArrayList<String>();

		// add values to list
		students.add("Roger");
		students.add("Rafael");
		students.add("Djokovic");
		students.add("Roger");
		students.add("Murray");
		students.add("Rafael");
		

		// DISTINCT STARTS
		// ==========================================================================

		// Java 8 - distinct() method
		List<String> uniqueList = students.stream() // get stream for original list
				.distinct() // distinct method removes duplicates
				.collect(Collectors.toList()); // distinct elements stored to new list

		/*
		 * for (String obj : uniqueList) {
		 * 
		 * System.out.println(obj); }
		 */
		
		
		
		// DISTINCT ENDS
		// ==========================================================================
		
		

		// MAP STARTS
		// ==========================================================================

		// int id, String name, Integer price

		List<String> nameList = new ArrayList<>();
		nameList.add("avenger");
		nameList.add("thor");
		nameList.add("ef");

		List<MovieDistinct> filteredMapMovieList = nameList.stream().map(o -> new MovieDistinct((String) o))
				.collect(Collectors.toList()); // distinct elements stored to new list

		ObjectMapper objectMapper = new ObjectMapper();
		try {
			System.out.println("ObjectMapper -->"
					+ objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredMapMovieList));

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * ObjectMapper objectMapper = new ObjectMapper(); try {
		 * System.out.println("ObjectMapper -->" +
		 * objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(
		 * filteredMapMovieList)); } catch (JsonProcessingException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		for (MovieDistinct movie : filteredMapMovieList) {

			// System.out.println(movie.getName());

		}

		// MAP ENDS
		// ============================================================================================
		
		
		
		
		

		// COUNT STARTS
		// =============================================================================================
		long countVar = nameList.stream().count();
		System.out.println("countVar -->" + countVar);

		// COUNT ENDS
		// ==============================================================================================================
		
		
		
		
		
		
		
		

		// dropWhile STARTS
		// ==============================================================================================================

		List<String> filteredDropWhileMovieList = nameList.stream().dropWhile(obj -> obj == "thor")
				.collect(Collectors.toList());
		
		for (String obj : filteredDropWhileMovieList) {

			System.out.println(obj);

		}

		// dropWhile ENDS
		// ==============================================================================================================
		
		
		
		

	

		HashSet<String> set = new HashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Five");
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			// System.out.println(i.next());
		}

	}

}
