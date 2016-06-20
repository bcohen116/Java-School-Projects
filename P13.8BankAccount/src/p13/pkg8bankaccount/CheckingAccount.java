/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p13.pkg8bankaccount;

/**
 *
 * @author 151146
 */
public class CheckingAccount extends BankAccount
{
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 2;
    private static final double TRANSACTION_FEE = 2.0; 
    
    public CheckingAccount(double initialBalance)
    {
        super(initialBalance);
        transactionCount = 0;
    }
    public void deposit(double amount)
    {
        transactionCount++;
        super.deposit(amount);
    }
    public void withdraw(double amount)
    {
        transactionCount++;
        super.withdraw(amount);
    }
    public void endOfMonth()
    {
        if (transactionCount > FREE_TRANSACTIONS)
        {
            double fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
            super.withdraw(fees);
        }
        transactionCount = 0;
    }
    public String toString()
    {
        return CheckingAccount.this.getClass().getSimpleName();
    }
    public boolean equals(BankAccount account)
    {
        if (account.getClass().equals(this.getClass()))
            return (account.getBalance() == this.getBalance());
        else
            return false;
    }
}
