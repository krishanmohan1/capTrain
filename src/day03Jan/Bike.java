package day03Jan;

public class Bike {
    String name;
    double price;
    public void race(){
        System.out.println("1000 horse speed bike ");
    }
    Bike(){
        System.out.println("this is constructor");
    }


    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Bike b = new Bike();    // each time
        Bike f1 = new Bike();

    }

    // non static multiline initiliaziler
    {
        System.out.println("welcome to KTM");
    }
    static {        //it executes first
        System.out.println("static multi line");
    }

}
