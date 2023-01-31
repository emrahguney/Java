package Gun32._01_Encapsulation;

public class Kisi {
 private   String ad;
   private String soyad;
  private  int yas;

    void yasAta(int yas){

        if(yas>0 && yas<150)
            this.yas=yas;
        else System.out.println("hatali yas");

    }

    int yasver(){
        return this.yas;
    }
/**get ilk veri, set üstüne yazması
 */
    void setSoyad(String soyad){

        if (soyad.length()<25){
            this.soyad=soyad;
        }else System.out.println("Hatali soyad");

    }

    String getSoyad(){
        return this.soyad;
    }

    void setAd(String ad){

        if(ad.length()>0 &&ad.length()<15){
            this.ad=ad;
        }else System.out.println("Hatali isim");

    }

    String getAd(){
        return this.ad;
    }

    @Override
    public String toString() {

        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';

    }
}
