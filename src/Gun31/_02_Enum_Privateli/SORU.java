package Gun31._02_Enum_Privateli;

public class SORU {
    public static void main(String[] args) {
        USER user1=new USER("emrah", userROLU.MUDUR, userSTATU.AKTIF);
        System.out.println("user1 = " + user1);

        USER user2=new USER("erdem", userROLU.PERSONEL, userSTATU.AKTIF);
        System.out.println("user2 = " + user2);

        USER user3=new USER("ali", userROLU.ADMIN, userSTATU.AKTIF);
        System.out.println("user3 = " + user3);

        USER.userSILME(user1);
        USER.userSILME(user2);
        USER.userSILME(user3);


    }
}
