package book.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private static LibraryManager instance;
    private List<Book> availableBooks;

    private LibraryManager() {
        availableBooks = new ArrayList<>();
        availableBooks.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        availableBooks.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        availableBooks.add(new Book("1984", "George Orwell"));
    }

    public static LibraryManager getInstance() {
        if (instance == null) {
            instance = new LibraryManager();
        }
        return instance;
    }

    public List<Book> getAvailableBooks() {
        return availableBooks;
    }

    public void lendBook(Book book) {
        availableBooks.remove(book);
    }

    public void returnBook(Book book) {
        availableBooks.add(book);
    }
}
