package p1_iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	BookShelf2 bookShelf = new BookShelf2(4);
	
	bookShelf.appendBook(new Book("Around the World"));
	bookShelf.appendBook(new Book("Bible"));
	bookShelf.appendBook(new Book("Cinderella"));
	bookShelf.appendBook(new Book("Daddy"));
	bookShelf.appendBook(new Book("Eclipse"));
	bookShelf.appendBook(new Book("f"));
	
	Iterator<Book> iterator = bookShelf.iterator();
	
	while (iterator.hasNext()) {
	    String bookName = iterator.next().getName();
	    System.out.println(bookName);
	}
    }
}
