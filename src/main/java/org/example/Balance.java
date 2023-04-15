package org.example;

public class Balance {

    public static float balance = 10000.00f;

    public void subtract(float value) {
        balance -= value;
        setBalance(balance);
    }

    public void add(float value) {
        balance += value;
        setBalance(balance);
    }

    @Override
    public String toString() {
        return balance + " PLN";
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
