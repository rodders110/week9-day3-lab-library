package models;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private int id;
    private String name;
    private List<Book> books;
    private List<Borrower> borrowers;

    public Library() {
    }

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
        this.borrowers = new ArrayList<Borrower>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
