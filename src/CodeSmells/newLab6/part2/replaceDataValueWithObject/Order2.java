package CodeSmells.newLab6.part2.replaceDataValueWithObject;

public class Order2 {
    private Customer customer;
    private double amount;

    public Order2(Customer customer, double amount){
        this.customer = customer;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
