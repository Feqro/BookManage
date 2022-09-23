package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			Book book = new Book();
			
			System.out.println("Title: ");
			String inputTitle = sc.nextLine();
			book.setTitle(inputTitle);
			
			System.out.println("Writer: ");
			String inputWriter = sc.nextLine();
			book.setWriter(inputWriter);
			
			System.out.println("Publisher: ");
			String inputPublisher = sc.nextLine();
			book.setPublisher(inputPublisher);
			
			System.out.println("Price: ");
			int inputPrice = sc.nextInt();
			book.setPrice(inputPrice);
			
			BookDAO.regBook(book);
		}

		ArrayList<Book> books = BookDAO.getBook();
		for(Book b : books) {
			System.out.println(b);
		}
		
	}

}
