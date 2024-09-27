package comparison;

import java.util.Comparator;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private Integer year;

    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public int compareTo(Book book) {
        return title.compareTo(book.getTitle());
    }

}

class BookAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
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
        return book1.getYear().compareTo(book2.getYear());
    }
}

class BookTitleYearAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int year = Integer.compare(book1.getYear(), book2.getYear());
        if (year != 0) {
            return year;
        }
        int author = book1.getAuthor().compareTo(book2.getAuthor());
        if (author != 0) {
            return author;
        }
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
