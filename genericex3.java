package generics;

public class genericex3 {
    public static <E> void printArray(E[] a)
    {
        for(E e:a)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        Integer nums[]={1,2,3,4,5};
        String name[]={"apple","ball","cat","dog","elephant"};
        Character ini[]={'a','b','c','d'};
        System.out.println("numbers:");
        printArray(nums);
        System.out.println("name:");
        printArray(name);
        System.out.println("Ini:");
        printArray(ini);

    }
}
