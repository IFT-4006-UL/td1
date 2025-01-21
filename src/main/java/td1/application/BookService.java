package td1.application;

import td1.domain.Book;
import td1.domain.BookRepository;
import td1.domain.exceptions.BookNotFoundException;
import td1.domain.exceptions.BookAlreadyExist;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title, String author, int year) {
        if (bookRepository.findByTitle(title) != null) {
            throw new BookAlreadyExist();
        }

        Book book = new Book(title, author, year);
        bookRepository.add(book);
    }

    public List<BookDto> getBooks() {
        List<Book> books = bookRepository.getAll();

        List<BookDto> bookDtos = new ArrayList<>();
        for (Book book : books) {
            bookDtos.add(new BookDto(book.title, book.author, book.year));
        }

        return bookDtos;
    }

    public BookDto findBookByTitle(String title) {
        Book book = bookRepository.findByTitle(title);
        if (book == null) {
            throw new BookNotFoundException();
        }

        return new BookDto(book.title, book.author, book.year);
    }
}
