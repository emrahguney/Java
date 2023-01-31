package Gun29.Protected.BIR;

public class HastaneAnkara {
    public static void main(String[] args) {
        Doctor dok1=new Doctor();
        dok1.adi="ismet";//protected
        dok1.bolumu="Dahiliye";//default
        dok1.hastaneAd="Ankara Hastanesi";//public
        //dok1.SicilNo  private
        dok1.setSicilNo("243");//get set metodlari ile private i cagirip deger atayabilirsin


        Doctor dok2=new Doctor("Mehmet");

    }
}
