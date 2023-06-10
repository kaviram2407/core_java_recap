package fuctionalprograms;

public class recursive_function {
    public static void main(String[] args)
    {
        System.out.println(digitsum(123456789));
    }
    public static int digitsum(int n){
        if(n<=9){
            return n;
        }
        else{
            return n%10+ digitsum(n/10);
        }
    }
}
