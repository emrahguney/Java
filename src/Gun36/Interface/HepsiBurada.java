package Gun36.Interface;

public class HepsiBurada implements IMagaza{
//IMPLEMENT E BASKA PACKAGE DANDA ULASILABILIYOR
    @Override
    public void bilgileriAl() {
        System.out.println("asdwe");
    }

    @Override
    public void krediSkorunuKontrolEt() {
        System.out.println("okey");
    }

    @Override
    public void krediSecenekleriniGoster() {
        System.out.println("gosterildi");
    }

    @Override
    public void belgeleriImzalat() {
        System.out.println("imzalandi");
    }

    @Override
    public void krediyiKullandir() {
        System.out.println("kullandirildi");
    }

    @Override
    public int KrediSkorunuGoster() {
        return 2+4;
    }

    @Override
    public void credit() {//Interface de defaultlu yazilim
        IMagaza.super.credit();
    }




}
