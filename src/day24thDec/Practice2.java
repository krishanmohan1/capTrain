package day24thDec;

public class Practice2 {
    public static void main(String[] args) {

        // Option 1
        System.out.println("x : "+m1());
        System.out.println("x : "+m2());
        System.out.println("x : "+m3());

        // Option2


        int res1 = m1();
        double res2 = m2();
        int res3 = m3();

        System.out.println("x : "+res1);
        System.out.println("x : "+res2);
        System.out.println("x : "+res3);

    }

    public static int m1(){
        int x = 200;
        return x;
    }

    public static double m2(){  // implecitely typecasting, widening
        int x = 100;
        return x;
    }

    public static int m3(){     // narrowing
        double x = 100.0;
        return (int)x;
    }

}
