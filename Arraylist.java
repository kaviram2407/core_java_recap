/*arraylist with all inbuilt fuctions*/
package collections;

import java.util.ArrayList;
import java.util.Comparator;

public class Arraylist {
    public static void main(String[] args)
    {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("strawberry");
        System.out.println("Size of arraylist :"+fruits.size());
        System.out.println(fruits);
        fruits.add(2,"jackfruit");
        System.out.println(fruits.get(2)+" is added at index 2");
        System.out.println("Size of arraylist :"+fruits.size());
        System.out.println(fruits);
        String rm=fruits.remove(4);
        System.out.println("removed fruit is :"+rm);
        System.out.println("Size of arraylist :"+fruits.size());
        System.out.println(fruits);
        fruits.sort(Comparator.naturalOrder());
        System.out.println("sorted arraylist : "+fruits);

    }
}
