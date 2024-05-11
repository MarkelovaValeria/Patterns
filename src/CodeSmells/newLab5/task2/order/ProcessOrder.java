package CodeSmells.newLab5.task2.order;

import java.util.List;

public class ProcessOrder {
    private String customerName;
    private List<NewOrder> newOrderList;
    private PriceCalculator priceCalculator;
    public ProcessOrder(List<NewOrder> newOrderList, String customerName){
        this.customerName = customerName;
        this.newOrderList = newOrderList;
        priceCalculator = new PriceCalculator();
    }

    public void processOrder(){
        for (NewOrder neworder:newOrderList){
            System.out.println("Order - " + neworder.getName()+"\nPrice - " + neworder.getPrice()+ "\nCustomer name - " + customerName);
        }
    }

    public void addOrder(NewOrder newOrder){
        newOrderList.add(newOrder);
        System.out.println("+order" + newOrder.getName());
    }

    public void totalPrice(){
        System.out.println("TOTAL PRICE - " + priceCalculator.calculateTotalPrice(newOrderList));
    }
}
