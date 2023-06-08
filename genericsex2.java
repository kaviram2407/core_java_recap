package generics;
import java.util.*;
class Pair<K,V>
{
    private Map<K,V> pair=new HashMap<>();
    public void addpair(K key,V value)
    {
        pair.put(key,value);
    }
    public V getValue(K key) {
        return pair.get(key);
    }
}

public class genericsex2 {
    public static void main(String[] args)
    {
        Pair<String, Integer> pair = new Pair<String, Integer>();
        pair.addpair("1", Integer.valueOf(10));
        System.out.println("(Pair)Integer Value \n"+ pair.getValue("1"));
    }
}
