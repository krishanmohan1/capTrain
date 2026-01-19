package UpCasting;

class Google{
    private String username;
    private String password;

    public  Google(String username, String password){
        this.username = username;
        this.password=password;
    }

    public boolean login(String Pusername, String Ppassword){
        if(Pusername.equals(username) && Ppassword.equals(password)) return true;
        else return false;
    }

}
class Gmail extends Google{

    public Gmail(String username, String password) {
        super(username, password);
    }
}

class GoogleDrive extends Google{

    public GoogleDrive(String username, String password) {
        super(username, password);
    }
}

class Youtube extends Google{
    public Youtube(String username, String password) {
        super(username, password);
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Gmail Signup");
        Google gamil = new Gmail("mohan","@1266");
        if(gamil.login("mohan","@1266")){
            System.out.println("You are logged in Gmail");
        }

        System.out.println("Google Drive Signup");
        Google GoogleDrive = new Gmail("mohan","@1266");
        if(GoogleDrive.login("mohan","@1266")){
            System.out.println("You are logged in Gmail");
        }


        System.out.println("Youtube Signup");
        Google youtube = new Gmail("mohan","@1266");
        if(youtube.login("mohan","@1266")){
            System.out.println("You are logged in Gmail");
        }
    }
}




