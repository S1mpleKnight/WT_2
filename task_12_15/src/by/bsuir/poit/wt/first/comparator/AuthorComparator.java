package by.bsuir.poit.wt.first.comparator;

import by.bsuir.poit.wt.first.entity.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    private static AuthorComparator instance;

    private AuthorComparator() {
    }

    public static AuthorComparator getInstance() {
        if (instance == null) {
            instance = new AuthorComparator();
        }
        return instance;
    }

    @Override
    public int compare(Book firstBook, Book secondBook) {
        return AlphabetComparator.getInstance().compare(firstBook.getAuthor(), secondBook.getAuthor());
    }
}
