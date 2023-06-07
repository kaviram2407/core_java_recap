/*split set using spliterator*/
package collections;

import java.util.HashSet;
import java.util.Spliterator;
import java.util.function.Consumer;

public class hashsplit {
    public static void main(String[] args)
    {
        HashSet<Integer> a=new HashSet<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        Spliterator <Integer> spl=a.spliterator();
        System.out.println("Elements in set");
        spl.forEachRemaining((n)->System.out.println(n));
    }
}
