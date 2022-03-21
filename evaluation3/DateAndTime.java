package evaluation3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateAndTime {

    public  void main(String dob) {
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd/MM/yyy");
        try{
            LocalDate ld =LocalDate.parse(dob,dtf);
            LocalDate ld1 = LocalDate.now();

            Long year = ChronoUnit.YEARS.between(ld1,ld);
            System.out.println("you are"+year+" years old");
            if(ld.isAfter(ld1)){
                System.out.println("Date of birth should not be in future");
            }
            }
        catch(Exception e){
            System.out.println("please pass the date in the proper format");
        }
    }









}
