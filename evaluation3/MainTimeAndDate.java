package evaluation3;
import java.util.Scanner;
public class MainTimeAndDate {
    public static void main(String[] args) {
        DateAndTime dat= new DateAndTime();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  your Date of Birth: ");
        String dob = sc.next();
         dat.main(dob);


    }

}
