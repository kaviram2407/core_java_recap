/*Write a Java program to join two array lists.*/
package collections;

import java.util.ArrayList;

public class arraylistex1 {
    public static void main(String[] args)
    {
        ArrayList<String> colors1= new ArrayList<>();
        ArrayList<String> colors2= new ArrayList<>();
        colors1.add("orange");
        colors1.add("rose");
        colors1.add("violet");
        System.out.println("List colors1 contains :"+colors1);
        colors2.add("red");
        colors2.add("yellow");
        colors2.add("green");
        System.out.println("List colors2 contains :"+colors2);
        ArrayList<String> color=new ArrayList<>();
        color.addAll(colors1);
        color.addAll(colors2);
        System.out.println("List color contains both color1 and color2 :"+color);
    }
}
