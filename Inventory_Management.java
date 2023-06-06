package oops;
import java.util.*;
class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
class Inventory {
    private ArrayList < Product > products;

    public Inventory() {
        products = new ArrayList < Product > ();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName()+" added to Inventory");
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println(product.getName()+" Removed from Inventory.");
    }

    public void checkLowInventory() {
        for (Product product: products) {
            if (product.getQuantity() <= 100) {
                System.out.println(product.getName() + " is running low on inventory.");
                System.out.println("Current quantity: " + product.getQuantity());
            }
        }
    }
}
public class Inventory_Management {
    public static void main(String[] args)
    {
        Inventory inventory=new Inventory();
        Product product1=new Product("chargers",150);
        Product product2=new Product("powerbanks 10000 mah",75);
        Product product3=new Product("TV",90);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.checkLowInventory();
        inventory.removeProduct(product3);
    }
}
