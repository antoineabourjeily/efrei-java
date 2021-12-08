package efrei.td6.models;

public class Book {
	private int id;
	private String title;
	private String author;
	private String synopsis;

	public Book(int id, String title, String author, String synopsis) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.synopsis = synopsis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", synopsis=" + synopsis + "]";
	}

}
