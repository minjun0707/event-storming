package book.domain;

import book.domain.*;
import book.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class LoggedIn extends AbstractEvent {

    private Long id;

    public LoggedIn(User aggregate) {
        super(aggregate);
    }

    public LoggedIn() {
        super();
    }
}
//>>> DDD / Domain Event
