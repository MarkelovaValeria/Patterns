package CodeSmells.newLab6.part3.consolidateConditionalExpression;

public class PaymentProcessor {

    private void applyDiscount(){
        System.out.println("Discount applied.");
    }
    public void processPayment(double amount, boolean isMemeber, boolean isDiscountAvailable){
        if((amount>100&&isMemeber)||(amount>200&&isDiscountAvailable)){
            applyDiscount();
        }
    }
}
