package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program calismaya basladi");

        try { //dene, hatanin basladigi yerin ustune konur


            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);
        }//hata oldugu zaman programi kirma
        catch (Exception ex)
                //ex isimli degiskende olusan hatalarin bilgisini ataniyor
        {//hata oldugunda yapilmasi istenenler buraya yaziliyor
            System.out.println("hata olustu lutfen tekrar deneyiniz");
            System.out.println("Tum hata mesaji="+ex);
            System.out.println("Hatanin aciklamasi="+ex.getMessage());

            //kendine hata mesajini kendine mail atabilirsin
            //log tutma: program nasil calisiyor, hata loglarini DB(database) yazabilirsin

        }
        System.out.println("program bitti");





    }
}
