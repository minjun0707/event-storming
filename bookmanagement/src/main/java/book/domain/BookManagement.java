package book.domain;

import book.BookmanagementApplication;
import book.domain.BookReservationCanceled;
import book.domain.BookReservationCanceled;
import book.domain.BookReserved;
import book.domain.BookReturned;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "BookManagement_table")
@Data
//<<< DDD / Aggregate Root
public class BookManagement {

    @Id
    private String rentalId;

    private String reservationId;

    private String userId;

    private Date rentalDate;

    private Date dueDate;

    @PostPersist
    public void onPostPersist() {
        BookReserved bookReserved = new BookReserved(this);
        bookReserved.publishAfterCommit();

        BookReservationCanceled bookReservationCanceled = new BookReservationCanceled(
            this
        );
        bookReservationCanceled.publishAfterCommit();

        BookReservationCanceled bookReservationCanceled = new BookReservationCanceled(
            this
        );
        bookReservationCanceled.publishAfterCommit();

        BookReturned bookReturned = new BookReturned(this);
        bookReturned.publishAfterCommit();
    }

    public static BookManagementRepository repository() {
        BookManagementRepository bookManagementRepository = BookmanagementApplication.applicationContext.getBean(
            BookManagementRepository.class
        );
        return bookManagementRepository;
    }
}
//>>> DDD / Aggregate Root
