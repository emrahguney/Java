package Gun20;

import com.sun.xml.internal.fastinfoset.sax.SAXDocumentParser;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int s1=4;
        int s2=12;
        int s3=34;
        int A=4;
        int B=7;
        int sonuc1=toplamBul(s1,s2);
        int sonuc2=toplamBul(s1,s2,s3);
       int SONUC= toplamBul(s1,s2)+toplamBul(s1,s2,s3);


        String ad="ismet";
        String soyad="Temur";
        String sonuc3=toplamBul(ad,soyad);

        System.out.println("sonuc3 = " + sonuc3);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc1 = " + sonuc1);


    }

    public static int toplamBul(int s1,int s2){
        return s1+s2;
    }

    public static int toplamBul(int s1,int s2,int s3){
        return s1+s2+s3;
    }

    public static String toplamBul(String ad, String soyad){
        return ad+" "+soyad;
    }


  /* public static int toplamBul(int A,int B){return A*B;}*/    //BU SOLDAKI SEY ONEMLI. AYNI PARAMETRE VE PARAMETRE SAYISIDA AYNI ISE NE ISLEM YAP KABUL ETMEZ

}
/**METODLARDA AYNI ISIMLERI KULLANABILIRIZ SADECE PARAMETRELERI FARKLI OLMALIDIR**/