package comparison;

import java.util.Comparator;

public record Book(String title, String author, Integer year) implements Comparable<Book> {

    @Override
    public int compareTo(Book book) {
        return title.compareTo(book.title());
    }

}

class BookAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.author().compareTo(book2.author());
    }
}

class BookYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        /* Valid option as well (basically, the same thing that is done by Integer wrapper class):
        if (book1.getYear() < book2.getYear()) {
            return -1;
        }
        if (book1.getYear() > book2.getYear()) {
            return 1;
        }
        return 0; */
        return book1.year().compareTo(book2.year());
    }
}

class BookTitleYearAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int year = Integer.compare(book1.year(), book2.year());
        if (year != 0) {
            return year;
        }
        int author = book1.author().compareTo(book2.author());
        if (author != 0) {
            return author;
        }
        return book1.title().compareTo(book2.title());
    }
}
