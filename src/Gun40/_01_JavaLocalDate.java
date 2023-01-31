package Gun40;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        //LocalDate : Sadece gun ay yil bilgisini tutar

        LocalDate tarih=LocalDate.now();    //suandaki zamani verdi
        System.out.println(tarih);
        System.out.println(tarih.getYear());
        System.out.println(tarih.getMonth());
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.getDayOfWeek().getValue());
        System.out.println(tarih.getDayOfYear());

        //kendisindeki hazir formatlara bakalim
        System.out.println("ISO_DATE(ULUSLARARASI FORMAT)="+tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT FORMAT " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("LONG FORMAT " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("MEDIUM FORMAT " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("FULL FORMAT " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("*******************************************************************************");
        //LOCALDE ALDIGIM TARIHI ISTEDIGIM ULKENIN FORMATINA GORE, DILINE GORE NASIL GOSTERIRIM?
        //ORNEGIN LOCALDEKI SAATI ALMANYA YA GORE NASIL GOSTERIRIZ

        System.out.println("FULL ALMANYA GOSTERIMI = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        System.out.println("FULL KORE GOSTERIMI = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.KOREAN)));

        Locale[] kullanilabilirLokaller= Locale.getAvailableLocales();

        for (Locale L:kullanilabilirLokaller){
            System.out.println("Dil = "+L.getDisplayLanguage());
            System.out.println("Ulke = "+L.getDisplayCountry());
            System.out.println("Country = "+L.getCountry());
            System.out.println("Language="+L.getLanguage());
            System.out.println("**********************************");
        }
        System.out.println("--------------------------------------------------------------------------");
        for (Locale L:kullanilabilirLokaller){
            if (L.getDisplayCountry().toLowerCase().contains("chi")){
                System.out.println("***************CHI BASLANGICLI ULKELER**************");
                System.out.println("Dil = "+L.getDisplayLanguage());
            System.out.println("Ulke = "+L.getDisplayCountry());
            System.out.println("Country = "+L.getCountry());
            System.out.println("Language="+L.getLanguage());
            System.out.println("**********************************");}
        }
        System.out.println("--------------------------------------------------------------------------");

        Locale lokalCince=new Locale("zh","CN");
        System.out.println("Full cince gosterimi=\n"+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));


        System.out.println("*********ISTEDIGIM FORMATTA GOSTERIM*****************");

        System.out.println("tarih0 = "+tarih);
        DateTimeFormatter ozelformat1=DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println("tarih1 = "+tarih.format(ozelformat1));

        DateTimeFormatter ozelformat2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih2 = "+tarih.format(ozelformat2));

        DateTimeFormatter ozelformat3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih3 = "+tarih.format(ozelformat3));

        System.out.println("UK OZEL FORMAT VE LOCAL tarih3 EEEE dd.MM.yyyy= "+tarih.format(ozelformat3.withLocale(Locale.UK)));

        DateTimeFormatter oz5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy = " + tarih.format(oz5));


        System.out.println("\n***************");
        //Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5

        LocalDate tarih1= LocalDate.of(2000,5,20);
        LocalDate tarih2= LocalDate.of(1999, Month.MARCH, 12);
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelformat1));

        ArrayList<LocalDate> t=new ArrayList<>();
        t.add(tarih);
        System.out.println("qwe="+t);
    }
}
