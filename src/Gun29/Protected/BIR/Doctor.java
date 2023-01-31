package Gun29.Protected.BIR;

public class Doctor {

    protected String adi;//default ile ayni
    String bolumu;  // default
    private String SicilNo; //private
    public String hastaneAd;    //public

    Doctor(){//default constructor
         }
    public Doctor(String adi){
        this.adi=adi;
    }

    public String getSicilNo() {
        return SicilNo;
    }

    public void setSicilNo(String sicilNo) {
        SicilNo = sicilNo;
    }
}
