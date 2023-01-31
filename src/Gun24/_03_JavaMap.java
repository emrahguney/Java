package Gun24;

import javax.lang.model.SourceVersion;
import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        //Bir kartvizit uygulamasini 2 kisi icin yapiniz

        HashMap<String,String> uKartVizit=new HashMap<>();
        uKartVizit.put("isim","Ugur Yilmaz");
        uKartVizit.put("email","ugur@gmail.com");
        uKartVizit.put("adres","Cekmekoy/Istanbul");
        uKartVizit.put("telefon","05553336699");

        System.out.println("uKartVizit.get(isim) = " + uKartVizit.get("isim"));
        System.out.println("uKartVizit.get(telefon) = " + uKartVizit.get("telefon"));

        HashMap<String,String> aKartVizit=new HashMap<>();
        aKartVizit.put("isim","Ayse Bayrak");
        aKartVizit.put("email","ayse@gmail.com");
        aKartVizit.put("adres","Sisli/Istanbul");
        aKartVizit.put("telefon","05336669911");

        HashMap<String,HashMap<String,String>> kartvizitler=new HashMap<>();

        kartvizitler.put("ugur",uKartVizit);
        kartvizitler.put("ayse",aKartVizit);

        System.out.println("kartvizitler.get(\"ugur\") = " + kartvizitler.get("ugur"));
        System.out.println("kartvizitler.get(\"ayse\") = " + kartvizitler.get("ayse"));

        System.out.println("Aysenin adresi = " + kartvizitler.get("ayse").get("adres"));


        //sadece emailler
        for (Map.Entry<String,HashMap<String,String>> kv:kartvizitler.entrySet()) {

            System.out.println("kv.getValue().get(\"email\") = " + kv.getValue().get("email"));

        }


    }
}
