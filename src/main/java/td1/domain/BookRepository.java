package td1.domain;

import java.util.List;

public interface BookRepository {

    void add(Book book);
    List<Book> getAll();
    Book findByTitle(String title);
}
