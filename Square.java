/*Write a Java program to create a class called "Square" with a radius attribute. You can access and modify this attribute. Calculate the area and perimeter of the square*/

package oops;
class Square_Details{
    private int side;
    public Square_Details(int side){
        this.side=side;
    }
    public int getSide(){
        return side;
    }
    public void setSide(int side)
    {
        this.side=side;
    }
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
public class Square {
    public static void main(String[] args)
    {
        Square_Details sq=new Square_Details(9);
        System.out.println("the side of the square is :"+ sq.getSide());
        System.out.println("the area of the square is :"+sq.area());
        System.out.println("the perimeter of the square is :"+sq.perimeter());
        System.out.println();
        sq.setSide(16);
        System.out.println("the side of the square is :"+ sq.getSide());
        System.out.println("the area of the square is :"+sq.area());
        System.out.println("the perimeter of the square is :"+sq.perimeter());
        
    }
}
