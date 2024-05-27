package CodeSmells.newLab6.part5.extractInterface;

public class Rectangle8 implements Shape8{
    private double width;
    private double height;

    public Rectangle8(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
