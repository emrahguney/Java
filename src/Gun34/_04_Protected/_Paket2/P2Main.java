package Gun34._04_Protected._Paket2;

import Gun34._04_Protected._Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p2h=new P1Hayvan();
        p2h.ad="kopek";

        //p1h.yas default diger paketten erisilemez
        //p1h.cinsi; protected diger paketten direk erisilemedi

        P2Kedi p2k=new P2Kedi("qw","scottish");
        p2k.ad="tekir";

    }
}
