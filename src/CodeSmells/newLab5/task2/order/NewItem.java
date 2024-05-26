package CodeSmells.newLab5.task2.order;

public class NewItem {
    private String name;
    private double price;

    public NewItem(String name, double price) {
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
