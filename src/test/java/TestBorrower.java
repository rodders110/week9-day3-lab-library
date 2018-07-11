import models.Borrower;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestBorrower {

   Borrower borrower;

    @Before
    public void before(){
      borrower = new Borrower("Tommy");
    }

    @Test
    public void hasName() {
        assertEquals("Tommy", borrower.getName());
    }

    @Test
    public void hasEmptyList() {
        assertEquals(0, borrower.getBorrowed().size());
    }
}
