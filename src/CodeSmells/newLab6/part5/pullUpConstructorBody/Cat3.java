package CodeSmells.newLab6.part5.pullUpConstructorBody;

public class Cat3 extends Animal3{
    String color;
    public Cat3(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
