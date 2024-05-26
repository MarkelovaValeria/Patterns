package CodeSmells.newLab6.part3.replaceNestedConditionalWithGuardClauses;

public class OrderProcessor2 {
    public void processOrder(int quantity, double price){
        if(quantity <= 0){
            System.out.println("Invalid quantity");
            return;
        }

        if(price <= 0){
            System.out.println("Invalid price");
            return;
        }

        System.out.println("Order processed successfully");
    }
}
