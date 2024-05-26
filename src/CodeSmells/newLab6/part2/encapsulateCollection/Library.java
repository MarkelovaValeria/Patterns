package CodeSmells.newLab6.part2.encapsulateCollection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books){
        this.books = new ArrayList<>(books);
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
