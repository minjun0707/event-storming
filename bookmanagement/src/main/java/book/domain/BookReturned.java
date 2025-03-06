package book.domain;

import book.domain.*;
import book.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class BookReturned extends AbstractEvent {

    private String rentalId;
    private String userId;
    private Date rentalDate;
    private Date dueDate;
    private Date returnDate;

    public BookReturned(BookManagement aggregate) {
        super(aggregate);
    }

    public BookReturned() {
        super();
    }
}
//>>> DDD / Domain Event
