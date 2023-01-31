package Gun31._02_Enum;

import java.util.ArrayList;

public class User {

    String username;
    UserStatusu statu;
    userRolu rolu;


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", statu=" + statu +
                ", rolu=" + rolu +
                '}';
    }

    public User() {
    }

    public User(String username,UserStatusu statu, userRolu rolu) {
        this.username = username;
        this.statu = statu;
        this.rolu = rolu;
    }

    static void userDeleted(ArrayList<User>users,User x ){



    }



}
