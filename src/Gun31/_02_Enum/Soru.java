package Gun31._02_Enum;

import java.util.ArrayList;

// Bir User yetkilendirme modülü yapılması isteniyor.
// USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
// USER STATUSU : AKTIF, PASIF
// Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
// Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
// kullanıcısı tanımlayınız.
// UserSilme isimli fonksiyona bu userları gönderiniz.
// ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim
public class Soru {


    public static void main(String[] args) {

/* User user1=new User();
        user1.username="EMRAH";
        user1.rolu=userRolu.MUDUR;
        user1.statu=UserStatusu.AKTIF;
   User user2=new User();
        user2.username="ERDEM";
        user2.rolu=userRolu.AMELE;
        user2.statu=UserStatusu.PASIF;
  User admin=new User();
        admin.username="ALI";
        admin.rolu=userRolu.ADMIN;
        admin.statu=UserStatusu.AKTIF;

        System.out.println("admin = " + admin);
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);*/

        //2.YOL
        User user1=new User("EMRAH",UserStatusu.AKTIF,userRolu.MUDUR);
        User user2=new User("ERDEM",UserStatusu.AKTIF,userRolu.AMELE);
        User user3=new User("ALI",UserStatusu.AKTIF,userRolu.ADMIN);
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
        System.out.println("user3 = " + user3);

        userSil(user1);
        userSil(user2);
        userSil(user3);

        ArrayList<User> userlar=new ArrayList<>();

        userlar.add(user1);userlar.add(user2);userlar.add(user3);


    }


    public static void userSil(User wqe){
        if(wqe.rolu==userRolu.ADMIN){
            System.out.println(wqe.username+" ADMIN SILINEMEZ" );
        }

    }
}
