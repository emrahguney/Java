package Gun29.ClassErisimleri1;
/**Access Modifiers (Eirşim belirteçleri, izinleri)
 public, private, protected, default(hiç bir şey yazılmayan durum, friendly)

 1-Classın içinden erişim(private)
 2-paketin içinden erişim(default,protected?,public)
 3-projenin içinden erişim(public,)

 public : projenin her tarafanından erişim,yani diğer tüm paketler erişebilir.
 class, metod, field lara yazilabiliyor

 default: (friendly) : bir belirteç yazılmazsa : Sadece bulundugu pakettekiler erişebilir.
 class, metod, field lara yazilabiliyor

 private: sadece classın içinden erişim oldugu icin:
 metod, field lara yazilabiliyor

 protected : default aynı çalışır, bir özelliği var, 3 konu sonra extra durumu için
 dönülecek buraya.*/

public class mainKontrol {
    public static void main(String[] args) {
        PublicErisim pe=new PublicErisim();
        DefaultErisim de=new DefaultErisim();

    }
}
