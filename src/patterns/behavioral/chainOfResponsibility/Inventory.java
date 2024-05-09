package patterns.behavioral.chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> items;

    public Inventory(){
        this.items = new HashMap<>();
    }

    public void addItem(String item, int quantity){
        items.put(item,quantity);
    }

    public void removeItem(String item, int quantity){
        if(items.containsKey(item)){
            int result = items.get(item) - quantity;
            if(result <= 0){
                items.remove(item);
            }else{
                items.put(item, result);
            }
        }
    }

    public  Map<String, Integer> getItems(){
        return items;
    }
    public void showItems(){
        for (Map.Entry<String,Integer> item : items.entrySet()){
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
