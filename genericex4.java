package generics;
class Box<K,V>{
    private K k;
    private V v;
    public void add(K k,V v)
    {
        this.k=k;
        this.v=v;
    }
    public K getK(){
        return k;
    }
    public V getV()
    {
        return v;
    }
}
public class genericex4 {
    public static void main(String[] args)
    {
        Box<String,String> a=new Box<>();
        a.add(new String("kavi"),new String("ram"));
        System.out.println(a.getK()+" "+a.getV());
    }
}
