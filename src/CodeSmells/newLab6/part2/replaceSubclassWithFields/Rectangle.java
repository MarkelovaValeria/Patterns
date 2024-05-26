package CodeSmells.newLab6.part2.replaceSubclassWithFields;

public class Rectangle extends Shape{
    public Rectangle(double width, double height){
        double area = width*height;
        double perimeter = 2*(width+height);
        setArea(area);
        setPerimeter(perimeter);
    }
}
