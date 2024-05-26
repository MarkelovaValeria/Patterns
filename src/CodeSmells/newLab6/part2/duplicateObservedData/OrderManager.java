package CodeSmells.newLab6.part2.duplicateObservedData;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order3> orders;

    public  OrderManager(){
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order3 order){
        orders.add(order);
    }

    public List<Order3> getOrders(){
        return orders;
    }

    public Order3 getOrder(int index){
        if(index>=0 && index<orders.size()){
            return orders.get(index);
        }
        return null;
    }


}
