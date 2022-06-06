package zadania.wzorceStrukturalne;

import java.math.BigDecimal;

class MargeritaPizza extends Pizza {

    private static final BigDecimal MARGERITA_PRICE = new BigDecimal(3);

    private Pizza pizza;

    public MargeritaPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(MARGERITA_PRICE);
    }

    @Override
    public String getName() {
        return super.getName() + " Margerita";
    }
}
