package by.bsuir.poit.wt.first.comparator;

import by.bsuir.poit.wt.first.entity.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book first, Book second) {
        return Integer.compare(first.getPrice(), second.getPrice());
    }

    @Override
    public Comparator<Book> thenComparing(Comparator<? super Book> other) {
        return Comparator.super.thenComparing(other);
    }
}
