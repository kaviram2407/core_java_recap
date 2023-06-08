package generics;

public class genericex6 {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if(y.compareTo(max) > 0) {
            max = y;
        }

        if(z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String args[]) {
        System.out.println("Maximum of three is:"+maximum( 16, 13, 15 ));

        System.out.println("Maximum of three is:"+maximum( 9.7, 18.8, 7.7 ));

        System.out.println("Maximum of three is:"+maximum("ball", "apple", "zebra"));
    }
}
