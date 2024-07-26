package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {

	private BookShelf bookshelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookshelf) {//생성자
		this.bookshelf = bookshelf;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {//다음 책 존재 유무
		if(index < bookshelf.getLength()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Book next() {//다음책을 가지고 올 때 
		if(!hasNext()) {
			throw new NoSuchElementException();//throw 예외 생성 
		}
		Book book = bookshelf.getBookAt(index);
		index++;
		return book;
	}

}
