/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cohen.ben.mim.submission;

import java.util.ArrayList;

/**
 *
 * @author Ben Cohen
 */
public class CohenBenMIMSubmission {
private static ArrayList<String> input = new ArrayList<>();
private static int inputCount = 0;
private static int outputCount = 0;
private static int[] lengths = new int[0];
private static int mean = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {  
        input.add("four");
        input.add("five5");
        input.add("Hyphen-");
        input.add("UPPercase");
        lengths = new int[input.size()];
        
        for (int x = 0; x < input.size(); x++)
        {
            //Carry out methods
            System.out.println("" + listProcessor(input, x));
        }
        System.out.println("Input Character Count: " + inputCount);

        
        //calculate mean and output characters
        int[] lengths2 = new int[input.size()];
        for (int x = 0; x < input.size(); x++)
        {
            outputCount += input.get(x).length();
            lengths[x] = input.get(x).length();
            
            int counter = 0;
            for (int a = 0; a < input.size(); a++)
            {
                if (lengths[x] > lengths[a])
                    counter++;
            }
            lengths2[counter] = lengths[x];
        }
        mean = lengths2[input.size() / 2];
        System.out.println("Output Character Count: " + outputCount);
        System.out.println("Mean: " + mean);
        
    }
    public static String listProcessor(ArrayList<String> inputs, int x)
    {
        inputCount += input.get(x).length();
        //if length 4 statements begin
        if (inputs.get(x).length() % 4 == 0)
        {
            String temp = "";
            //Reverse
            for (int y = inputs.get(x).length(); y >= 0 ; y--)
            {
                if (y == inputs.get(x).length())
                    temp += inputs.get(x).substring(y);
                else
                    temp += inputs.get(x).substring(y,y+1);
            }
            inputs.set(x, temp);
        }

        //If length is multiple of 5, trim it.
        if (inputs.get(x).length() % 5 == 0)
        {
            inputs.set(x, inputs.get(x).substring(0,5));
        }

        //if 3 letters are uppercase statements begin. The prompt doesnt say that there 
           //cant be more than one case true, so I'm also checking for all the cases.
        int counter = 0;
        for (int z = 0; z <= 4; z++)
        {
            if (inputs.get(x).length() >= 5)
            {
                if (Character.isUpperCase(inputs.get(x).charAt(z)))
                {
                    counter++;
                }

            }
            else
            {
                if (z > inputs.get(x).length() - 1)
                    break;
                else
                    if (Character.isUpperCase(inputs.get(x).charAt(z)))
                    {
                        counter++;
                    }
            }
        }
        if (counter > 2)
        {
            for (int c = 0; c < inputs.get(x).length(); c++)
            {
                //Capitalize
                if (c == inputs.get(x).length())
                    inputs.set(x, inputs.get(x).substring(0,c) + inputs.get(x).substring(c).toUpperCase());
                else
                    inputs.set(x, inputs.get(x).substring(0,c) + inputs.get(x).substring(c,c+1).toUpperCase() + inputs.get(x).substring(c+1));
            }
        }

        //check if theres a hyphen at the end
       String d = inputs.get(x).substring(inputs.get(x).length()-1);
        if (inputs.get(x).substring(inputs.get(x).length() - 1).equals("-"))
        {
            inputs.set(x, inputs.get(x).substring(0,inputs.get(x).length()-1));
            if (x < inputs.size())
                inputs.set(x+1, inputs.get(x));
        }

        return("String #" + (x+1) + ": " + inputs.get(x));
    }
}
