package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hmex1 {
    public static void main(String[] args)
    {
        HashMap<Integer,String> student = new HashMap<>();
        student.put(3,"Akiles");
        student.put(2,"akil");
        student.put(13,"karthi");
        student.put(16,"kavi");
        for(Map.Entry x:student.entrySet())
        {
            System.out.println(x.getKey()+" "+x.getValue());
        }
        Set<Integer> keys=student.keySet();
        System.out.println("print keys for the hashmap");
        for(Integer key:keys)
        {
            System.out.println(key);
        }
        System.out.println("print values from the hashmap");
        for(Integer key:keys)
        {
            System.out.println(student.get(key));
        }
    }
}
