/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p13.pkg8bankaccount;

/**
 *
 * @author 151146
 */
public abstract class BankAccount 
{
    private double balance;
    public BankAccount()
    {
        balance = 0;
    }
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    public double getBalance()
    {
        return balance;
    }
    public void transfer(double amount, BankAccount other)
    {
        withdraw(amount);
        other.deposit(amount);
    }
    public abstract void endOfMonth();
}
