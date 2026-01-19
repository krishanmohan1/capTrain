package day12thJanLibarary;

/*

    Object Class
        - present in java.lang package which is by default imported in all class
        - it is Super Most class
        - It has 11 Non-Static methods
               - toString() -> String -> public
               - equals(Object s)-> boolean -> public
               - hashCode() -> int -> Public
               - getClass() -> className -> public  -> it will provide package.classname.hexadecimal, it not want onnly want class name then .getName
               - clone () -> Object -> public   -> it must give exception
               - finalize() -> void -> protected    -> clean unused object

               # Multithreading -> gives Interupting Exception

               - notify() -> void -> public -> final
               - notifyAll() -> void -> public -> final
               - wait() -> void -> final public
               - wait(long i) -> void -> final public
               - wait(int i, long l) -> void -> final public

               # toString()
               - to print current class attribute
               - no two toString() is allowed



 */

class D{
    int age;
    D(int age){
        this.age=age;
    }
//    public String toString(){
//        return "";
//    }

}

public class ObjectClass {
    public static void main(String[] args) {
        D d = new D(25);
        System.out.println(d.toString());
        System.out.println(d);

    }
}
