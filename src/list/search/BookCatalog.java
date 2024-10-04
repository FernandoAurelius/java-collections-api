package list.search;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private final List<Book> books;

    public BookCatalog() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, LocalDate year) {
        books.add(new Book(title, author, year));
    }

    public List<Book> searchByAuthor(String author) {
        return books.stream().filter(b -> b.author().equalsIgnoreCase(author)).toList();
    }

    public List<Book> searchByYear(int beginningYear, int endingYear) {
        return books.stream()
                .filter(b -> b.year().isAfter(LocalDate.of(beginningYear - 1, 1, 1)))
                .filter(b -> b.year().isBefore(LocalDate.of(endingYear + 1, 1, 1)))
                .toList();
    }

    public Book searchByTitle(String title) {
        return books.stream().filter(b -> b.title().equalsIgnoreCase(title)).toList().get(0);
    }

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();

        bookCatalog.addBook("Peter Pan", "Etc.", LocalDate.of(2000, 1, 1));
        bookCatalog.addBook("Winds of Winter", "George R. R. Martin", LocalDate.of(1992, 1, 1));
        bookCatalog.addBook("The Fellowship of The Ring", "J. R. R. Tolkien", LocalDate.of(1939, 1, 1));
        bookCatalog.addBook("Dance of the Dragons", "George R. R. Martin", LocalDate.of(2011, 1, 1));

        System.out.println(bookCatalog.searchByAuthor("George R. R. Martin"));

        System.out.println(bookCatalog.searchByYear(1999, 2012));

        System.out.println(bookCatalog.searchByTitle("Dance of The Dragons"));
        System.out.println(bookCatalog.searchByAuthor("Game of Thrones"));
    }
}
