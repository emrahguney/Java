package Gun35._01_Final.ClassFinal;

public class ArabaMain {
    public static void main(String[] args) {

        Tasitlar t1=new Tasitlar();
        t1.model="opel";

        Tasitlar t2=new Tasitlar();
        t2.model="volvo";
        //kullanim kisminda bir sinirlama yok tekrar t2.model="ads" yapip deger atayabiliyorsun

        //class final olursa eger mainde birden fazla cagirilabiliyor
        //  fakat baska class a extend edilemez


        //Final; degiskenlerin basinda oldugunda degeri sonradan degistirilemez
        //      metodlarin basinda oldugunda OVERRIDE edilemezler
        //      class larin basinda oldugunda EXTENDS edilemezler


    }
}
