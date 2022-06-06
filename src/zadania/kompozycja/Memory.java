package zadania.kompozycja;

public class Memory {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void obliczWolnaPamiec() {
        System.out.println("Wolna pamięć to 2GB");
    }
}