package Gun41;

import Gun39.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class _02_JavaLocalTime {
    public static void main(String[] args) throws InterruptedException {
        //canli digital saat yapiniz
        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk:mm:ss");

        while(true){
            LocalTime saat = LocalTime.of(21,33,20);
            System.out.print("\r"+saat.format(f));
           MyFunc.bekle(1);
            //LocalTime q= saat.minusSeconds(1);

        }

// TODO : Alınan saati geriye doğru saniye saniye saydırınız.


        }
}