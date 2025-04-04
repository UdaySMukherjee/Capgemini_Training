package ComparatorInterface;

import java.util.Arrays;

public class BookDriver {
	public static void main(String[] args) {
		Book b1 = new Book(23, "Hari Putter aur chamatkari pathhar", 678.90);
		Book b2 = new Book(63, "Story of a young Girl", 500.00);
		Book b3 = new Book(10, "Story of my Life", 1657.96);
		Book b4 = new Book(243, "Three men in a boat", 123.80);
		
		Book[] books = {b2,b1,b4,b3};
		SortByNameBook n = new SortByNameBook();
		Arrays.sort(books,n);
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println();

		SortByPriceBook p = new SortByPriceBook();
		Arrays.sort(books,p);
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println();
		
		SortByIDBook i = new SortByIDBook();
		Arrays.sort(books,i);
		for (Book book : books) {
			System.out.println(book);
		}
		
	}
}
