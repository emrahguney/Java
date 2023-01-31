package Gun29.Soru;

public class Hesap {
    private int yatan=0;
    private int cekilen=0;
    private int bakiye=0;


    public void parayatirma(int yatirma){

        yatan+=yatirma;
        bakiye+=yatirma;
        System.out.println("hesabiniza "+yatirma+" TL yatirilmistir. Su anki bakiyeniz:"+bakiye);

    }

    public void paracekme(int cekme){
        if (cekme>bakiye){
            System.out.println("Hesabinizda "+cekme+"TL miktari yoktur suanki bakiyeniz: "+bakiye);
        }else cekilen+=cekme;
        bakiye-=cekme;
        System.out.println("Hesabinizdan "+cekme+" TL cekilmistir.Su anki bakiyeniz:"+bakiye);

    }

    public void islemsorgulama(){

        System.out.println("Toplam yatirilan para="+yatan);
        System.out.println("Toplam cekilen para="+cekilen);
        System.out.println("Su anki bakiyeniz="+bakiye);
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
