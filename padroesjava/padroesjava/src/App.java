import java.util.List;

import book.Book;
import facade.LibratyFacade;
import singleton.catalog.LibraryCatalog;

public class App {
    public static void main(String[] args) {
        LibratyFacade libraryFacade = new LibratyFacade();

        // Usando o padrão Singleton para acessar o catálogo da biblioteca
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Usando a classe Facade para adicionar livros ao catálogo
        libraryFacade.addBookToCatalog("The Great Gatsby", "F. Scott Fitzgerald");
        libraryFacade.addBookToCatalog("To Kill a Mockingbird", "Harper Lee");
        libraryFacade.addBookToCatalog("1984", "George Orwell");

        // Usando a classe Facade para obter todos os livros no catálogo
        List<Book> books = libraryFacade.getAllBooksInCatalog();

        System.out.println("Lista de Livros na Biblioteca:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}