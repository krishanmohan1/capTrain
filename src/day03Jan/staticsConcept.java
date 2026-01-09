package day03Jan;

// to call static member no need pf main mehod use static multiline initalizer

public class staticsConcept {
    static int a = 4;

    static void method1(){
        System.out.println("meyhod");
    }
    public static void main(String[] args) {

    }

    static      //-> this is multiline static intiliazer
    {
        System.out.println(a);
        method1();
    }
}
