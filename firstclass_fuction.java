package fuctionalprograms;

public class firstclass_fuction {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        CubeMaker cubeMaker= item -> Math.pow(item,3);
        for(int i=0;i<a.length;i++)
        {
            System.out.println((int)cubeMaker.cube(a[i]));
        }
    }
    interface CubeMaker{
        double cube(int item);
    }
}
