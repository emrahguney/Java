package Gun39.Soru;

public class Main {
    public static void main(String[] args) {
/*1- id(int) ,isim(String), vahsi(boolean), dogumTarihi (String) fieldları olan ve
   void yiyecegi, void yemekMiktari, void gunlukUykuSuresi ve void sesi isimlerinde abstract metodları,
   toString şeklinde normal metodu ve get ve set leri olan Hayvan isminde
   bir abstract class yazınız.

2- Kedi, kartal şeklinde 2 tane extend alacak normal class yazınız.

3- Main de 1 er nesne oluşturup, değerlerini atayıp, yazdırınız.

4- Benzersiz ID leri olmalı, buna göre güvenli dizayn yapınız.*/


        System.out.println();






        Kedi cat=new Kedi("BORU",false,"2020");
        cat.yiyecegi();cat.yemekMiktari();cat.gunlukUykuSuresi();cat.sesi();
        System.out.println(cat);

        System.out.println("---------------------------------------------");

        Kartal eagle=new Kartal("BURKUT",true,"2015");
        eagle.yiyecegi();eagle.yemekMiktari();eagle.gunlukUykuSuresi();eagle.sesi();
        System.out.println(eagle);
        /*      kedi ve kartalın ekstra fieldı olsaydı o classların her bir tostringini override etmemiz lazim           */

    }
}
