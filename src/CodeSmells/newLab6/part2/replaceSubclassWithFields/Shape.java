package CodeSmells.newLab6.part2.replaceSubclassWithFields;

public class Shape {
    protected double area;
    protected double perimeter;

    public void setArea(double area){
        this.area = area;
    }

    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
