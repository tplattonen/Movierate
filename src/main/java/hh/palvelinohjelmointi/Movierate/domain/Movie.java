package hh.palvelinohjelmointi.Movierate.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String director;
	private double imdbrating;
	private double userrating;
	private String review;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "categoryId")
	private Category category;
	
	
	// GETTERS
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDirector() {
		return director;
	}
	public double getImdbrating() {
		return imdbrating;
	}
	public double getUserrating() {
		return userrating;
	}
	public String getReview() {
		return review;
	}
	
	public Category getCategory() {
		return category;
	}
	
	// SETTERS
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setImdbrating(double imdbrating) {
		this.imdbrating = imdbrating;
	}
	public void setUserrating(double userrating) {
		this.userrating = userrating;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	// CONSTRUCTORS
	public Movie(String name, String director, double imdbrating, double userrating, String review,
			Category category) {
		super();
		this.name = name;
		this.director = director;
		this.imdbrating = imdbrating;
		this.userrating = userrating;
		this.review = review;
		this.category = category;
	}
	public Movie() {
		this.name = null;
		this.director = null;
		this.imdbrating = 0;
		this.userrating = 0;
		this.review = null;
		this.category = null;
	}
	
	// TOSTRING
	@Override
	public String toString() {
		if (this.category != null)
			return "Movie [id=" + id + ", name=" + name + ", director=" + director + ", imdbrating=" + imdbrating + 
					", userrating=" + userrating + ", review=" + review + ", category=" + this.getCategory() + "]";
		else
			return "Movie [id=" + id + ", name=" + name + ", director=" + director + ", imdbrating=" + imdbrating +
					", userrating=" + userrating + ", review=" + review + "]";
	}

	
	
}
