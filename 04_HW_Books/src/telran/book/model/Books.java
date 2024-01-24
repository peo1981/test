package telran.book.model;

public class Books {
	private long isbn;
	private String title;
	private String author;
	private int yearOfPublishing;
	
	public Books(long isbn, String title, String author, int yearOfPublishing) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.yearOfPublishing = yearOfPublishing;
			
	}

	public long getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}
    public void printInf0() {
    	System.out.print("ISBN-"+isbn+" / Title -"+title+" / Author-"+author+" / Year-"+yearOfPublishing);
    }

	@Override
	public String toString() {
		return "About Book: isbn=" + isbn + ", title=" + title + ", author=" + author + ", yearOfPublishing="+
				+ yearOfPublishing ;
	}
	
}
