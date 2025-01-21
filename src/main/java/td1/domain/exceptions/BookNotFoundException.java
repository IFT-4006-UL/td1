package td1.domain.exceptions;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException() {
        super("Book not found");
    }
}
