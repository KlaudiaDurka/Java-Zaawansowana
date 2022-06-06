package zadania.oop;

public class Car {

    private Long id;
    private String brand;
    private Integer height;
    private Integer with;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWith() {
        return with;
    }

    public void setWith(Integer with) {
        this.with = with;
    }

    public void turnOnEngine() {
        System.out.println("Włączam silnik !");
    }

    public void drive() {
        System.out.println("Jadę samochodem");
    }
}
