package facade;

import java.util.List;

import book.Book;

public class LibratyFacade {
    private LibraryCatalog libraryCatalog;

    public LibratyFacade() {
        libraryCatalog = LibraryCatalog.getInstance();
    }

    public void addBookToCatalog(String title, String author) {
        Box book = new Box(title, author);
        libraryCatalog.addBook(book);
    }

    public List<Book> getAllBooksInCatalog() {
        return libraryCatalog.getAllBooks();
    }
}
