package Gun31._02_Enum_Privateli;

import java.util.ArrayList;

public class USER {
   private String username;
   private userROLU rolu;
    private userSTATU statusu;


    public USER(String username, userROLU rolu, userSTATU statusu) {
        this.username = username;
        this.rolu = rolu;
        this.statusu = statusu;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public userROLU getRolu() {
        return rolu;
    }

    public void setRolu(userROLU rolu) {
        this.rolu = rolu;
    }

    public userSTATU getStatusu() {
        return statusu;
    }

    public void setStatusu(userSTATU statusu) {
        this.statusu = statusu;
    }

    @Override
    public String toString() {
        return
                "{username='" + username + '\'' +
                ", rolu=" + rolu +
                ", statusu=" + statusu +
                '}';
    }

     static void userSILME(USER user){

         ArrayList<USER> USERS=new ArrayList<>();
         USERS.add(user);

         for (USER a:USERS){
        if (user.rolu== userROLU.ADMIN){
            System.out.println("ADMINLER SILINEMEZ");

        }

        else {
            System.out.println("BASARIYLA SILINDI");
            }
         }
    }


}
