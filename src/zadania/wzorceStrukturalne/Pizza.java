package zadania.wzorceStrukturalne;

import java.math.BigDecimal;

public class Pizza {

    private static final BigDecimal BASE_PRICE = new BigDecimal(5);

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return BASE_PRICE;
    }
}