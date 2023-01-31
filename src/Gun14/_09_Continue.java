package Gun14;

import java.util.Scanner;

public class _09_Continue {
    public static void main(String[] args) {
        //Girilen bir stringin harflerini teker teker ekrana alt alta olacak sekilde yazdiriniz, bosluklari yazmasin
        Scanner oku=new Scanner(System.in);
        System.out.print("cumle gir = " );
        String cumle= oku.nextLine();


        for (int i=0;i<cumle.length();i++)
        {
            if(cumle.charAt(i)==' ')    //siradaki karakter bosluk ise pas gec
                continue;
            System.out.println(cumle.charAt(i));
        }



    }
}
/**
Continue nasıl kullanılır?
Break ve Continue döngülerde çok sık kullandığımız iki keyword olup
döngü akışını kontrol ederek işimizi kolaylaştırmaktadırlar.
 Break ve Continue'nın kullanım mantığı çok basittir.
 Döngü çalışması sırasında Continue ile karşılaşıldığı zaman
 continue'nin altında kalan kısım atlanır ve tekrar döngünün başına dönülür.
 */