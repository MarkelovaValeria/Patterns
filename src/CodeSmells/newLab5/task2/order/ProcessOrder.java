package CodeSmells.newLab5.task2.order;

import java.util.ArrayList;
import java.util.List;

public class ProcessOrder {
    private List<NewOrder> newOrderList;
    private PriceCalculator priceCalculator;
    public ProcessOrder(){
        this.priceCalculator = new PriceCalculator();
        this.newOrderList = new ArrayList<>();
    }

    public void processOrder(){
        for(NewOrder order: newOrderList){
            System.out.println(order.getCustomerName()+" make an order"+"\nTOTAL PRICE - " + priceCalculator.calculateTotalPrice(order.getNewItemList()));
        }
    }

    public void addOrder(NewOrder newOrder){
        newOrderList.add(newOrder);
        System.out.println("+order " + newOrder.getCustomerName());
    }

}
