package stack;

class Stack
{
    int[] a;
    int top;
    Stack()
    {
        a=new int[100];
        top=-1;
    }

    void push(int x)
    {
        if(top==a.length-1)
            System.out.println("overflow");
        else{
            a[++top]=x;
            System.out.println(a[top]+" is added to stack");
        }
    }

    void pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
        }
        else{
            System.out.println(a[top]+" is removed from stack");
            top=--top;
        }
    }

    void display()
    {
        if(top==-1){
            System.out.print("empty stack");
        }else
        for(int i=0;i<=top;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    void isEmpty()
    {
        if(top==-1)
            System.out.println("true");
        else
            System.out.println("false");
    }

    void peek()
    {
        if(top==-1)
        {
            System.out.println("underflow");
        }
        else System.out.println("Top of stack is "+a[top]);
    }


}

public class stack2
{
    public static void main(String[] args)
    {

        Stack s=new Stack();
        s.push(5);
        s.push(1);
        s.push(6);
        s.peek();
        s.pop();
        s.display();
        s.pop();
        s.pop();
        s.pop();
        s.peek();
        s.display();
        s.isEmpty();
        s.push(143);
    }
}
