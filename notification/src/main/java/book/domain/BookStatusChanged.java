package book.domain;

import book.domain.*;
import book.infra.AbstractEvent;
import java.util.*;
import lombok.*;

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
}
