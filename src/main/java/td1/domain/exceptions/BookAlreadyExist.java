package td1.domain.exceptions;

public class BookAlreadyExist extends RuntimeException {

    public BookAlreadyExist() {
        super("Book already exists");
    }
}
