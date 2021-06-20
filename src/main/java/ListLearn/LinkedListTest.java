package ListLearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, int quantity) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
}

public class LinkedListTest {

	public static void main(String args[]) {

		// Creating list of Books
		LinkedList<Book> list = new LinkedList<Book>();
		// Creating Books
		Book b1 = new Book(101, "A" , 8);
		Book b2 = new Book(102, "B" , 4);
		Book b3 = new Book(103, "C" , 6);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// Traversing list
		for (Book b : list) {
			System.out.println(b.id + " " + b.name +  " " + b.quantity);
		}
		
		list.removeFirst();
		
		System.out.println("\n");
		for (Book b : list) {
			
			System.out.println(b.id + " " + b.name +  " " + b.quantity);
		}

	}
}
