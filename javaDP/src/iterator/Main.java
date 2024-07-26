package iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookshelf = new BookShelf(4);
		bookshelf.appendBook(new Book("Around the World in 80 Days"));
		bookshelf.appendBook(new Book("Bible"));
		bookshelf.appendBook(new Book("Cinderella"));
		bookshelf.appendBook(new Book("삼국지"));
		
		Iterator<Book> it = bookshelf.iterator();
		while(it.hasNext()) {//내부 내용이 끝날 때 까지 출력
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();
		
		for(Book book:bookshelf) {//위와 같은 동작을 하는 코드
			System.out.println(book.getName());
		}
	}

}
