package CodeSmells.newLab6.part2.replaceTypeCodeWithState_Strategy;

public class NewOrderStatus implements OrderStatus{

    @Override
    public void processOrder(Order5 order5) {
        System.out.println("new order...");
        order5.setStatus(new ProcessingOrderStatus());
    }
}
