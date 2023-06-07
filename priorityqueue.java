package collections;

import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args)
    {
        PriorityQueue<String> a=new PriorityQueue<>();
        a.add("Kavi");
        a.add("ram");
        a.add("Sudha");
        a.add("virat");
        a.add("kalai");
        System.out.println("elements in priority queue:");
        for(String s:a)
        {
            System.out.println(s);
        }
        System.out.println("number of element in queue :"+a.size());
        a.offer("dhoni");
        System.out.println("number of element in queue :"+a.size());
        System.out.println(a);
    }
}
