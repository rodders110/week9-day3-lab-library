
import models.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {

    Book book;

    @Before
    public void setUp() {
        Book book = new Book("Lord of the rings","J. R. R. Tolkien");

    }

    @Test
    public void hasTitle({
        assertEquals("Lord of the rings",book.getTitle());
    }

    @Test
    public void hasAuthor({
        assertEquals("J. R. R. Tolkien", book.getAuthor());
    }
}
