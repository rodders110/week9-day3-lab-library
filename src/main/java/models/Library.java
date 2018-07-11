package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "libraries")
public class Library {

    private int id;
    private String name;
    private List<Book> books;
    private List<Borrower> borrowers;
    private Book book;

    public Library() {
    }

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
        this.borrowers = new ArrayList<Borrower>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Borrower> getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(List<Borrower> borrowers) {
        this.borrowers = borrowers;
    }

    public void rentBook(Book book, Borrower borrower){
        this.getBorrowers().add(borrower);
        this.getBooks().add(book);
        book.setBorrower(borrower);
        book.setOnLoan(true);
        borrower.getBorrowed().add(book);
    }


}
