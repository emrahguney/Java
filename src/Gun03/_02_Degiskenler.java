package Gun03;

// ctrl+alt+l ekranin goruntusunu duzeltir
public class _02_Degiskenler {
    public static void main(String[] args) {
        int sayi = 5;

        int kisaKenar = 5;
        int uzunKenar = 7;

        int cevre;

        cevre = kisaKenar + kisaKenar + uzunKenar + uzunKenar;
        System.out.println("cevre = " + cevre); //  soutv ile otomatik yazdi
        System.out.println("cevresi=" + cevre); // sout ile elle yazdik


        int Alan;
        Alan = kisaKenar * uzunKenar;
        System.out.println("Alan = " + Alan);

        int KenarFark;
        KenarFark = uzunKenar - kisaKenar;
        System.out.println("KenarFark = " + KenarFark);


    }
}
