package p1_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf2 implements Aggragate {
    
    private ArrayList<Book> books;
    
    public BookShelf2(int initialSize) {
	books = new ArrayList<Book>(initialSize);
    }

    public Book getBookAt (int index) {
	return books.get(index);
    }
    
    public void appendBook(Book book) {
	books.add(book);
    }
    
    public int getLength() {
	return books.size();
    }
    
    @Override
    public Iterator<Book> iterator() {
	return new BookShelfIterator2(this);
    }
}
