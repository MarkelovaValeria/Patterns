package CodeSmells.newLab6.part5.pushDownField;

public class Car5 extends Vehicle5{
    protected String brand;

    public Car5(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
