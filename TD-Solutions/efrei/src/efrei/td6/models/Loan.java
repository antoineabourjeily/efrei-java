package efrei.td6.models;

public class Loan {
	private Book book;
	private User user;
	
	public Loan(Book book, User user) {
		this.book = book;
		this.user = user;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
