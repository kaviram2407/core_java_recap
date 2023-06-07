package collections;

import java.util.HashMap;
import java.util.Map;

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
    }
}
