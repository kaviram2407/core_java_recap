package fuctionalprograms;

public class arraysearch {
        public static int linearSearch(String[] arr, String key){
            for(int i=0;i<arr.length;i++){
                if(arr[i].equals( key)){
                    return i+1;
                }
            }
            return -1;
        }
        public static void main(String a[]) {
            String[] a1 = {"kaviram", "Kalai", "sudha", "raja", "ram"};
            String key = "kaviram";
            System.out.println(key + " is found at position " + linearSearch(a1, key));
        }
}
