/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p13.pkg8bankaccount;

/**
 *
 * @author 151146
 */
public class P138BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        SavingsAccount momsSavings = new SavingsAccount(10);
        CheckingAccount harrysChecking = new CheckingAccount(1000);
        CheckingAccount myChecking = new CheckingAccount(2194);
               
        test(momsSavings);
        System.out.println();
        test(harrysChecking);
        
        System.out.println();
        System.out.println("toString Override: " + momsSavings.toString());
        System.out.println("toString Override: " + harrysChecking.toString());
       
        System.out.println("Are the two objects equal? " + harrysChecking.equals(momsSavings));
        System.out.println("How about now? " + myChecking.equals(harrysChecking));
    }
    public static void test(BankAccount account)
    {
        //random transaction 1
        account.deposit(1000);
        System.out.println("Balance of " + account.getClass().getSimpleName() + 
                " after random transaction 1: " + account.getBalance());
        //random transaction 2
        account.withdraw(100);
        System.out.println("Balance of " + account.getClass().getSimpleName() + 
                " after random transaction 2: " + account.getBalance());
        //random transaction 3
        account.deposit(500);
        System.out.println("Balance of " + account.getClass().getSimpleName() + 
                " after random transaction 3: " + account.getBalance());
        //random transaction 4
        account.withdraw(100);
        System.out.println("Balance of " + account.getClass().getSimpleName() + 
                " after random transaction 4: " + account.getBalance());
        //random transaction 5
        account.withdraw(100);
        System.out.println("Balance of " + account.getClass().getSimpleName() + 
                " after random transaction 5: " + account.getBalance());
        
        account.endOfMonth();
        System.out.println("Balance of " + account.getClass().getSimpleName() + 
                " after end of month: " + account.getBalance());
        
    }
}
