package CodeSmells.newLab6.part4.addParameter;

public class AddParameter {
    public double calculateTotale(double price, int quantity, double taxRate){
        double totalBeforeTax = price * quantity;
        double taxAmount = totalBeforeTax * taxRate;
        return totalBeforeTax+taxAmount;
    }
}
