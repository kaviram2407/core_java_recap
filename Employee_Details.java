package oops;
class Employee
{
    private String name;
    private String role;
    private double salary;
    public Employee(String name,String role,double salary){
        this.name=name;
        this.role=role;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public String getRole(){
        return role;
    }
    public double getSalary(){
        return salary;
    }
    public void print_details(){
        System.out.println("Name: "+getName());
        System.out.println("JobRole: "+getRole());
        System.out.println("salary: "+getSalary());
    }
    public void incresesalary(double percentage)
    {
        salary=salary+(salary*percentage/100);
        System.out.println(getName()+" get "+getSalary()+" as incremented salary");
        System.out.println();
    }

}
public class Employee_Details {
    public static void main(String[] args){
        Employee employee1=new Employee("kavi","software devoloper",50000);
        Employee employee2=new Employee("ram","HR",75000);
        employee1.print_details();
        System.out.println();
        employee2.print_details();
        System.out.println();
        employee1.incresesalary(10.0);
        employee2.incresesalary(5.0);
    }
}
