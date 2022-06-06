package zadania.kompozycja;

public class Processor {

    private Integer frequency;
    private String brand;

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void obliczZuzycieProcesora(){
        System.out.println("Zużycie procesora to: 45%");
    }
}
