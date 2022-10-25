package com.example.demo.BookShope;

import org.junit.jupiter.api.*;
import java.util.List;


class BookServiceTest {

    BookService service;

    BookService bookServiceThatWillBeGeneratedBeforeEachMethodCall;

    @BeforeEach
    void callBookServiceClass(){
        bookServiceThatWillBeGeneratedBeforeEachMethodCall = new BookService();
        // by using this way an instance of bookService book created
    }






    @BeforeEach
    void setup(){
        service = new BookService();
    }

    @Test
    void test_create_service() {
        Assertions.assertDoesNotThrow(()-> {
            new BookService();
        });
    }

    @Test
    @DisplayName("addBook without getting failed") // testing add a new book to the map
    void test_service_add_no_exceptions(){
        Assertions.assertDoesNotThrow(()->{
            var assertedBook = new Book("a", "a" , "a" , 5.0);
            service.addBook(assertedBook);
        });
    }

    @Test
    @DisplayName("checking if there is duplicated book")
    void duplicatedBookShouldFailed(){

        var assertedBook = new Book("aa" , "ad" , "adsd" , 5.0);

        Assertions.assertDoesNotThrow(()->{
            service.addBook(assertedBook);
        });

        Assertions.assertThrows(BookAlreadyExistsException.class , () -> {
            service.addBook(assertedBook);
        });
    }


    @Test
    @DisplayName("duplicate book name must failed") // testing add a new book to the map
    void DuplicateBookNameShouldThrowExceptions(){

        var assertedBook = new Book("a", "a" , "a" , 5.0);
        var assertedBook2 = new Book("a", "a-z" , "a" , 5.0);

        Assertions.assertDoesNotThrow(()->{
            service.addBook(assertedBook);
        });

        var exception = Assertions.assertThrows(BookAlreadyExistsException.class , () -> {
            service.addBook(assertedBook2);
        });

        Assertions.assertEquals(BookAlreadyExistsException.Type.Name, exception.getType());
    }

    @Test
    @DisplayName("duplicate book isbn must failed") // testing add a new book to the map
    void DuplicateBookISBN_ShouldThrowExceptions(){

        var assertedBook = new Book("a", "a" , "a" , 5.0);
        var assertedBook2 = new Book("a-z", "a" , "a" , 5.0);

        Assertions.assertDoesNotThrow(()->{
            service.addBook(assertedBook);
        });

        var exception = Assertions.assertThrows(BookAlreadyExistsException.class , () -> {
            service.addBook(assertedBook2);
        });

        Assertions.assertEquals(BookAlreadyExistsException.Type.ISBN, exception.getType());
    }


    @Test
    @DisplayName("Add multiple book")
    void addMultipleBook(){

        Assertions.assertDoesNotThrow(() -> {

            var book1 = new Book("a" , "b" , "c" , 5.0);
            var book2 = new Book("b" , "c" , "d" , 5.0);
            var book3 = new Book("c" , "d" , "e" , 5.0);

            service.addBook(book1);
            service.addBook(book2);
            service.addBook(book3);

        });
    }


    @Test
    void searchByOneBookName(){

        var book1 = new Book("a" , "b" , "c" , 5.0);
        var book2 = new Book("b" , "c" , "d" , 5.0);
        var book3 = new Book("c" , "d" , "e" , 5.0);

        Assertions.assertDoesNotThrow(() -> {
            service.addBook(book1);
            service.addBook(book2);
            service.addBook(book3);
        });

        var result = service.search("b");
        var expected = List.of(book2);

        Assertions.assertEquals(expected, result);

    }

    @Test
    void searchByBookNameThatDoesNotExists(){

        var book1 = new Book("a" , "b" , "c" , 5.0);
        var book2 = new Book("b" , "c" , "d" , 5.0);
        var book3 = new Book("c" , "d" , "e" , 5.0);

        Assertions.assertDoesNotThrow(() -> {
            service.addBook(book1);
            service.addBook(book2);
            service.addBook(book3);
        });

        var result = service.search("Ö");
        var expected = List.of(book2);

        Assertions.assertTrue(result.isEmpty());

    }

    @Test
    void searchByMultipleBookNames(){

        var book1 = new Book("aa" , "b" , "c" , 5.0);
        var book2 = new Book("ab" , "c" , "d" , 5.0);
        var book3 = new Book("c" , "d" , "e" , 5.0);

        Assertions.assertDoesNotThrow(() -> {
            service.addBook(book1);
            service.addBook(book2);
            service.addBook(book3);
        });

        var result = service.search("a");
    //  result.containsAll(List.of(book1, book2)) ->  returns true/false
        var expected = List.of(book1 , book2);

        Assertions.assertEquals(expected, result);

    }


    @Test
    void getAllBooks(){

        var book1 = new Book("aa" , "b" , "c" , 5.0);
        var book2 = new Book("ab" , "c" , "d" , 5.0);
        var book3 = new Book("c" , "d" , "e" , 5.0);

        Assertions.assertDoesNotThrow(() -> {
            service.addBook(book1);
            service.addBook(book2);
            service.addBook(book3);
        });

        var result = service.getAllBooks();


        Assertions.assertTrue(result.containsAll(List.of(book1 , book2 , book3)));

    }


    @Test
    void getAllBooksFromEmptyListShouldReturnFailed(){

        var result = service.getAllBooks();
        Assertions.assertTrue(result.isEmpty()); // yes it is empty now and the test should pass
    }




}