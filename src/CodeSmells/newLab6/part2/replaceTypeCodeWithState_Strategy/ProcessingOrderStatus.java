package CodeSmells.newLab6.part2.replaceTypeCodeWithState_Strategy;

public class ProcessingOrderStatus implements OrderStatus{
    @Override
    public void processOrder(Order5 order5) {
        System.out.println("The order is being processed...");
    }
}
