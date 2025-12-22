package assignment21thDec;

public class logic2 {
    public static void main(String[] args) {

        int attendance = 55;
        boolean medicalCertificateSubmit = false ;
        String fees = "dur";

        System.out.println(
                ((attendance >= 75 || medicalCertificateSubmit == true) && fees == "paid") ? "Allowed for Exam " : "Not Allowed for Exam"
        );

    }
}
