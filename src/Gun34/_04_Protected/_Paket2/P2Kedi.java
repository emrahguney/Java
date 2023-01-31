package Gun34._04_Protected._Paket2;

import Gun34._04_Protected._Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {


    public P2Kedi(String ad, String cinsi) {
        this.cinsi=cinsi;//protectedin defaulttan ayrilan kismi;extend edildiginden diger paketlerden de erisilebilir
                        //protected lara extra olarak extend yoluyla diger paketlerden erisilebilir
        this.ad=ad;

    }


}
