package ex01;

import java.util.ArrayList;

public class BookDAO {
	
	static ArrayList<Book> books = new ArrayList();
	
	public static void regBook(Book book) {
		books.add(book);
	}
	public static ArrayList<Book> getBook(){
		return books;
	}

}
