package book.domain;

import book.domain.*;
import book.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class BookReturned extends AbstractEvent {

    private String rentalId;
    private String userId;
    private Date rentalDate;
    private Date dueDate;
    private Date returnDate;
}
