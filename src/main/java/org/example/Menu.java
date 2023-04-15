package org.example;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void choosingMenu(){

        System.out.println("Wybierz opcję co chcesz zrobić:" +
                "\n1. Saldo konta" +
                "\n2. Wypłata gotówki" +
                "\n3. Wpłata gotówki" +
                "\n9. Wyjdź");
        int number = scanner.nextInt();

        switch(number) {


            case 1:
                Balance balance = new Balance();
                System.out.println("Stan konta to: " + balance);

            case 2:
                Payout payout = new Payout();
                payout.pickNumber();
            case 3:
                Deposit deposit = new Deposit();
                deposit.pickNumber();

            case 9:
                break;

        }

    }

}