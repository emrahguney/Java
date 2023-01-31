package Gun32._02_Encapsulation;

public class Araba {

    private String renk;
    private int model;
    private int motorhacmi;
    private int KapiSayisi;




  /*  void setRenk(String renk){

        this.renk=renk;
    }

    String getRenk(){
        return this.renk;

    }

    void setmodel(String model){
        this.model=model;
    }
    String getmodel(){
        return this.model;
    }

    void setMotorhacmi(int motorhacmi){

        this.motorhacmi=motorhacmi;
    }

    int getMotorhacmi(){
        return this.motorhacmi;
    }

    void setKapiSayisi(int kapiSayisi){
        this.KapiSayisi=kapiSayisi;
    }
    int getKapiSayisi(){
        return this.KapiSayisi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motorhacmi=" + motorhacmi +
                ", KapiSayisi=" + KapiSayisi +
                '}';
    }

   */

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (model<2023){
        this.model = model;}
    else System.out.println("Hatali Model ");
    }

    public int getMotorhacmi() {

        return motorhacmi;
    }

    public void setMotorhacmi(int motorhacmi) {
       if (motorhacmi<1500) System.out.println("hata" );
       else this.motorhacmi = motorhacmi;
    }

    public int getKapiSayisi() {
        return KapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi>1 &&kapiSayisi<7)
        KapiSayisi = kapiSayisi;
        else System.out.println("Hatali kapi sayisi");
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motorhacmi=" + motorhacmi +
                ", KapiSayisi=" + KapiSayisi +
                '}';
    }

    public Araba(String renk, int model, int motorhacmi, int kapiSayisi) {
       setRenk(renk);
       setModel(model);
       setMotorhacmi(motorhacmi);
       setKapiSayisi(kapiSayisi);

/**  METODLARI KULLANSIN DIYE set OLARAK ATADIK ASAGIDAKI this. DIREK OLARAK ATIYOR ASAGIDAKI
        METODLARI KULLANMIYOLAR, KULLANIMDAN GECIRMIYOLAR ONUN ICIN METODLARDAN KONTROL EDILSIN DIYE
        METODLARA GONDERIYORUZ YOKSA this OLARAK YAZSAYDIK DIREK KONTROL EDILMEDEN ATANIRDI PRIVATE IN
 DEGERI KALMAZDI*/

       // this.renk = renk;
      //  this.model = model;
       // this.motorhacmi = motorhacmi;
       // this.KapiSayisi = kapiSayisi;
    }
    public Araba(){

    }
}
