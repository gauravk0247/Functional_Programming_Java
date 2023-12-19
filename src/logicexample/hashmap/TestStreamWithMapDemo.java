package logicexample.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
	private int bookNumber;
	private String bookName;
	private double bookPrice;
	public Book(int bookNumber, String bookName, double bookPrice) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
}

public class TestStreamWithMapDemo {

	public static void main(String[] args) {
		List<Book> listOfBook = new ArrayList();
		listOfBook.add(new Book(1, "Java", 450.00));
		listOfBook.add(new Book(2, "Pythob", 350.00));
		listOfBook.add(new Book(3, "Testing", 250.00));
		listOfBook.add(new Book(4, "JavaScript", 750.00));
		
		Map<Integer, String> books = listOfBook.stream().
				collect(Collectors.toMap(b->b.getBookNumber(), b->b.getBookName()));
		books.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
	}
}