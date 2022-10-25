package com.example.demo.BookShope;

import java.util.*;

//this class will contain the logic and will save the info of books

public class BookService {

    private final Map<String , Book> books = new HashMap<>();

    public void addBook(Book book) throws BookAlreadyExistsException {
       if (books.containsKey(book.getName()))
            throw new BookAlreadyExistsException(BookAlreadyExistsException.Type.Name);

        else if(getByISBN(book.getIsbn()) != null)
            throw new BookAlreadyExistsException(BookAlreadyExistsException.Type.ISBN);

        books.put(book.getName(), book);

        if (books.containsValue(book.getName()))
            throw new BookAlreadyExistsException(BookAlreadyExistsException.Type.Name);

        if (books.containsValue(book.getIsbn()))
            throw new BookAlreadyExistsException(BookAlreadyExistsException.Type.ISBN);

        books.put(book.getName() , book);
    }


    public Book getByISBN(String isbn) {

        for (var entry : books.entrySet()){
            if (entry.getValue().getIsbn().equals(isbn)) return entry.getValue();
        }
        return null;
    }

    public void deleteBook(String isbn){

    }


    public Collection<Book> getAllBooks(){
        return this.books.values();
    }


    public Collection<Book> search(String name){

        // list to save all books I searched
        var bookArray = new ArrayList<Book>();

        //loop throw the main array(books) to check if the book I'm looking for exists or not
        for (var x : books.entrySet()){

            //define the name of the book I'm looking for
            var bookName = x.getValue().getName();

            if (bookName.toLowerCase().contains(name.toLowerCase()))
                bookArray.add(x.getValue());
        }
        return bookArray;
    }


    public void editBook(Book book){

    }
}
