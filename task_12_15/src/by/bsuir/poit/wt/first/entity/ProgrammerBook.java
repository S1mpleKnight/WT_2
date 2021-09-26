package by.bsuir.poit.wt.first.entity;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Programmer book: "
                + " Title = " +  super.getTitle()
                + " Author = " + super.getAuthor()
                + " Price = " + super.getPrice()
                + " Language = " + language
                + " Level = " + level;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        ProgrammerBook that = (ProgrammerBook) object;
        return level == that.level && Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode()) + Objects.hashCode(language) + level * 31;
    }
}
