package by.bsuir.poit.wt.first.comparator;

import by.bsuir.poit.wt.first.entity.Book;

import java.util.Comparator;

public class NamingComparator implements Comparator<Book> {
    private static NamingComparator instance;

    private NamingComparator() {
    }

    public static NamingComparator getInstance() {
        if (instance == null) {
            instance = new NamingComparator();
        }
        return instance;
    }

    @Override
    public int compare(Book firstBook, Book secondBook) {
        return AlphabetComparator.getInstance().compare(firstBook.getTitle(), secondBook.getTitle());
    }
}
