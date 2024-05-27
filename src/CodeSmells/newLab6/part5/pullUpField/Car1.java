package CodeSmells.newLab6.part5.pullUpField;

public class Car1 extends Vehicle{
    private String model;
    public Car1(String color, String model) {
        super(color);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
