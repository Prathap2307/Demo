package functionalInterfaceMovies;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> movieList = new ArrayList<Movie>();
		
		movieList.add(new Movie("mankatha", 2000, "ajith"));
		movieList.add(new Movie("thupaki", 1900, "vijay"));
		movieList.add(new Movie("valimai", 2000, "ajith"));
		
		getMovies(movieList , m -> m.getReleaseYear() == 2000);
		getMovies(movieList , m -> m.getActor().equalsIgnoreCase("vijay"));

	}
	
	
	private static void getMovies(List<Movie> movieList, Predicate<Movie> moviePredicate) {
		
		for (Movie movie : movieList) {
			if(moviePredicate.test(movie)) {
				System.out.println(movie.getName());
			}
		}
		
	}
}
