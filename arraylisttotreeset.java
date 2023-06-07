package collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class arraylisttotreeset {
    public static void main(String[] args)
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(100);
        a.add(430);
        a.add(233);
        a.add(348);
        a.add(622);
        a.add(67);
        System.out.println("Arraylist:"+a);
        TreeSet<Integer> num=new TreeSet<>(a);
        System.out.println("Treeset:"+num);
    }
}
