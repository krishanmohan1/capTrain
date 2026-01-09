package CabBooking9thJan;

import java.util.Scanner;

class Ola {
    private String username;
    private long contactNumber;
    private double uberAccBal;

    public Ola(String username, long contactNumber, double uberAccBal) {
        this.username = username;
        this.contactNumber = contactNumber;
        this.uberAccBal = uberAccBal;
    }

    public boolean login(String username, long contactNumber) {
        return this.username.equals(username) && this.contactNumber == contactNumber;
    }

    public double getUberAccBal() {
        return uberAccBal;
    }

    public void deductAmount(double amount) {
        uberAccBal -= amount;
    }
}

class  Mini extends Ola{
    private int pickUp;
    private int drop;
    private double price;

    public Mini(String username, long contactNumber, double uberAccBal, int pickUp, int drop, double price){
        super(username,contactNumber,uberAccBal);
        this.pickUp=pickUp;
        this.drop=drop;
        this.price=price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
