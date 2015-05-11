package models;

public class Review {

	private long id;
	private String title;
	private String createdOn;
	private String author;
	private String body;
	private int stars;
	int counter=1;

	public Review() {
	}

	public Review(String title, String createdOn, String author, String body, int stars) {
		super();
		this.id = 0;
		this.title = title;
		this.createdOn = createdOn;
		this.author = author;
		this.body = body;
		this.stars = stars;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public int getStars(){
		return stars;
	}
	
	public void setStars(int stars){
		this.stars=stars;
	}

	@Override
	public String toString() {
		return "(" + this.id + ", " + this.title + ", " + this.createdOn + ", " + this.author
				+ ", " + this.body + ", " + this.stars + ")";
	}

}
