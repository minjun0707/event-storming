package book.infra;

import book.config.kafka.KafkaProcessor;
import book.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    BookRepository bookRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookReserved'"
    )
    public void wheneverBookReserved_ChangeBookStatus(
        @Payload BookReserved bookReserved
    ) {
        BookReserved event = bookReserved;
        System.out.println(
            "\n\n##### listener ChangeBookStatus : " + bookReserved + "\n\n"
        );

        // Sample Logic //
        Book.changeBookStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookReservationCanceled'"
    )
    public void wheneverBookReservationCanceled_ChangeBookStatus(
        @Payload BookReservationCanceled bookReservationCanceled
    ) {
        BookReservationCanceled event = bookReservationCanceled;
        System.out.println(
            "\n\n##### listener ChangeBookStatus : " +
            bookReservationCanceled +
            "\n\n"
        );

        // Sample Logic //
        Book.changeBookStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookReservationCanceled'"
    )
    public void wheneverBookReservationCanceled_ChangeBookStatus(
        @Payload BookReservationCanceled bookReservationCanceled
    ) {
        BookReservationCanceled event = bookReservationCanceled;
        System.out.println(
            "\n\n##### listener ChangeBookStatus : " +
            bookReservationCanceled +
            "\n\n"
        );

        // Sample Logic //
        Book.changeBookStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookReturned'"
    )
    public void wheneverBookReturned_ChangeBookStatus(
        @Payload BookReturned bookReturned
    ) {
        BookReturned event = bookReturned;
        System.out.println(
            "\n\n##### listener ChangeBookStatus : " + bookReturned + "\n\n"
        );

        // Sample Logic //
        Book.changeBookStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
