package edu.uaslp.examen;

//import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private String name;
    private ArrayList<Book> books;

    public BookCollection(String name){
        books = new ArrayList<>();
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book){
        book.setTitle(book.getTitle());
        book.setAuthor(book.getAuthor());
        book.setIsbn(book.getIsbn());
        book.setStars(book.getStars());

        books.add(book);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public int getStars(){
        int numStars=0, cont=0;
        for(Book book:books){
            numStars=numStars+book.getStars();
            cont++;
        }
        numStars=numStars/cont;
        return numStars;
    }
}
