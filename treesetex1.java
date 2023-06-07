package collections;

import java.util.TreeSet;

public class treesetex1 {
    public static void main(String[] args)
    {
        TreeSet<String> colors=new TreeSet<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("purple");
        colors.add("violet");
        colors.add("white");
        System.out.println("Elements in set :"+colors);
        System.out.println("size of set:"+colors.size());
        
    }
}
