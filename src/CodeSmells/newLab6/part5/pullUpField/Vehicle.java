package CodeSmells.newLab6.part5.pullUpField;

public class Vehicle {
    protected String color;

    public Vehicle(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
