package iterator;

public class BookShelfIterator implements Iterator {

	private int index;
	private BookShelf bookShelf;

	public BookShelfIterator(BookShelf bookshelf){
		this.bookShelf = bookshelf;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		return index < bookShelf.allBookCount();
	}
	@Override
	public Book next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
