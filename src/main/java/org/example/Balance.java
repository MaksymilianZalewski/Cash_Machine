package org.example;

public class Balance {

    float balance = 10000f;

//    public Balance(float balance) {
//        balance = 10000f;
//    }
    public void subtract(float value) {
        balance -= value;
    }

    public void add(float value) {
        balance += value;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "balance=" + balance +
                '}';
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
