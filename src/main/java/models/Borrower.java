package models;


import java.util.ArrayList;
import java.util.List;

public class Borrower {

    private int id;
    private String name;
    List<Book> borrowed;

    public Borrower() {
    }

    public Borrower(String name) {
        this.name = name;
        this.borrowed = new ArrayList<Book>();
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

    public List<Book> getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(List<Book> borrowed) {
        this.borrowed = borrowed;
    }
}
