package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class _01_JavaLocalTime {
    public static void main(String[] args) {
        //LocalTime: Tarih bilgisi icermez sadece saat,dakika,saniye,nanosaniye icerir

        LocalTime saat=LocalTime.now();

        System.out.println("saat = " + saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());


       /* ArrayList<LocalTime> l=new ArrayList<>();
        l.add(saat);
        System.out.println("l = " + l);*/

        //kendimize ozel format

        DateTimeFormatter of1=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("saat.format(of1) = " + saat.format(of1));

        DateTimeFormatter of2=DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("saat.format(of2) = " + saat.format(of2));

        DateTimeFormatter of3=DateTimeFormatter.ofPattern("k:mm");
        System.out.println("saat.format(of3) = " + saat.format(of3));

        System.out.println("****************************************************");

        LocalTime saat1=LocalTime.of(7,34,45);
        System.out.println("saat1 k:mm = " + saat1.format(of3));
        System.out.println("***********************************************");

        ArrayList<DateTimeFormatter> l=new ArrayList<>();
        l.add(of1);l.add(of2);l.add(of3);

    }
}
