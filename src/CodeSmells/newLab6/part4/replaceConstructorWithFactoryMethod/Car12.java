package CodeSmells.newLab6.part4.replaceConstructorWithFactoryMethod;

public class Car12 {
    private String brand;
    private String model;
    private int year;
    private String color;

    public Car12(String brand, String model, int year, String color){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    private void registerCar(){
        System.out.println("Car registered successfully!");
    }

    public static Car12 createCar(String brand, String model, int year, String color){
        Car12 car12 = new Car12(brand, model, year, color);
        car12.registerCar();
        return car12;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
