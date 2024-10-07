package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {
   private static List<User> userList = Arrays.asList(
            new User(1,"user1","123",800),
            new User(2,"user2","qwerty",744.5),
            new User(3,"user3","qwerty",600),
            new User(4,"user4","qwerty",545),
            new User(5,"user5","qwerty",600.6)

    );


   private static List<Ticket> tickets = Arrays.asList(
            new Ticket(1,"Веном 3",null,1,600, LocalDateTime.of(2024,10,7,21,0)),
            new Ticket(2,"Веном 3",null,1,600, LocalDateTime.of(2024,10,7,21,0)),
            new Ticket(3,"Веном 3",null,1,600, LocalDateTime.of(2024,11,17,23,0)),
            new Ticket(4,"Веном 3",null,1,600, LocalDateTime.of(2024,10,27,22,0))

    );

    public static List<Ticket> getTickets() {
        return new ArrayList<>(tickets);
    }
    public static List<User> getUserList() {
        return new ArrayList<>(userList);
    }
    public static User  findByUsername(String name){
       for(User user:userList){
           if(user.getUsername().equals(name)){
               return user;
           }
       }
       return null;
    }


 }
