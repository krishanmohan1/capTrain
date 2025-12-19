/*
    Java is a High level programming languuage , which is easily readable , understandbale and instructable by programmer.
    Why Java is Plateform independent Language?
    - Becuase in java source code is converted into Byte Code which is easily executable in any platform which has JVM.
    - JVM stands for Java Virtual Machine, it is physically does not exist, it is used to convert byte code into binary code.
    - It consist of JIT and Interpreter
    - JRE it stands for Java Runtime Environment, it physically exists. It is used to Provide Environment to run java Program
    - JDK it stands for Java Development Kit , It physically exists . It Provide an environment to run as well as develop java program.
    - System.out.print("data"); after printing the data the cursor is shifted to next position in same line
    - System.out.println("Mohan"); after printing the data the cursor is shifted to next postion in new line


    Token
    -the smallest part of java program is known as Tokens.
    Types of Tokens
    -Keywords, Identifiers, Literals, Seperators, Operators
    Keywords
    - A word which are having predefine meaning is known as keywords.
    - It is also known as compiler aware Words.
    - Keywords are always should be in lowercase.
    - In java we have 50+ keywords
    - examples class, public , void, print, System
    Identifiers
    - The name given by the programmer is know as Identifier.
    Rules
    - We cannot use keyword as Identifier.
    - we cannot use space .
    - we can't start with numbers.
    - Special Charaters are not allowrd except underscore(_) and dollar($).
    Types of Identifiers
    -ClassName, VariableName, MethodName, PackageName.
    Literals
    - The value or data given the programmer is known as Literals.
    Types of Literals
    Number
    - Interger
    - Floating
    Character
    - It is used to represent a single data, it is enclosed inside single quote.
    - Length of characte literal is one .
    - We can use UpperCase, LowerCase character, Digits and all type of special Charaters.
    String
    - It is used to represent group of characters
    - It is enclosed inside double quotes ""
    - The length of String literal can be anything
    Boolean
    - Boolean uses only two value either True or False
    Seperators
    - It used to seperate JAVA Members
    Types  of Seperators
    - block {}
    - () -> eaution, methods,declaration, conditions
    - ; -> end of the statement
    - , -> Varibale
    - . Reference

    DataType
    - used to define sixe and type of data
    Primitive DataType
    -Inbuilt datatype
    - Fixed Size
    Integer
    - byte - 1 byte -> 8 bits
    - short -> 2 byte -> 16bits
    - int -> 4 byte -> 32 bits
    - long -> 8 byte -> 64 bits
    Float
    - Float -> 4 byte -> 32 bits
    - Double -> 8 byte -> 64 bits

    Character
    char -> 2 byte -> 16 bits
    Booleam  -> 1bit

    Non-Primitive
    - does not have fixed size
    - user defined
    - String
    - Array
    - ClassName

    Varibale
    Type of Variable
        Based On DateType
        - Primitive
        - Non-Primitive
        Based on Scope
        - Local
            - A variable declare inside local area is known as local varibale
            - we cannnot use local variables without initialisation
            - Local variable are not assign with default  values
            - we cannot create two local variable with same name
            - Local variable can be used only inside same local area
            Note : we can use global variable in local and global area

        - Global
            - static
                - A variable which is declare inside class area or global are prefix with static keyword is Known as static variable.
            - Non static
                - A variable which is declare inside class area or global area without static keyword is known as non-static variable.


        Operators
        - symboll we use to perform some operation
        Types of Operators
        - Unary Operator
            - which reuires one operand
            Types
                - new
                - Increment
                    - pre
                        Rules
                        - Increase the value by 1
                        - Update the incrementd value in  same variable
                        - If any operation is going on  we will use incremneted value
                    - post
                - Decrement
                    - pre
                    - post
                - Logical NOT
        - Binary Operator
            - which requires two operands
        Types
            - Arithmetic
            - Relational
            - Logical AND
            - Logical OR
            - components of assignment operator

        - ternary Operator
            - which requires three operand
            - Conditional Operator

            Differnce between primitive and non-primitive data type.
            Difference between local and global variable.
            Difference between compiler and interpretor.

            Answer 1.
                    primitive is predefined data type , it has fixed size , it id of 8 types(byte,short,int ,long,float,double,char,boolean)
                    non-primitive is Userdefined data type , its has not fixed size , (Array, String, UserDefined DataType Like Class)
            Answer 2.
                    local variable is defined in local area or method area , if cant be accessed outside of local scope, neither in global or other local, no two local variable can have same same
                    Global variable has to define in global space or class space , it no need to initialize it has default value , and it can be access or used entire the file even in loacl varibale .
            Answer 3.
                    compiler is the program that complies the code to machine underdtandable code , it compiles who code once , in case if hava it convert .java to bycode as .class, like javac is the compiler
                    Interpretor read and implement the code line by line to the machine , like in case of python .


            Difference between plateform dependent and plateform independent.
            How does object oriented of java helps in software development.
            Why Java is Considered Simple language Compared to C and C++.
            How Does Java Provide security at Run time.
            What makes java as robust language.
            How does Java achieve High Performance.
            What do you mean by Portabiliy in Java.
            Why does Java has Strong Industry Adoption and More Job Opportunity.

            Components of Assignment
            - + = ->  +=
            - -=
            - *=
            - /=
            - %=

            Relational Operator
                - comes under binary operator
                - return type is should be boolean
                - >(greater than),  <(less than ), <= ,  >= ,  == ,  !=

            Numberic and Char -> all relational operator
            Stringa and boolean only -> ==, !=


            Logical Operator
                - return type is booelan
                - Condition -> 2 Operator
                - Logical op it takes Condition
                - LOGICAL AND , OR, NOT






     */



public class Main {

    // class area or global area
//    static  int b = 34;

    public static void main(String[] args) {

//        System.out.print("10");
//        System.out.print("20");
//        System.out.println("30");
//        System.out.println("40");
//        System.out.println("50");
//        System.out.print("60");
//        System.out.print("70");
//        System.out.println("80");
//        System.out.println("90");
//        System.out.print("100");
//        System.out.println("110");
//        System.out.print("120");
//        System.out.print("_");

//        System.out.print("5");
//        System.out.print("25");
//        System.out.print("75");
//        System.out.println("85");
//        System.out.print("25");
//        System.out.print("45");
//        System.out.println("35");
//        System.out.print("15");
//        System.out.println("20");
//        System.out.print("5");
//        System.out.print("66");
//        System.out.print("67");
//        System.out.print("_");

        // write a java program to calculate area of square whose side is 4.2

//        float side =4.2f;
//        float areaSquare = side * side;
//        System.out.println(areaSquare);

        // write a java program to calculate area of circle whose radius is 5
        // write a java program to calculate area of reactangle length is 3.5 , breadth = 4

//        int radius = 5;
//        double areaCircle = 3.13 * radius * radius;
//        System.out.println(areaCircle);
//
//        float length = 3.5f;
//        int  breadth = 4;
//        double areaRect = length * breadth;
//        System.out.println(areaRect);
//
//        int num = 15;
//        System.out.println(num);
//        String collegName = "LPU";
//        System.out.println(collegName);
//        boolean bool = false;
//        System.out.println(bool);
//        float num1 = 13.5f;
//        System.out.println(num1);
//        String bool1 = " true ";
//        System.out.println(bool1);
//        char hash = '#';
//        System.out.println(hash);
//        String digits = "123";
//        System.out.println(digits);
//        String special = "@";
//        System.out.println(special);


        // write a jave program to swap two numbers using third variable
        // withour using third  variable

        int fist = 5;
        int sec = 10;

//        fist = fist + sec;
//        sec = fist - sec;
//        fist = fist - sec;
//        System.out.println(fist);
//        System.out.println(sec);

//        int temp = fist;
//        fist =  sec;
//        sec = temp;
//        System.out.println(fist);
//        System.out.println(sec);
//
//
//        int f = 6;
//        int s = 7;
//        f = f^s;
//        s = f^s;
//        f = f^s;
//        System.out.println(f);
//        System.out.println(s);

//        char Character = '3';
//        System.out.println(Character >= '0' && Character <= '9');
//        int ASCII1 = Character - '0';
//        System.out.println(ASCII1>=0 && ASCII1 <=9);


        int a = 5, b = 10, c= 15;

        int res = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
        System.out.println(res);














    }
}