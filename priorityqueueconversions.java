package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class priorityqueueconversions {
    public static void main(String[] args)
    {
        PriorityQueue<String> a=new PriorityQueue<>();
        a.add("red");
        a.add("yellow");
        a.add("white");
        a.add("green");
        a.add("blue");
        System.out.println("queue:"+a);
        List<String> al=new ArrayList<>(a);
        System.out.println("Arraylist:"+al);
        String str=a.toString();
        System.out.println("converted String:"+str);
    }
}
