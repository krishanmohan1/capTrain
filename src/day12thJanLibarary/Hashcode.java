package day12thJanLibarary;

class A{
    String name = "hell";
    @Override
    public  int hashCode(){
        return name.hashCode();
    }
}

public class Hashcode {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode()==a2.hashCode());
//        System.out.println(a1.hashCode().equals(a2.hashCode()));

    }
}
