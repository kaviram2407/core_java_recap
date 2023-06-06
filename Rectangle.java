/*
Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle*/
package oops;
class Rectangle_details{
    private int height;
    private int length;
    public Rectangle_details(int height,int length)
    {
        this.height=height;
        this.length=length;
    }
    public int area()
    {
        return length*height;
    }
    public int perimeter()
    {
        return 2*(length+height);
    }
}

public class Rectangle {
    public static void main(String[] args)
    {
        Rectangle_details rec=new Rectangle_details(5,10);
        System.out.println( "Area of rectangle is "+rec.area()+" sq.units");
        System.out.println( "Perimeter of rectangle is "+rec.perimeter()+" units");
    }
}
