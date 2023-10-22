package book.library;

import java.util.List;

public class LibraryFacade {
    private LibraryManager libraryManager;

    public LibraryFacade() {
        libraryManager = LibraryManager.getInstance();
    }

    public List<Book> getAvailableBooks() {
        return libraryManager.getAvailableBooks();
    }

    public void lendBook(Book book) {
        libraryManager.lendBook(book);
    }

    public void returnBook(Book book) {
        libraryManager.returnBook(book);
    }
}
