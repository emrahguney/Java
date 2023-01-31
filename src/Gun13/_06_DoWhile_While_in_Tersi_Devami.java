package Gun13;

import java.util.Scanner;

public class _06_DoWhile_While_in_Tersi_Devami {
    public static void main(String[] args) {
        //Kullanici 0 degeri girene kadar, girdigi sayilarin toplamini bulunuz

        Scanner oku=new Scanner(System.in);
        int sayi;   //int sayi=oku.nextInt dersen
        int toplam=0;

        do {//dongu arasi sart basta olmadigindan en az 1 kez calisir,kontrol sonda
            //while da ilk sayiyi okutmazdi ama do da kontrol sonda oldugu icin ilk sayiyida okur

            System.out.print("sayi gir=");
            sayi= oku.nextInt();
            toplam=toplam+sayi;

        }while(sayi!=0);
            System.out.println("toplam = " + toplam);
    }
}
