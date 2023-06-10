package fuctionalprograms;

public class fibbonacci {
    public static void main(String[] args){
        for(int i=1;i<=10;i++)
        System.out.println(fibbo(i));
    }
    public static int fibbo(int n)
    {
        if(n<=2)
        {
            return 1;
        }else{
            return fibbo(n-1)+fibbo(n-2);
        }
    }
}
