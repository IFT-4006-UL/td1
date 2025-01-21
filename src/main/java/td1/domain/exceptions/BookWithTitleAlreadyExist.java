package td1.domain.exceptions;

public class BookWithTitleAlreadyExist extends RuntimeException {

    public BookWithTitleAlreadyExist() {
        super("A book with this title already exist");
    }
}
