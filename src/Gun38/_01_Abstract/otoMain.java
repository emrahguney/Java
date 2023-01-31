package Gun38._01_Abstract;

public class otoMain {
    public static void main(String[] args) {

     //REFERANS ||| NESNE TIPI
        Ford fr = new Ford("mustang", 1995, 4);
        Volvo volvo = new Volvo("s40", 2001, 5);
        System.out.println(fr);
        System.out.println(volvo);
       // IBinekOto ib = new IBinekOto(); //Interface lerden NESNE olusturulamaz sadece REFERANS tip olabilirler

     /**   BinekOto bo=new BinekOto("mustang",1995,4)  // abstract Class lardan da NESNE olusturulamaz, sadece REFERANS tip olabilirler*/

     BinekOto bo=new Ford("mustang", 1996, 5); //ama abstract classlari boyle cagirabilirsin(sadece REFERANS tip olabilirler)
        bo.hizlanmasuresi();//hizlanmasuresini secerken soldaki m isareti abstract isareti olarak gozukuyor

bo.hiz();
        System.out.println(bo.hiz());
        BinekOto a=new Ford("w",2,22);
        a.hiz();
        System.out.println(a.hiz());
        a.hizlanmasuresi();
        System.out.println(a.hizlanmasuresi());
    }
}
