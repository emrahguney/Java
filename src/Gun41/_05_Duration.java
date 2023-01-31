package Gun41;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _05_Duration {
    public static void main(String[] args) {
        //Duration: hem LocalTime hemde LocalDateTime arasindaki farki verir

        //LocalTime
        LocalTime dersbaslangic=LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(21,50,50);

        Duration dersSuresi=Duration.between(dersbaslangic,dersBitis);
        System.out.println(dersSuresi);//PT2H50M50S
        System.out.println("dersSuresi.toHours() = " + dersSuresi.toHours());
        System.out.println("dersSuresi.toMinutes() = " + dersSuresi.toMinutes());
        System.out.println("dersSuresi.toMillis() = " + dersSuresi.toMillis());

        //LocalDateTime *** 2 Tarih-saat arasindaki fark***
        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();//bugun

        Duration farkzaman=Duration.between(from,to);
        System.out.println("farkzaman = " + farkzaman);
        System.out.println("farkzaman.toDays() = " + farkzaman.toDays());
        System.out.println("farkzaman.toHours() = " + farkzaman.toHours());
        System.out.println("farkzaman.toMinutes() = " + farkzaman.toMinutes());
    }
}
