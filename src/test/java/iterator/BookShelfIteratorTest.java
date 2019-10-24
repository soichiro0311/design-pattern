package iterator;

import static org.junit.Assert.*;


import org.junit.Test;

public class BookShelfIteratorTest {

	@Test
	public void 本の数が0個だった場合_次の要素がないこと() {
		BookShelf bookShelf = new BookShelf(5);
		Iterator iterator = bookShelf.iterator();
		assertFalse(iterator.hasNext());
	}
	
	@Test
	public void 本の数が1個だった場合_次の要素があること() {
		BookShelf bookShelf = new BookShelf(5);
		Book book = new Book("TEST");
		bookShelf.add(book);
		Iterator iterator = bookShelf.iterator();
		assertTrue(iterator.hasNext());
	}
	
	@Test
	public void 本の数が1個だった場合_要素が取得できること() {
		Book book = new Book("TEST");
		BookShelf bookShelf = new BookShelf(5);
		bookShelf.add(book);
		Iterator iterator = bookShelf.iterator();
		Book result = (Book)iterator.next();
		assertEquals(book.getName(),result.getName());
	}
	
	@Test
	public void 本のインデックスを次に移動すると_次の要素が取得できること() {
		Book book = new Book("TEST");
		Book book2 = new Book("TEST2");
		BookShelf bookShelf = new BookShelf(5);
		bookShelf.add(book);
		bookShelf.add(book2);
		Iterator iterator = bookShelf.iterator();
		// 最初の要素
		Book result = (Book)iterator.next();
		assertEquals(book.getName(),result.getName());
		
		// ２番目の要素
		Book result2 = (Book)iterator.next();
		assertEquals(book2.getName(),result2.getName());
	}
}
