package day9thJan;

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


class Mini extends Ola {
    private int pickUp, drop;
    private int price;

    public Mini(String username, long contactNumber, double bal,
                int pickUp, int drop, int price) {
        super(username, contactNumber, bal);
        this.pickUp = pickUp;
        this.drop = drop;
        this.price = price;
    }

    public void bookCab() {
        if (getUberAccBal() >= price) {
            deductAmount(price);
            System.out.println(" Mini Cab Booked");
        } else {
            System.out.println(" Insufficient Balance (Mini)");
        }
    }

    public void display() {
        System.out.println("Mini | Pickup: " + pickUp + " Drop: " + drop + " Price: " + price);
    }

    public void cancelRide(){
        System.out.println("Why do you want to cancle ride?");

    }
}


class Prime extends Ola {
    private int pickUp, drop;
    private double price;

    public Prime(String username, long contactNumber, double bal,
                 int pickUp, int drop, double price) {
        super(username, contactNumber, bal);
        this.pickUp = pickUp;
        this.drop = drop;
        this.price = price;
    }

    public void bookCab() {
        if (getUberAccBal() >= price) {
            deductAmount(price);
            System.out.println(" Prime Cab Booked");
        } else {
            System.out.println(" Insufficient Balance (Prime)");
        }
    }

    public void display() {
        System.out.println("Prime | Pickup: " + pickUp + " Drop: " + drop + " Price: " + price);
    }
    public void cancelRide(){
        System.out.println("Ride Cancelled..");
    }
}


class Luxury extends Ola {
    private int pickUp, drop;
    private double price;

    public Luxury(String username, long contactNumber, double bal,
                  int pickUp, int drop, double price) {
        super(username, contactNumber, bal);
        this.pickUp = pickUp;
        this.drop = drop;
        this.price = price;
    }

    public void bookCab() {
        if (getUberAccBal() >= price) {
            deductAmount(price);
            System.out.println(" Luxury Cab Booked");
        } else {
            System.out.println(" Insufficient Balance (Luxury)");
        }
    }

    public void display() {
        System.out.println("Luxury | Pickup: " + pickUp + " Drop: " + drop + " Price: " + price);
    }
    public void cancelRide(){
        System.out.println("Ride Cancelled..");
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Contact: ");
        long contact = sc.nextLong();

        System.out.print("Wallet Balance: ");
        double bal = sc.nextDouble();

        System.out.print("Pickup: ");
        int pickUp = sc.nextInt();

        System.out.print("Drop: ");
        int drop = sc.nextInt();

        System.out.println("Choose Cab: 1.Mini  2.Prime  3.Luxury");
        int choice = sc.nextInt();

        Ola ola = null;

        switch (choice) {
            case 1:
                ola = new Mini(username, contact, bal, pickUp, drop, 100);
                break;

            case 2:
                ola = new Prime(username, contact, bal, pickUp, drop, 200);
                break;

            case 3:
                ola = new Luxury(username, contact, bal, pickUp, drop, 300);
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        sc.nextLine();

        // LOGIN

        System.out.print("Login Username: ");
        String loginUser = sc.nextLine();

        System.out.print("Login Contact: ");
        long loginContact = sc.nextLong();

        if (ola.login(loginUser, loginContact)) {
            System.out.println(" Login Successful");


            if (ola instanceof Mini) {
                Mini m = (Mini) ola;
                m.display();
                m.bookCab();
            } else if (ola instanceof Prime) {
                Prime p = (Prime) ola;
                p.display();
                p.bookCab();
            } else if (ola instanceof Luxury) {
                Luxury l = (Luxury) ola;
                l.display();
                l.bookCab();
            }

            System.out.println(" Remaining Balance: " + ola.getUberAccBal());

        } else {
            System.out.println(" Login Failed");
        }

        sc.close();
    }
}
