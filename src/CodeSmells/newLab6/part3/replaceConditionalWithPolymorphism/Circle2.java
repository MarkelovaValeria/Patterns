package CodeSmells.newLab6.part3.replaceConditionalWithPolymorphism;

public class Circle2  extends Shape2{
    private double radius;

    public Circle2(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
