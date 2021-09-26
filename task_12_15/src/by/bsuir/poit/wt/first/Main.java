package by.bsuir.poit.wt.first;

import by.bsuir.poit.wt.first.comparator.AuthorComparator;
import by.bsuir.poit.wt.first.comparator.NamingComparator;
import by.bsuir.poit.wt.first.comparator.PriceComparator;
import by.bsuir.poit.wt.first.entity.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Comparator<Book> first = AuthorComparator.getInstance().thenComparing(NamingComparator.getInstance());
        Comparator<Book> second = NamingComparator.getInstance().thenComparing(AuthorComparator.getInstance());
        var third = AuthorComparator.getInstance().thenComparing(NamingComparator.getInstance())
                .thenComparing(new PriceComparator());

        List<Book> books = new ArrayList<>();
        books.add(new Book("EFG", "Маша", 142, 7));
        books.add(new Book("DEF", "Саша", 115, 5));
        books.add(new Book("QWE", "Вася", 333, 2));
        books.add(new Book("GHJ", "Петя", 231, 11));
        books.add(new Book("EFG", "Егор", 142, 7));
        books.add(new Book("BCD", "Тоня", 222, 15));
        books.add(new Book("FGH", "Оля", 321, 6));
        books.add(new Book("ABC", "Ваня", 123, 1));
        books.add(new Book("CDE", "Вася", 333, 2));

        System.out.println(books.stream().sorted(AuthorComparator.getInstance()).collect(Collectors.toList()));

        System.out.println(books.stream().sorted(NamingComparator.getInstance()).collect(Collectors.toList()));

        System.out.println(books.stream().sorted(first).collect(Collectors.toList()));

        System.out.println(books.stream().sorted(second).collect(Collectors.toList()));

        System.out.println(books.stream().sorted(third).collect(Collectors.toList()));
    }
}
