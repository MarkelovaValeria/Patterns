package CodeSmells.newLab6.part3.consolidateDuplicateConditionalFragments;

public class OrderProcessor {

    private void applyDiscount(){
        System.out.println("Discount applied");
    }

    private void processQuantity(int quantity){
        System.out.println("Processing quantity - " + quantity);
    }

    private void processPrice(double price){
        System.out.println("Processing price - " + price);
    }

    public void processOrder(int quantity, double price){
        boolean discountApplied = false;

        if(quantity>10 || price > 100){
            applyDiscount();
            discountApplied = true;
        }

        processQuantity(quantity);
        processPrice(price);
        if (discountApplied) {
            System.out.println("Discount was applied during the order processing.");
        }
    }
}
