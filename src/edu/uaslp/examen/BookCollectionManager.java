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
            if(name==bookCollection.getName()){
                return bookCollection;
            }
        }
        return null;
    }

    public void deleteCollectionByName(String name){
        for(BookCollection bookCollection:collections){
            if(name==bookCollection.getName()){
                collections.remove(bookCollection);
            }
        }
    }

    public void addBookToCollection(String collectionName, Book book){
        for(BookCollection bookCollection:collections){
            if(collectionName==bookCollection.getName()){
                bookCollection.addBook(book);
                return;
            }
        }
        BookCollection bookCollection = new BookCollection(collectionName);
        bookCollection.addBook(book);
        collections.add(bookCollection);
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
