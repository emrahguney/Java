package Gun41;

import javax.lang.model.SourceVersion;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class _03_JavaLocalDateTime {
    public static void main(String[] args) {

        //LocalDateTime hem tarih hemde saat bilgisini tutar
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getDayOfYear() = " + dt.getDayOfYear());
        System.out.println("dt.getDayOfYear() = " + dt.getDayOfMonth());
        System.out.println("dt.getDayOfYear() = " + dt.getDayOfWeek());
        System.out.println("dt.getDayOfWeek().getValue() = " + dt.getDayOfWeek().getValue());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());
        System.out.println("dt.getNano() = " + dt.getNano());

        System.out.println("ISO DATE = " + dt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("SHORT = " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        
        //OZEL FORMATTA ISTEDIGIMIZ GIBI YAZDIRMA
        DateTimeFormatter F=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("dt.format(F) = " + dt.format(F));
    }
}
