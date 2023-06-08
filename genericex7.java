package generics;
class test{
    private Number t;
    public void add(Number t){
        this.t=t;
    }
    public Number getT(){
        return t;
    }
}
public class genericex7 {
    public static void main(String[] args){
        test integer=new test();
        integer.add(10);
        test double1=new test();
        double1.add(4640.32);
        System.out.println("Integer:"+integer.getT());
        System.out.println("double:"+double1.getT());
    }
}
