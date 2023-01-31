package Gun26._04_Ornek_DegisikCozum;

public class musteri {
private String name;
private elektrikhes elekhes;

    public musteri(String name, elektrikhes elekhes) {
        setName(name);
        setElekhes(elekhes);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public elektrikhes getElekhes() {
        return elekhes;
    }

    public void setElekhes(elektrikhes elekhes) {
        this.elekhes = elekhes;
    }

    @Override
    public String toString() {
        return "musteri{" +
                "name='" + name + '\'' +
                ", elekhes=" + elekhes +
                '}';
    }
}

