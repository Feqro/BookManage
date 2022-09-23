package ex01;

public class Book {
	private String title;
	private String writer;
	private String publisher;
	private int price;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setWriter(String writer) {
		this.writer =  writer;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "title: " + title + ", writer: " + writer + ", publisher: " + publisher + ", price: " + price; 
	}
	
}
