package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
	private List<Book> books;

	public BookShelf(int maxSize) {
		this.books = new ArrayList<>(maxSize);
	}

	public int allBookCount() {
		return this.books.size();
	}

	public void add(Book book) {
		this.books.add(book);
	}

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

	public Book getBookAt(int index) {
		return this.books.get(index);
	}

}
