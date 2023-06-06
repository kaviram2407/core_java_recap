/*Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".*/
package oops;
abstract class Shape{
    public abstract double getArea();
    public abstract double getPeri();
}
class circle extends Shape{
    private double radius;
    public circle(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        System.out.println("area for circle is ");
        return Math.PI*radius*radius;
    }
    public double getPeri()
    {
        System.out.println("perimeter for circle is ");
        return Math.PI*radius*2;
    }
}
class rectangle extends Shape{
    private double length;
    private double height;
    public rectangle(double length,double height)
    {
        this.height=height;
        this.length=length;
    }
    public double getArea(){
        System.out.println("area for rectangle is ");
        return height*length;
    }
    public double getPeri() {
        System.out.println("perimeter for rectangle is ");
        return 2 * (height + length);
    }
}
class square extends Shape{
    private double side;
    public square(Double side){
        this.side=side;
    }
    public double getArea(){
        System.out.println("area for square is ");
        return side*side;
    }
    public double getPeri()
    {
        System.out.println("perimeter for square is ");
        return 4*side;
    }
}
public class measurements {
    public static void main(String[] args)
    {
        Shape circle=new circle(15.0);
        Shape rectangle=new rectangle(10.0,20.0);
        Shape square=new square(20.0);
        System.out.println( "circle");
        System.out.println(circle.getArea());
        System.out.println(circle.getPeri());
        System.out.println( "rectangle");
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPeri());
        System.out.println( "square");
        System.out.println(square.getArea());
        System.out.println(square.getPeri());

    }
}
