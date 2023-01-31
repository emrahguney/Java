package Gun26._02_Ornek_ConstructorlivePrivateliCozum;

public class ORNEK {
    public static void main(String[] args) {
        Person p1=new Person("qqq","eee",29);
        Person p2=new Person("www","ccc",44);
        System.out.println(p1);
        System.out.println(p2);
        p1.getBirthYear();
        p2.getBirthYear();

        p1.getInitials();
        p2.getInitials();
    }
}
