/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p13.pkg8bankaccount;

/**
 *
 * @author 151146
 */
public class SavingsAccount extends BankAccount
{
    private double interestRate;
    public SavingsAccount(double rate)
    {
        interestRate = rate;
    }
    public void endOfMonth()
    {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
    public String toString()
    {
        return SavingsAccount.this.getClass().getSimpleName();
    }
    public boolean equals(BankAccount account)
    {
        if (account.getClass().equals(this.getClass()))
            return (account.getBalance() == this.getBalance());
        else
            return false;
    }
}
