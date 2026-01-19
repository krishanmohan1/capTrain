package day12thJanLibarary;
class Book{
    String bname;
    Book(String bname){
        this.bname=bname;
    }

    @Override
    public boolean equals(Object obj){
        Book b = (Book) obj;
        return this.bname.equals(b.bname);
    }
}

public class Equals {
    public static void main(String[] args) {

    }
}
