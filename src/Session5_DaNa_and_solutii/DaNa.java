package Session5_DaNa_and_solutii;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DaNa {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDateTime date_time = LocalDateTime.now();
        LocalTime time = LocalTime.now();
        LocalDate startConcediuDaNa = LocalDate.parse("2024-09-09");
        LocalDate endConcediuDaNa = LocalDate.parse("2024-09-20");

        System.out.println("NOW date and Time = " + date_time);
        System.out.println("Now Date = " + date);
        System.out.println("Time Now = " + time);
        int beforeConcediu = date.compareTo(startConcediuDaNa);
        int afterConcediu = date.compareTo(endConcediuDaNa);

        if (beforeConcediu < 0 || afterConcediu > 0) {

            System.out.println("DaNa nu e in Concediu :(((((");

        } else {

            System.out.println("Yeey, DaNa e in concediu!!!");

        }

    }
}
