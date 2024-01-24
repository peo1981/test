package telran.book.model;

public class SchollBook extends Books{
	
	 private String subject;
	 private int grade ;
	public SchollBook(long isbn, String title, String author, int yearOfPublishing, String subject, int grade) {
		super(isbn, title, author, yearOfPublishing);
		this.subject = subject;
		this.grade = grade;
	}
	public String getSubject() {
		return subject;
	}
	public int getGrade() {
		return grade;
	}
	@Override
	public String toString() {
		return super.toString() +" subject=" + subject + ", grade=" + grade ;
	}
	
	
	
}
