package book.domain;

import book.domain.*;
import book.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class BookStatusChanged extends AbstractEvent {

    private Long id;
    private String bookId;
    private String isbn;
    private String author;
    private String status;
    private String category;
    private String title;

    public BookStatusChanged(Book aggregate) {
        super(aggregate);
    }

    public BookStatusChanged() {
        super();
    }
}
//>>> DDD / Domain Event
