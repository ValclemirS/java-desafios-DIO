import java.util.List;

import book.library.Book;
import book.library.LibraryFacade;

public class App {
    public static void main(String[] args) {
        LibraryFacade libraryFacade = new LibraryFacade();

        // Verificar livros disponíveis
        List<Book> availableBooks = libraryFacade.getAvailableBooks();
        System.out.println("Livros disponíveis na biblioteca:");
        for (Book book : availableBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        // Empréstimo de um livro
        Book bookToLend = availableBooks.get(0);
        libraryFacade.lendBook(bookToLend);
        System.out.println("O livro '" + bookToLend.getTitle() + "' foi emprestado.");

        // Verificar livros disponíveis após empréstimo
        availableBooks = libraryFacade.getAvailableBooks();
        System.out.println("Livros disponíveis na biblioteca após o empréstimo:");
        for (Book book : availableBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        // Devolução de um livro
        libraryFacade.returnBook(bookToLend);
        System.out.println("O livro '" + bookToLend.getTitle() + "' foi devolvido.");

        // Verificar livros disponíveis após devolução
        availableBooks = libraryFacade.getAvailableBooks();
        System.out.println("Livros disponíveis na biblioteca após a devolução:");
        for (Book book : availableBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
