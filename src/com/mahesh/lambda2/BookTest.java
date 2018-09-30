package com.mahesh.lambda2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book();
		book.setName("def");
		book.setAuthor("dan brown");
		
		Book book2 = new Book();
		book2.setName("abc");
		book2.setAuthor("Amit trivedi");
		
		Book book3 = new Book();
		book3.setName("ghi");
		book3.setAuthor("Amit trivedi");
		
		List<Book> booksList = new ArrayList<Book>();
		booksList.add(book);
		booksList.add(book2);
		booksList.add(book3);
		
		booksList.stream().map(b->b.getName()).distinct().sorted().collect(Collectors.toList());
		booksList.forEach(b->System.out.println(b));
//		for(Book b : booksList){
//			System.out.println(b);
//		}
	}

}
