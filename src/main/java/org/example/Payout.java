package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Payout {
    Scanner scanner = new Scanner(System.in);
    Balance balance = new Balance();

    public void pickNumber() {
        boolean isContinuing = true;
        while (isContinuing) {
            System.out.println("Jaką kwotę chcesz wypłacić:" +
                    "\n 1.100" +
                    "\n 3.200" +
                    "\n 3.500" +
                    "\n 4.Inna kwota" +
                    "\n 0. Powrót do menu");
            int number = scanner.nextInt();
            switch (number) {
                case 1:

                    float money100 = 100f;
                    balance.subtract(money100);
                    System.out.println("Wypłacono: " + money100 + "PLN");
                    System.out.println(balance.getBalance());
                    balance.setBalance(balance.getBalance());
                    break;
                case 2:
                    float money200 = 200f;
                    balance.subtract(money200);
                    System.out.println("Wypłacono: " + money200 + "PLN");
                    System.out.println(balance.getBalance());
                    balance.setBalance(balance.getBalance());
                    break;
                case 3:
                    float money500 = 500f;
                    balance.subtract(money500);
                    System.out.println("Wypłacono: " + money500 + "PLN");
                    System.out.println(balance.getBalance());
                    balance.setBalance(balance.getBalance());
                    break;
                case 4:
                    float money = scanner.nextFloat();
                    balance.subtract(money);
                    System.out.println("Wypłacono: " + money + "PLN");
                    System.out.println(balance.getBalance());
                    balance.setBalance(balance.getBalance());
                    break;
                case 0:
                    Menu menu = new Menu();
                    menu.choosingMenu();


            }
        }
    }
}
