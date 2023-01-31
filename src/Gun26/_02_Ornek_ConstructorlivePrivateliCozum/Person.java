package Gun26._02_Ornek_ConstructorlivePrivateliCozum;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
    void getBirthYear(){

        System.out.println("yasi="+(2023-age));
    }
    void getInitials(){
        System.out.println(name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0)+".");
    }
}
