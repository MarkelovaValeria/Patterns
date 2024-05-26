package CodeSmells.newLab6.part3.replaceConditionalWithPolymorphism;

public class Rectangle2 extends Shape2{
    private double length;
    private double width;

    public Rectangle2(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}
