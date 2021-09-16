package edu.uaslp.examen;

import java.util.ArrayList;

public class BookCollectionManager {
    private ArrayList<BookCollection> collections;

    public BookCollectionManager(){
        collections=new ArrayList<>();
    }

    public BookCollection createCollection(String name){
        BookCollection bookCollection=new BookCollection(name);
        collections.add(bookCollection);
        return bookCollection;
    }

    public BookCollection getCollectionByName(String name){
        for(BookCollection bookCollection:collections){
            if(bookCollection.getName().equals(name)){
                return bookCollection;
            }
        }
        return null;
    }

    public void deleteCollectionByName(String name){
        for(BookCollection bookCollection:collections){
            if(bookCollection.getName().equals(name)){
                collections.remove(bookCollection);
                return;
            }
        }
    }

    public void addBookToCollection(String collectionName, Book book){
       //Forma correcta
        BookCollection bookCollection=getCollectionByName(collectionName);
        if(bookCollection==null){
            bookCollection=createCollection(collectionName);
        }
        bookCollection.addBook(book);

    }

    public ArrayList<String> getCollectionNames(){
        ArrayList<String> collectionNames;
        collectionNames=new ArrayList<>();
        for(BookCollection bookCollection : collections){
            collectionNames.add(bookCollection.getName());
        }
        return collectionNames;
    }



}
