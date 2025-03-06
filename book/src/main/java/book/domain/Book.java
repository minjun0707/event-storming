package book.domain;

import book.BookApplication;
import book.domain.BookDeleted;
import book.domain.BookRegistered;
import book.domain.BookStatusChanged;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Book_table")
@Data
//<<< DDD / Aggregate Root
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String bookId;

    private String isbn;

    private String author;

    private String status;

    private String category;

    private String title;

    @PostPersist
    public void onPostPersist() {
        BookRegistered bookRegistered = new BookRegistered(this);
        bookRegistered.publishAfterCommit();

        BookDeleted bookDeleted = new BookDeleted(this);
        bookDeleted.publishAfterCommit();

        BookStatusChanged bookStatusChanged = new BookStatusChanged(this);
        bookStatusChanged.publishAfterCommit();
    }

    public static BookRepository repository() {
        BookRepository bookRepository = BookApplication.applicationContext.getBean(
            BookRepository.class
        );
        return bookRepository;
    }

    //<<< Clean Arch / Port Method
    public static void changeBookStatus(BookReserved bookReserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Book book = new Book();
        repository().save(book);

        BookStatusChanged bookStatusChanged = new BookStatusChanged(book);
        bookStatusChanged.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(bookReserved.get???()).ifPresent(book->{
            
            book // do something
            repository().save(book);

            BookStatusChanged bookStatusChanged = new BookStatusChanged(book);
            bookStatusChanged.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeBookStatus(
        BookReservationCanceled bookReservationCanceled
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Book book = new Book();
        repository().save(book);

        BookStatusChanged bookStatusChanged = new BookStatusChanged(book);
        bookStatusChanged.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(bookReservationCanceled.get???()).ifPresent(book->{
            
            book // do something
            repository().save(book);

            BookStatusChanged bookStatusChanged = new BookStatusChanged(book);
            bookStatusChanged.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeBookStatus(
        BookReservationCanceled bookReservationCanceled
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Book book = new Book();
        repository().save(book);

        BookStatusChanged bookStatusChanged = new BookStatusChanged(book);
        bookStatusChanged.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(bookReservationCanceled.get???()).ifPresent(book->{
            
            book // do something
            repository().save(book);

            BookStatusChanged bookStatusChanged = new BookStatusChanged(book);
            bookStatusChanged.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeBookStatus(BookReturned bookReturned) {
        //implement business logic here:

        /** Example 1:  new item 
        Book book = new Book();
        repository().save(book);

        BookStatusChanged bookStatusChanged = new BookStatusChanged(book);
        bookStatusChanged.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(bookReturned.get???()).ifPresent(book->{
            
            book // do something
            repository().save(book);

            BookStatusChanged bookStatusChanged = new BookStatusChanged(book);
            bookStatusChanged.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
