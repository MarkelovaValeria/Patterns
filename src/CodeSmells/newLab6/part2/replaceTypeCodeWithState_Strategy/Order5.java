package CodeSmells.newLab6.part2.replaceTypeCodeWithState_Strategy;

public class Order5 {
    private OrderStatus status;

    public Order5(){
        this.status = new NewOrderStatus();
    }

    public void processOrder(){
        status.processOrder(this);
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
