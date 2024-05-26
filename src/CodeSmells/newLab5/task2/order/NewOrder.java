package CodeSmells.newLab5.task2.order;

import java.util.ArrayList;
import java.util.List;

public class NewOrder {
    private String customerName;
    private List<NewItem> newItemList;

    public NewOrder(String customerName){
        this.customerName = customerName;
        this.newItemList = new ArrayList<>();
    }

    public void addItem(NewItem newItem){
        newItemList.add(newItem);
        System.out.println("+item");
    }
    public void removeItem(NewItem newItem){
        newItemList.remove(newItem);
        System.out.println("-item");
    }


    public String getCustomerName() {
        return customerName;
    }

    public List<NewItem> getNewItemList() {
        return newItemList;
    }
}
