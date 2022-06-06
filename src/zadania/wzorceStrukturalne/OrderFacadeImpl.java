package zadania.wzorceStrukturalne;

public class OrderFacadeImpl implements OrderFacade {

    private final DeliveryService deliveryService;
    private final ProductAvailabilityService productAvailabilityService;
    private final PaymentService paymentService;

    public OrderFacadeImpl(DeliveryService deliveryService,
                           ProductAvailabilityService productAvailabilityService,
                           PaymentService paymentService) {
        this.deliveryService = deliveryService;
        this.productAvailabilityService = productAvailabilityService;
        this.paymentService = paymentService;
    }

    public boolean order(Long productId, int amount, String recipient) {
        if (productAvailabilityService.isAvailable(productId)) {
            paymentService.pay(productId, amount);
            deliveryService.deliver(productId, amount, recipient);
            return true;
        }
        return false;
    }
}
