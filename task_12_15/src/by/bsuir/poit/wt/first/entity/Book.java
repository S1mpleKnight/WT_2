package by.bsuir.poit.wt.first.entity;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private static int edition;
    private String title;
    private String author;
    private int price;
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book: Title = '" + title + '\'' + " Author = '" + author + '\'' + " Price = " + price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title) * 31 << 5 + Objects.hashCode(author);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book clone = (Book) super.clone();
        clone.author = this.getAuthor();
        return clone;
    }

    @Override
    public int compareTo(Book book) {
        return Integer.compare(this.isbn, book.isbn);
    }
}
