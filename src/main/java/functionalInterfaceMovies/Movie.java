package functionalInterfaceMovies;

public class Movie {
	private String name;
	private Integer releaseYear;
	private String actor;
	
	Movie(String name, Integer releaseYear, String actor){
		this.name = name;
		this.releaseYear = releaseYear;
		this.actor= actor;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}

}
