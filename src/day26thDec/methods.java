package day26thDec;

public class methods {
    public static void main(String[] args) {

        m1(m2(),m3(100),200);

    }

    public static void m1(int i, int x, int a){
        System.out.println("m1()-> "+a);
        System.out.println("m2()-> "+i);
        System.out.println("m3()-> "+x);
    }

    public static int m2(){
        return 10;
    }

    public static int  m3(int a){
        return a;
    }

}
