package telran.book;

import telran.book.model.Books;
import telran.book.model.SchollBook;

public class BookAppl {

	public static void main(String[] args) {
		Books book1=new Books(1001, "Sapiens", "Yuval Noah Harari", 2014);
		book1.printInf0();
		Books book2=new Books(1002, "Student", "John Walker", 2010);
		System.out.println();
		book2.printInf0();
		System.out.println();
		Books schoolbook1=new SchollBook(1003, "Geometry for beginers", "Bloch", 2020, "Mathematic", 7);
		System.out.println(schoolbook1.toString());

	}

}
