package zadania.wzorceStrukturalne;

public interface OrderFacade {

    boolean order(Long productId, int amount, String recipient);
}
