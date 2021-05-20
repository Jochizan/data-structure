package classes.java;

public class Account {
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void toWrite() {
        System.out.println("El saldo es: " + balance);
    }

    public void deposit(float deposit) {
        balance += deposit;
    }

    public void retirement(float retirement) {
        balance -= retirement;
    }
}
