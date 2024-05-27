package CodeSmells.newLab6.part5.pushDownField;

public class Truck5 extends Vehicle5{
    protected String model;

    public Truck5(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
