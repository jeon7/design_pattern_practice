package p1_iterator;

import java.util.Iterator;

public class BookShelfIterator2 implements Iterator<Book> {

    private BookShelf2 bookShelf;
    private int index;

    public BookShelfIterator2(BookShelf2 bookShelf) {
	this.bookShelf = bookShelf;
	this.index = 0;
    }

    @Override
    public boolean hasNext() {
	if (index < bookShelf.getLength())
	    return true;
	else
	    return false;
    }

    @Override
    public Book next() {
	Book book = bookShelf.getBookAt(index);
	index++;
	return book;
    }

}
