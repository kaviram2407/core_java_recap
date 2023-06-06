package oops;

import java.util.ArrayList;

class Account{
    private int accountno;
    private String name;
    private double balance;

    public Account(int accountno,String name,Double balance)
    {
        this.accountno=accountno;
        this.name=name;
        this.balance=balance;
    }
    public int getAccountno()
    {
        return accountno;
    }
    public String getName()
    {
        return name;

    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount ){
        balance=balance+amount;
        System.out.println("amount "+amount+" is deposited new Balance for the account "+getAccountno()+" is "+getBalance());
    }
    public void withdraw(double amount ){
        balance=balance-amount;
        System.out.println("amount "+amount+" is withdrawn new  Balance for the account "+getAccountno()+" is "+getBalance());
    }
    public void getAccountInfo() {
        System.out.println("Name: " + name + ", Account Number: " + accountno + ", Balance: " + balance);
    }
}
class Bank_details{
private ArrayList<Account> accounts;
public Bank_details(){
    accounts=new ArrayList<>();
}
public void addaccount(Account account)
{
    accounts.add(account);
}
public void removeaccount(Account account)
{
    accounts.remove(account);
    System.out.println(" Account no "+ account.getAccountno()+" is removed");
}
public void depositmoney(Account account,double amount)
{
    account.deposit(amount);
}
public void withdraw(Account account,double amount)
{
    account.withdraw(amount);
}
public void showaccount(){
    for(Account account:accounts)
    {
        account.getAccountInfo();
    }
    System.out.println();
}
}
public class Bank {
    public static void main(String[] args){
        Bank_details bank=new Bank_details();
        Account account1=new Account(1,"kaviram",50000.00);
        Account account2=new Account(2,"krish",100000.00);
        Account account3=new Account(3,"ram",10500.00);
        bank.addaccount(account1);
        bank.addaccount(account2);
        bank.addaccount(account3);
        bank.showaccount();
        bank.depositmoney(account1,55000.00);
        bank.withdraw(account2,10000.00);
        System.out.println();
        bank.removeaccount(account3);
        bank.showaccount();
    }
}
