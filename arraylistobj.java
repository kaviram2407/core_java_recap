package collections;
import java.util.*;
public class arraylistobj {
    public static void main(String[] args){
        ArrayList<String> name=new ArrayList<>();
        ArrayList<Double> deposit=new ArrayList<>();
        ArrayList<Double> costperday=new ArrayList<>();
        name.add("light");
        deposit.add(1000.0);
        costperday.add(100.0);
        name.add("fan");
        deposit.add(1000.0);
        costperday.add(50.0);
        System.out.format("%-20s%-20s%-20s","name","deposit","costperday");
        System.out.format("\n%-20s%-20s%-20s",name.get(0),deposit.get(0),costperday.get(0));
        System.out.format("\n%-20s%-20s%-20s",name.get(1),deposit.get(1),costperday.get(1));
    }
}
