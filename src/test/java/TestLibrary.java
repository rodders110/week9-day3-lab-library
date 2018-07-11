import models.Book;
import models.Borrower;
import models.Library;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestLibrary {

    Borrower borrower;
    Book book;
    Library library;


    @Before
    public void before(){
        library = new Library("Books R' Us");
        book = new Book("How to fix a Mac", "Steven Bonner");
        borrower = new Borrower("Roddy");
        library.rentBook(book, borrower);
    }

    @Test
    public void hasBook() {
        assertEquals("How to fix a Mac", library.getBooks().get(0).getTitle());
    }

    @Test
    public void LibraryHasName() {
        assertEquals("Books R' Us", library.getName());
    }

    @Test
    public void hasBorrower() {
        assertEquals("Roddy", library.getBorrowers().get(0).getName());
    }
}
