package oops;

import java.util.ArrayList;

class Car {
    private String brand;
    private String model;
    private long price;

    public Car(String brand, String model, long price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public long getPrice() {
        return price;
    }

}
class Carcollection{

    private  ArrayList<Car> cc;
    public Carcollection(){
        cc = new ArrayList<>();
    }
    public void add_car(Car car)
    {
        cc.add(car);
        System.out.println(car.getBrand()+" "+car.getModel()+" is added");
    }
    public void remove_car(Car car)
    {
        cc.remove(car);
        System.out.println(car.getBrand()+" "+car.getModel()+" is removed");
    }
    public void printcollection()
    {
        for(Car car:cc)
        {
            System.out.println("Price for "+car.getBrand()+" "+car.getModel()+" is "+car.getPrice());
        }
    }
}

public class Car_Details {

    public static void main(String[] args){
        Carcollection cc=new Carcollection();
        Car car1=new Car("hyundai","verna",1200000);
        Car car2=new Car("Bmw","525d",5700000);
        Car car3=new Car("rollsroyce","ghost",70000000);
        cc.add_car(car1);
        cc.add_car(car2);
        cc.add_car(car3);
        cc.printcollection();
        cc.remove_car(car1);
        cc.printcollection();
    }
}
