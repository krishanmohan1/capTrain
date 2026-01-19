package day9thJan.notes;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Polymorphism:

    one object has may behaviour

 */
public class txt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        br.close();
        System.out.println(name);
    }
}
