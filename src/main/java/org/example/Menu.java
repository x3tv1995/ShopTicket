package org.example;

import java.util.Scanner;

public class Menu {
    private User user;
    private Scanner scanner = new Scanner(System.in);


    public void start(){
        while (user == null){
            login();
        }

        while (true) {
            System.out.println("1 купить билет");
            System.out.println("2 список билетов "); //вывести список билетов юзера
            String  sc = scanner.nextLine();
            if(sc.equals("1")){
                payTicket();
            } else if (sc.equals("2")) {
                for (Ticket ticket : DataBase.getTickets()) {
                    System.out.println(ticket);
                }
            }
            //принть команды и вызывать соответсвующие методы

        }


    }


    private void payTicket(){
        System.out.println("Введите название фильма");
        String str =scanner.nextLine();

        for(Ticket ticket:DataBase.getTickets()){
            double balance =0;
            if (ticket.getNameCinema().equals(str)){

                if (user.getMoneyBalance() >= 600) {
                    balance = user.getMoneyBalance() - 600;
                    System.out.println("Списано 600 руб");

                    user.addTicket(ticket);
                    user.setMoneyBalance(balance);
                    System.out.println(" Оплата прошла успешно. " +"Ваш баланс: "+balance );
                    break;
                } else {
                    balance = user.getMoneyBalance();
                    System.out.println(" Не хватает средств. " +"Ваш баланс: "+balance );
                    break;
                }


            }else {
                System.out.println("Нет такого фильма");
            }
        }

        //принть название  фильма и если у юзера на балансе хватит средств то списать их и билет добавить юзеру иначе вывести не хватает средств

    }


    private  void login() {
        System.out.println("введите логин");
        String login = scanner.nextLine();

        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        user = DataBase.findByUsername(login);
        if (user == null) {
            System.out.println("неверный логин!");
            return;
        }
        if (!password.equals(user.getPassword())) {
            System.out.println("неверный пароль!");
            user = null;
            return;
        }

        System.out.println("Вы вошли в аккаунт");
    }

}
