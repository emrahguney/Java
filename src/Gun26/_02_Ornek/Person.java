package Gun26._02_Ornek;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

public class Person {//Person tip adi

    String name;
    String surName;
    int age;

    public void bilgiYazdir(){
        System.out.println("name = " + name);
        System.out.println("surName = " + surName);
        System.out.println("age = " + age);

    }
                //toString2 dersen calismaz yazdirmaz
    public String toString(){//bu toString metodunu kullanip yazarsan direk onu calistirir yeterki geri donebilen bir returnu olsun
       return name+" "+surName+" "+age+" bilgileridir";
    }

    public void getBirthYear(){

        System.out.println("birthyear = " + (2022-age));

    }
    public void getInitials(){

        System.out.println( name.toUpperCase().charAt(0)+"."+surName.toUpperCase().charAt(0)+".");


    }
    public String getBirthYear2(){

       return "dogum yili"+(2022-age);

    }
}
