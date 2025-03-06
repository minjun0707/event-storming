package book.domain;

import book.domain.*;
import book.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class BookReservationCanceled extends AbstractEvent {

    private String reservationId;
    private String userId;
    private String bookId;
    private Date rentalDate;
    private Date dueDate;
}
