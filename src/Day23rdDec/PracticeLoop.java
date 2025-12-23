package Day23rdDec;

/*

    mini iteration  is 1 , even the condition becomes false , it will execute once

            // initialization
        int i = 1;
        do{
            System.out.println(i);
            // updation
            i++;
        }while(i<=3);

        Iteration :
        i = 1,2,3;

        I-1:
            -> s.o.pln(i);->i++(i=1+1)->2<3->true
        I-2:
            -> s.o.pln(i);->i++(i=2+1)->3<=3->true
        I-3:
            -> s.o.pln(i);->i++(3+1)->4<=3->false


 */

public class PracticeLoop {
    public static void main(String[] args) {
        // initialization
        int i = 1;
        do{
            System.out.println(i);
            // updation
            i++;
        }while(i<=3);


        int j = 6;
        do {
            System.out.println(i);
            i++;
        }while (i<=5);

    }
}
