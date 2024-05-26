package CodeSmells.newLab6.part2.replaceSubclassWithFields;

public class Circle extends Shape{
    public Circle(double radius){
        double area = Math.PI*Math.pow(radius,2);
        double perimeter = 2*Math.PI+radius;
        setArea(area);
        setPerimeter(perimeter);
    }
}
