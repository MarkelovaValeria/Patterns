package CodeSmells.newLab6.part5.extractInterface;

public class Square8 implements Shape8{
    private double side;

    public Square8(double side){
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
