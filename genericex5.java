package generics;
import java.util.*;
public class genericex5 {
    public static void main(String[] args) {
        Box<Integer, List<String>> box
                = new Box<Integer, List<String>>();

        List<String> name = new ArrayList<String>();

        name.add("kavi");
        name.add("ram");
        name.add("kalai");

        box.add(new Integer(24),name);
        System.out.println("Integer Value :"+ box.getK());
        System.out.println("String Value :"+box.getV());


    }
}
