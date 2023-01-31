package Gun17;

public class _04_CharVeSayiVe_ASKIItablosu {
    public static void main(String[] args) {
//harf ve rakam eslestirme tablosuna ascii tablosu denir
        int sayi=65;

        System.out.println("sayi = " + sayi);

        char harf=(char)sayi;
        System.out.println("harf = " + harf);


        sayi=97;
        harf=(char) sayi;

        System.out.println("harf = " + harf);

        for (int i = 0; i <=255 ; i++) {//ASKII TABLOSU YAZDIRMA
                harf=(char)i;
            System.out.println(i+".harf = " + harf);
        }

    }
}
