package Gun29.Soru.DigerCozum;

public class hesap {

    private int yatan;
    private int cekilen;
    private int bakiye;

    public hesap(int bakiye) {

        this.bakiye = bakiye;
    }

    public int getYatan() {
        return yatan;
    }

    public void setYatan(int yatan) {
        this.yatan = yatan;
    }

    public int getCekilen() {
        return cekilen;
    }

    public void setCekilen(int cekilen) {
        this.cekilen = cekilen;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void yatan(int yatanpara){
        yatan+=yatanpara;

        if (yatanpara<0){
            System.out.println("Hatali para yatirma islemi");
        }
        else bakiye+=yatanpara;
        System.out.println("paraniz yatirilmistir guncel bakiyeniz="+bakiye);


    }

    public void cekilenpara(int cek){
        cekilen+=cek;

        if (cek>bakiye){
            System.out.println("yetersiz bakiye. Max cekilebilen tutar="+bakiye);
        }else
            bakiye-=cek;
        System.out.println("hesabinizdan "+cek+" TL cekilmistir"+ " guncel bakiyeniz="+bakiye);

    }

    public void bakiyeniz(){
        System.out.println("guncel bakiyeniz="+bakiye);
    }

    public void islemsorgu(){
        System.out.println("hesabinizdan toplam cekilen tutar = "+cekilen);
        System.out.println("hesabiniza yatirilan toplam tutar = "+yatan);

    }

}
