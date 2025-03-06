package book.domain;

import book.domain.*;
import book.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class BookReservationCanceled extends AbstractEvent {

    private String reservationId;
    private String userId;
    private String bookId;
    private Date rentalDate;
    private Date dueDate;

    public BookReservationCanceled(BookManagement aggregate) {
        super(aggregate);
    }

    public BookReservationCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
