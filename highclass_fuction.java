package fuctionalprograms;
import java.util.function.Function;
public class highclass_fuction {
    public static void main(String[] args) {


        Function<Integer, Integer> twomultiple = t -> 2* t;
        Function<Integer, Integer> threemultiple = t -> 3 * t;
        System.out.println("Three Multiples");
        for(int i = 1; i <= 50; i++){
            print(twomultiple, i);
        }
        System.out.println("Three Multiples");
        for(int i = 1; i <=50; i++){
            print(threemultiple, i);
        }
    }

    private static <T, R> void print(Function<T, R> function, T t ) {
        System.out.println(function.apply(t));
    }
}
