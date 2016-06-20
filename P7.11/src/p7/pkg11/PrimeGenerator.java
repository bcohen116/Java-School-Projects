/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p7.pkg11;

/**
 *
 * @author Ben
 */
public class PrimeGenerator
{        
   private int primeNumber = 1;
   private int number;

   public PrimeGenerator(int integer)
   {
       number = integer;
   }
   public int nextPrime()
   {
      do
      {
         primeNumber++;
      }
      while (!isPrime());

      return primeNumber;
   }

   private boolean isPrime()
   {
      if (primeNumber < 2)
         return false;
      if (primeNumber >= 3 && primeNumber % 2 == 0)
         return false;
      
      for (int PrimeChecker = 3; ; PrimeChecker++, PrimeChecker++)
      {
          if (Math.pow(PrimeChecker, 2) > primeNumber)
              break;
          if (primeNumber % PrimeChecker == 0)
              return false;
      }

      return true;
   }
}


