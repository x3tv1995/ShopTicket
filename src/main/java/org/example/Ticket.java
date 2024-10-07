package org.example;

import lombok.*;

import java.time.LocalDateTime;


@AllArgsConstructor
@Data

public class Ticket {
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private int id;

    private String nameCinema;

    @ToString.Exclude
    private String nameCustomer;

    private int sitNumber;
    private int price;
    private LocalDateTime localDateTime;

}
