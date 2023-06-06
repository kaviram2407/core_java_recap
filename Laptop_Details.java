/* Write a Java program to create a class called "Laptop" with a brand and price attribute. Create two instances of the "laptop" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values
*/
package oops;
class Laptop{
    private String model;
    private int price;
    public Laptop(String model,int price)
    {
        this.model=model;
        this.price=price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Laptop_Details {
    public static void main(String[] args)
    {
        Laptop laptop1=new Laptop("mac m1",97000);
        Laptop laptop2=new Laptop("mac m2",112000);
        System.out.println("price for "+laptop1.getModel()+" is "+laptop1.getPrice());
        System.out.println("price for "+laptop2.getModel()+" is "+laptop2.getPrice());
        System.out.println(" After 25 % discount ........... price be");
        laptop1.setPrice((int)(75*laptop1.getPrice())/100);
        laptop2.setPrice((int)(75*laptop2.getPrice())/100);
        System.out.println("price for "+laptop1.getModel()+" is "+laptop1.getPrice());
        System.out.println("price for "+laptop2.getModel()+" is "+laptop2.getPrice());
    }
}


