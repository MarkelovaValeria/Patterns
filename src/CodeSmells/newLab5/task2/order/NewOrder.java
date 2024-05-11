package CodeSmells.newLab5.task2.order;

public class NewOrder {
    private String name;
    private double price;

    public NewOrder(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
