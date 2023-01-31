package Gun41;

import java.time.LocalDate;

public class _04_Period {
    public static void main(String[] args) {
        //Period= 2 tarih arasindaki farki gosterir. LocalDate ler icin kullanilir

        LocalDate dogumtarihi=LocalDate.of(1993,9,28);
        LocalDate bugun=LocalDate.now();

        java.time.Period fark= java.time.Period.between(dogumtarihi,bugun);
        System.out.println("fark = " + fark);//P  29Y(yil) 3M(ay)  15D(gun)

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+" yasindasin");

        java.time.Period period3Gun= java.time.Period.ofDays(3);
        java.time.Period period3Ay= java.time.Period.ofMonths(3);

        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate ucGunSonra=bugun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucAySonra=bugun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);
        
        //Kursun bitis tarihini bulunuz6 ay-31 ekim 2022
        
        LocalDate kursbaslangic=LocalDate.of(2022,10,31);
        java.time.Period kurssuresi= java.time.Period.ofMonths(6);
        LocalDate kursbitis=kursbaslangic.plus(kurssuresi);

        System.out.println("kursbitis = " + kursbitis);
        System.out.println("kursbitis.getDayOfWeek() = " + kursbitis.getDayOfWeek());

        //kursun bitmesine ne kadar sure kaldi
        java.time.Period neKadarSureKaldi= java.time.Period.between(bugun,kursbitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        //kurs ne kadar suredir devam ediyor
        java.time.Period suAnaKadarDevamSuresi= java.time.Period.between(kursbaslangic,bugun);
        System.out.println("suAnaKadarDevamSuresi = " + suAnaKadarDevamSuresi);


    }
}
