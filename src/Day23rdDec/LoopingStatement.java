package Day23rdDec;

/*

    Initialization
    Condition
    Updation

    do Syntax:
    do{
        // statement
        -> udation
    }
    while(condition);   -> until the condition is false it will not allow to move

    while syntax:   -> entry check loop
    while(condition)
    {
        // statement
        //  updation
    }

    for loop
    syntax:

    for(initialization;condition;updation){ -> all are optional , but semicolon is mandatory.
        // statement
    }


 */

public class LoopingStatement {
    public static void main(String[] args) {

        // infinite Loop using do while

        boolean isFlag = true;

//        do{
//            System.out.println("heyyy");
//            System.exit(0);    // -> it will give error , unreachable Statements, give it always in last
//        }while (true);


        do{
            System.out.println("Hii..");
            isFlag = false;
        }while (isFlag);

        do{
            System.out.println("Hello");
            // inbuilt function
            System.exit(2);     // -> exit has int return type , give any int
        }while (true);

    }
}
