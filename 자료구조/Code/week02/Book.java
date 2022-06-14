package week02;

import java.util.Comparator;

public class Book implements Comparable<Book>{
	
	public static final Comparator<Book> WITH_NAME = new WithName();
	public static final Comparator<Book> WITH_DATE = new WithDate();
	public static final Comparator<Book> WITH_SERIAL = new WithSerial();

	private String title;
	private int serial;
	private int yyyy;
	private int mm;
	private int dd;
	
	public Book(String t, int s, int y, int m, int d) {
		title = t;
		serial = s;
		yyyy = y;
		mm = m;
		dd = d;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getSerial() {
		return serial;
	}

	public int getYyyy() {
		return yyyy;
	}

	public int getMm() {
		return mm;
	}

	public int getDd() {
		return dd;
	}
	
	public static class WithName implements Comparator<Book> {
		public int compare(Book b1, Book b2) {
			return b1.title.compareTo(b2.title);
		}

	}
	
	public static class WithDate implements Comparator<Book>{
		
		public int compare(Book b1, Book b2) {
			if(b1.yyyy - b2.yyyy == 0)
				if(b1.mm - b2.mm ==0)
					return b1.dd - b2.dd;
				else
					return b1.mm - b2.mm;
			
			else
				return b1.yyyy - b2.yyyy;
					//b1.yyyy.compareTo(b2.yyyy);
		}

	}
	
	public static class WithSerial implements Comparator<Book> {
		public int compare(Book b1, Book b2) {
			return b1.serial - b2.serial;
					//b1.serial.compareTo(b2.serial);
		}
	}

	@Override
	public int compareTo(Book b1) {
		// TODO Auto-generated method stub
		return this.title.compareTo(b1.title);
	}

}
