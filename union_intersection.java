/*find union and intersection from two sets*/
package collections;

import java.util.HashSet;

public class union_intersection {
    public static void main(String[] args)
    {
        HashSet<Integer> num1=new HashSet<>();
        HashSet<Integer> num2=new HashSet<>();


        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        num2.add(3);
        num2.add(7);
        num2.add(5);
        num2.add(6);
        num2.add(4);

        HashSet<Integer> union=new HashSet<>(num1);
        HashSet<Integer> intersection=new HashSet<>(num1);

        union.addAll(num2);
        intersection.retainAll(num2);

        System.out.println("Hash set num1:"+num1);
        System.out.println("Hash set num2:"+num2);
        System.out.println("union for Hash set num1 and num2:"+union);
        System.out.println("intersection for Hash set num1 and num2:"+intersection);



    }
}
