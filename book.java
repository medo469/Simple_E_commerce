
public class book extends Product {
	//variables
	private String author;
	private String publisher;
	
	
	 public book(int productId, String name, float price, String author, String publisher) {
	        super(productId, name, price);
	        this.author = author;
	        this.publisher = publisher;
	    }
	//setters and getters
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
}
