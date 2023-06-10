package fuctionalprograms;

public class pure_function {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+" multiples");
            for(int j=1;j<=5;j++)
            {
                System.out.println(i+"*"+j+"="+multiple(i,j));
            }
            System.out.println();
        }

    }
    public static int multiple(int a,int b)
    {
        return a*b;
    }
}
