package CodeSmells.newLab6.part2.replaceTypeCodeWithState_Strategy;

public class CancelledOrderStatus implements OrderStatus{
    @Override
    public void processOrder(Order5 order5) {
        System.out.println("Order is cancelled");
    }
}
