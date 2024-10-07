package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor

@Data
public class User {
    @EqualsAndHashCode.Exclude
    private int id;
    private String username;
    private String password;
    private  double moneyBalance;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private final List<Ticket> tickets = new ArrayList<>();

    public  void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public List<Ticket> getTickets() {
        return new ArrayList<>(tickets);
    }
}
