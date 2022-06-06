package zadania.mapy;

public class Slonce {

    private Long masa;

    public Slonce(Long masa) {
        this.masa = masa;
    }

    public Long getMasa() {
        return masa;
    }

    public void setMasa(Long masa) {
        this.masa = masa;
    }

    @Override
    public String toString() {
        return "Slonce{" +
                "masa=" + masa +
                '}';
    }
}
