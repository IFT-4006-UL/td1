package td1.infra.persistence.inMemory;

import td1.domain.Book;
import td1.domain.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryInMemory implements BookRepository {
    public List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public Book findByTitle(String title) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getAll() {
        return books;
    }
}
