package assignment21thDec;

public class logic5 {
    public static void main(String[] args) {
        int cpuUsages = 45;
        int memoryUsages = 56;

        String serverStatus = (cpuUsages > 85 || memoryUsages > 90) ? "this server is unstable " : "This server is not under maintaince";
        System.out.println(serverStatus);
    }
}
