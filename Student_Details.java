/*write a Java program to create a class called "student" with a name and rollno attribute.
Create two instances of the "Student" class, set their attributes using the constructor, and print their name and rollno */
package oops;
class Student{
    private String name;
    private int rollno;
    public Student(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
    public String getName()
    {
        return name;
    }
    public int getRollno()
    {
        return rollno;
    }
}

public class Student_Details {
    public static void main(String[] args)
    {
        Student student1=new Student("kavi",16);
        Student student2=new Student("ram",24);
        System.out.println("the Roll no of "+student1.getName()+" is "+student1.getRollno());
        System.out.println("the Roll no of "+student2.getName()+" is "+student2.getRollno());
    }
}
