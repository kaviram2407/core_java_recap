package generics;
class alpha<T>
{
    private T t;
    public alpha(){
        this.t=t;
    }
    public void addele(T t){
        this.t=t;
    }
    public T get()
    {
        return t;
    }
}
public class genericex1 {
    public static void main(String[] args) {
        alpha<Integer> integeralpha = new alpha<>();
        alpha<String> stringalpha = new alpha<>();

        integeralpha.addele(new Integer(100));
        stringalpha.addele(new String("kaviram"));

        System.out.println("Integers :"+integeralpha.get());
        System.out.println("Strings :"+stringalpha.get());
    }
}
