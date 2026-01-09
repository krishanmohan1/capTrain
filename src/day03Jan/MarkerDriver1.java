package day03Jan;

public class MarkerDriver1 {
    static {        //-> it will work , it is not necesary to use main method to call.
        Marker.name="Blue";
        System.out.println(Marker.name);
        Marker.write();
        Marker.name="Blue";
        System.out.println(Marker.name);
    }
    public static void main(String[] args) {
//        Marker.name="Blue";
//        System.out.println(Marker.name);
//        Marker.write();
    }
}
