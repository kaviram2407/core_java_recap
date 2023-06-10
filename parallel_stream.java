package fuctionalprograms;

import java.util.Arrays;

public class parallel_stream {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6,7,8};
        Arrays.stream(a).parallel().forEach(ele -> System.out.print(ele+" "));
    }
}

