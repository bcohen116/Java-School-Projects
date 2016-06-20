/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p7.pkg10;

/**
 *
 * @author 151146
 */
public class FactorGenerator 
{
    private int input;
    private int inputNumber;
    private int iAmAFactor;
    
    public FactorGenerator(int input)
    {
        this.input = input;
        inputNumber = input;
    }
    public int nextFactor()
    {   
        return iAmAFactor;
    }
    public boolean hasMoreFactors()
    {   
        int factorChecker = 0;  
        if (input < 4)
        {
            inputNumber = input;
            return false;
        }
        else if (input >= 4)
        {
            for (int factor = 2; factor <= (inputNumber); factor++)
            {
                if (factor == inputNumber)
                {
                    iAmAFactor = factor;
                    inputNumber = 0;
                    return true;
                }
                else if (inputNumber % factor == 0)
                {
                    factorChecker = 1;
                    iAmAFactor = factor;
                    inputNumber = inputNumber / factor;
                    return true;  
                }

            }
        }
        return false;
       
//        int num3 = num2 % 10;
//        num++;    
//            if (num == num2 && num3 % 2 != 0)
//            {
//                num = num2;
//                isPrime = true;
//                return false;
//            }
//            if (num2 % num == 0)
//            {
//                hasMoreFactors = true;
//                num2 = num2 / num;
//            }
//            else
//            {
//                hasMoreFactors = false;  
//            }           
//            if (num == factor)
//            {
//                hasMoreFactors = false;
//            }
//            if (hasMoreFactors == false && num == factor + 1 && counter == 0)
//            {
//                counter = 1;
//                num = num2;  
//                hasMoreFactors = true;
//            }
// 
//        return hasMoreFactors;
    }
}
