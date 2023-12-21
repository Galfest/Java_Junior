package l2.classwork;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String[] args) {


        Book book1 = new Book(15, "Metro 2033");
        Book book2 = new Book(2, "How to create a e-com");
        Book book3 = new Book(11, "Java for beginners");


        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (Book book : books){
            System.out.println(book);
        }

//        System.out.println(books.toString());
    }
}
