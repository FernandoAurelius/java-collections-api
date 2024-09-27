package comparison;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>() {
            {
                add(new Book("Java - Guia do Programador: Atualizado Para Java 16", "Peter Jandl Junior", 2021));
                add(new Book("Desenvolvimento Real de Software: Um guia de projetos para fundamentos em Java",
                        "Raoul-Gabriel Urma e  Richard Warburton", 2021));
                add(new Book(
                        "Microsserviços Prontos Para a Produção: Construindo Sistemas Padronizados em uma Organização de Engenharia de Software",
                        "Susan J. Fowler", 2017));
                add(new Book("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos",
                        "Aditya Y. Bhargava", 2017));
                add(new Book("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017));
            }
        };

        System.out.println("Books after 'natural' comparison: ");
        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " +
                    book.getAuthor() + " - " +
                    book.getYear()
            );
        }

        System.out.println("---------------------------------------");

        System.out.println("Books after year comparison: ");
        books.sort(new BookYearComparator());
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " +
                    book.getAuthor() + " - " +
                    book.getYear()
            );
        }

        System.out.println("---------------------------------------");

        System.out.println("Books after author comparison: ");
        books.sort(new BookAuthorComparator());
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " +
                    book.getAuthor() + " - " +
                    book.getYear()
            );
        }

        System.out.println("---------------------------------------");

        System.out.println("Books after title, year and author comparison: ");
        books.sort(new BookTitleYearAuthorComparator());
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " +
                    book.getAuthor() + " - " +
                    book.getYear()
            );
        }

    }
}
