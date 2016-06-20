/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acslround4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class ACSLRound4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int x = 0; x < 3; x++)
        {
            System.out.print("Input " + (x + 1) + ": ");
            System.out.println("" + oneSeven(s.nextLine()));
        }
        for (int x = 0; x < 2; x++)
        {
            System.out.print("Input " + (x + 4) + ": ");
            System.out.println("" + oneFifteen(s.nextLine()));
        }
    }
    public static String oneSeven(String list1)
    {
        //sort all the #'s
        ArrayList<String> b = new ArrayList<>();
        String list2 = list1;
        while (list2.contains(","))
        {
            b.add((list2.substring(0, list2.indexOf(','))));
            list2 = list2.substring(list2.indexOf(',') + 1);
        }
        ArrayList<Integer> a = new ArrayList();
        for (String b1 : b) {
            a.add((Character.getNumericValue(b1.charAt(0))));
        }
        //convert to binary
        ArrayList<Integer> binary = new ArrayList<>();
        String sBinary;
        for (int x : a)
        {
            sBinary = Integer.toBinaryString((int) x); //gets last 3 digits of binary
            if (sBinary.length() == 1)
                binary.add(Integer.parseInt(sBinary.substring(0,1)));
            else if (sBinary.length() == 2)
                binary.add(Integer.parseInt(sBinary.substring(0,2)));             
            else
                binary.add(Integer.parseInt(sBinary.substring(0,3)));            
        }
        //check for 1 digit differences
        String result = "";
        ArrayList<String> extended = new ArrayList<>();
        for (int y = 0; y < binary.size(); y++)
        {
            for (int z = 1 + y; z < binary.size(); z++)
            {        
                if (binary.get(y).equals(binary.get(z)))
                    break;
                else if (Math.abs(binary.get(y) - binary.get(z)) == 1)
                {
                    result += simplify(binary.get(y), binary.get(z), true);
                    extended.add(extendSimplify(binary.get(y), binary.get(z), true));
                }
                else if (Math.abs((int)(binary.get(y)/10) - (int)(binary.get(z)/10)) == 1 
                        && Math.abs(binary.get(y) - binary.get(z)) == 0)
                {
                    result += simplify(binary.get(y), binary.get(z), true);
                    extended.add(extendSimplify(binary.get(y), binary.get(z), true));
                }
                else if (Math.abs((int)(binary.get(y)/100) - (int)(binary.get(z)/100)) == 1
                        && Math.abs(((int)((int)binary.get(y)/10)%10) - ((int)((int)binary.get(z)/10)%10)) == 0
                        && Math.abs(((binary.get(y)%10) - (binary.get(z)%10))) == 0)
                {
                    result += simplify(binary.get(y), binary.get(z), true);
                    extended.add(extendSimplify(binary.get(y), binary.get(z), true));
                }
            }
        }
        ArrayList<String> g = extendSort(extended);
        String result2 = "";
        for (String p : g)
        {
            if (p.length() == 1)
                p = "00" + p;
            else if (p.length() == 2)
                p = "0" + p;
            switch (p.substring(0,1)) {
                case "1":
                    result2 += "A";
                    break;
                case "0":
                    result2 += "a";
                    break;
            }
            switch (p.substring(1,2)) {
                case "1":
                    result2 += "B";
                    break;
                case "0":
                    result2 += "b";
                    break;
            }
            switch (p.substring(2)) {
                case "1":
                    result2 += "C";
                    break;
                case "0":
                    result2 += "c";
                    break;
            }
            result2 += "+";
        }
        if (result.length() > 0)
            result = result.substring(0, result.length() - 1); //take off the extra +
        if (result2.length() > 0)
            result2 = result2.substring(0, result2.length() - 1); //take off the extra +
        
        //return result;
        return result2;
    } 
    public static String oneFifteen(String list1)
    {
        //sort all the #'s
        ArrayList<String> b = new ArrayList<>();
        String list2 = list1;
        while (list2.contains(","))
        {
            b.add((list2.substring(0, list2.indexOf(','))));
            list2 = list2.substring(list2.indexOf(',') + 1);
        }
        ArrayList<Integer> a = new ArrayList();
        for (String b1 : b) {
            if (b1.length() > 1)
            {
                a.add((Character.getNumericValue(b1.charAt(0) + b1.charAt(1))));
            }
            else
            {
                a.add((Character.getNumericValue(b1.charAt(0))));
            }
        }
        //convert to binary
        ArrayList<Integer> binary = new ArrayList<>();
        String sBinary;
        for (int x : a)
        {
            sBinary = Integer.toBinaryString(x); //gets last 4 digits of binary
            if (sBinary.length() == 1)
                binary.add(Integer.parseInt(sBinary.substring(0,1)));
            else if (sBinary.length() == 2)
                binary.add(Integer.parseInt(sBinary.substring(0,2)));     
            else if (sBinary.length() == 3)
                binary.add(Integer.parseInt(sBinary.substring(0,3)));  
            else
                binary.add(Integer.parseInt(sBinary.substring(0,4))); 
        }
        //check for 1 digit differences
        String result = "";
        ArrayList<String> extended = new ArrayList<>();
        for (int y = 0; y < binary.size(); y++)
        {
            for (int z = 1 + y; z < binary.size(); z++)
            {
                if (binary.get(y).equals(binary.get(z)))
                    break;
                else if (Math.abs(binary.get(y) - binary.get(z)) == 1)
                {
                    result += simplify(binary.get(y), binary.get(z), false);
                    extended.add(extendSimplify(binary.get(y), binary.get(z), false));
                }
                else if (Math.abs((int)(binary.get(y)/10) - (int)(binary.get(z)/10)) == 1 
                        && Math.abs(binary.get(y) - binary.get(z)) == 0)
                {
                    result += simplify(binary.get(y), binary.get(z), false);
                    extended.add(extendSimplify(binary.get(y), binary.get(z), false));
                }
                else if (Math.abs((int)(binary.get(y)/100) - (int)(binary.get(z)/100)) == 1
                        && Math.abs(((int)((int)binary.get(y)/10)%10) - ((int)((int)binary.get(z)/10)%10)) == 0
                        && Math.abs(((binary.get(y)%10) - (binary.get(z)%10))) == 0)
                {
                    result += simplify(binary.get(y), binary.get(z), false);
                    extended.add(extendSimplify(binary.get(y), binary.get(z), false));
                }
                else if (Math.abs((binary.get(y)/1000) - (binary.get(z)/1000)) == 1 
                        && Math.abs((int)((binary.get(y)/100)%10) - (int)((binary.get(z)/100)%10)) == 0
                        && Math.abs(((int)((int)binary.get(y)/10)%10) - ((int)((int)binary.get(z)/10)%10)) == 0
                        && Math.abs(((binary.get(y)%10) - (binary.get(z)%10))) == 0)
                {
                    result += simplify(binary.get(y), binary.get(z), false);
                    extended.add(extendSimplify(binary.get(y), binary.get(z), false));
                }
            }
        }
        ArrayList<String> g = extendSort15(extended);
        String result2 = "";
        for (String p : g)
        {
            if (p.length() == 1)
                p = "00" + p;
            else if (p.length() == 2)
                p = "0" + p;
            switch (p.substring(0,1)) {
                case "1":
                    result2 += "A";
                    break;
                case "0":
                    result2 += "a";
                    break;
            }
            switch (p.substring(1,2)) {
                case "1":
                    result2 += "B";
                    break;
                case "0":
                    result2 += "b";
                    break;
            }
            switch (p.substring(2,3)) {
                case "1":
                    result2 += "C";
                    break;
                case "0":
                    result2 += "c";
                    break;
            }
            switch (p.substring(3)) {
                case "1":
                    result2 += "D";
                    break;
                case "0":
                    result2 += "d";
                    break;
            }
            result2 += "+";
        }
        if (result.length() > 0)
            result = result.substring(0, result.length() - 1); //take off the extra +
        if (result2.length() > 0)
            result2 = result2.substring(0, result2.length() - 1); //take off the extra +
        
        return result2;
    }
    public static String simplify(int binary, int binary2, boolean digit3Or4)
    {
        String value = "";
        if (digit3Or4)
        {
            if (binary / 100 == 1 && binary2 / 100 == 1)
                value += "A";
            else if (binary / 100 == 0 && binary2 / 100 == 0)
                value += "a";
            if ((binary % 100)/10 == 1 && (binary2 % 100)/10 == 1)
                value += "B";
            else if ((binary % 100)/10 == 0 && (binary2 % 100)/10 == 0)
                value += "b";
            if (binary % 10 == 1 && binary2 % 10 == 1)
                value += "C";
            else if (binary % 10 == 0 && binary2 % 10 == 0)
                value += "c";
        }
        else
        {
            if (binary / 1000 == 1 && binary2 / 1000 == 1)
                value += "A";
            else if (binary / 1000 == 0 && binary2 / 1000 == 0)
                value += "a";
            if ((binary % 1000)/100 == 1 && (binary2 % 1000)/100 == 1)
                value += "B";
            else if ((binary % 1000)/100 == 0 && (binary2 % 1000)/100 == 0)
                value += "b";
            if (binary % 100 == 1 && binary2 % 100 == 1)
                value += "C";
            else if ((binary % 100)/10 == 0 && (binary2 % 100)/10 == 0)
                value += "c";  
            if (binary % 10 == 1 && binary2 % 10 == 1)
                value += "D";
            else if (binary % 10 == 0 && binary2 % 10 == 0)
                value += "d";  
        }
        
        return value + "+";
    }
    public static String extendSimplify(int binary, int binary2, boolean digit3Or4)
    {
        String extend = "";
        if (digit3Or4)
        {
            if ((int)(binary / 100) == 1 && (int)(binary2 / 100) == 1)
                extend += "1";
            else if ((int)(binary / 100) == 0 && (int)(binary2 / 100) == 0)
                extend += "0";
            else
                extend += "x"; 
            if ((int)((binary % 100)/10) == 1 && (int)((binary2 % 100)/10) == 1)
                extend += "1";
            else if ((int)((binary % 100)/10) == 0 && (int)((binary2 % 100)/10) == 0)
                extend += "0";
            else
                extend += "x"; 
            if (binary % 10 == 1 && binary2 % 10 == 1)
                extend += "1";
            else if (binary % 10 == 0 && binary2 % 10 == 0)
                extend += "0";
            else
                extend += "x";       
        }
        else
        {
            if (binary / 1000 == 1 && binary2 / 1000 == 1)
                extend += "1";
            else if (binary / 1000 == 0 && binary2 / 1000 == 0)
                extend += "0";
            if (binary / 100 == 1 && binary2 / 100 == 1)
                extend += "1";
            else if (binary / 100 == 0 && binary2 / 100 == 0)
                extend += "0";
            if ((binary % 100)/10 == 1 && (binary2 % 100)/10 == 1)
                extend += "1";
            else if ((binary % 100)/10 == 0 && (binary2 % 100)/10 == 0)
                extend += "0";
            if (binary % 10 == 1 && binary2 % 10 == 1)
                extend += "1";
            else if (binary % 10 == 0 && binary2 % 10 == 0)
                extend += "0";
            else
                extend += "x";
        }
        return extend;
    }
    public static ArrayList<String> extendSort(ArrayList<String> s)
    {
        if (s.size() > 1)
        {
            for (int y = 0; y < s.size(); y++)
            {
                for (int z = 1 + y; z < s.size(); z++)
                {
                    if (s.get(y).length() < s.get(z).length() - 1)
                        s.set(y, "00" + s.get(y));
                    else if (s.get(y).length() < s.get(z).length())
                        s.set(y, "0" + s.get(y));
                    else if (s.get(y).length() - 1 > s.get(z).length())
                        s.set(z, "00" + s.get(z));
                    else if (s.get(y).length() > s.get(z).length())
                        s.set(z, "0" + s.get(z));

                    if (s.get(y).compareTo(s.get(z)) == 0)
                    {
                        s.remove(z);
                    }
                    else if (s.get(y).substring(s.get(y).length()).compareTo(s.get(z).substring(s.get(z).length())) != 0
                            && s.get(y).substring(0, s.get(y).length()).compareTo(s.get(z).substring(0, s.get(z).length())) == 0)
                    {
                        s.set(y, s.get(y).substring(0, s.get(y).length()) + "x");
                        s.remove(z);
                    }
                    else if (s.get(y).substring(1,2).compareTo(s.get(z).substring(1,2)) != 0
                            && s.get(y).substring(0, 1).compareTo(s.get(z).substring(0, 1)) == 0
                            && s.get(y).substring(2).compareTo(s.get(z).substring(2)) == 0)
                    {
                        s.set(y, s.get(y).substring(0, 1) + "x" + s.get(y).substring(2));
                        s.remove(z);
                    }
                    else if (s.get(y).substring(0,1).compareTo(s.get(z).substring(0,1)) != 0
                            && s.get(y).substring(1, s.get(y).length()).compareTo(s.get(z).substring(1, s.get(z).length())) == 0)
                    {
                        s.set(y, "x" + s.get(y).substring(1, s.get(y).length()));
                        s.remove(z);
                    }
                }
            }
            return s;
        }
        return s;  
    }
    public static ArrayList<String> extendSort15(ArrayList<String> s)
    {
        if (s.size() > 1)
        {
            for (int y = 0; y < s.size(); y++)
            {
                for (int z = 1 + y; z < s.size(); z++)
                {
                    if (s.get(y).length() < s.get(z).length() - 2)
                         s.set(y, "000" + s.get(y));
                    else if (s.get(y).length() < s.get(z).length() - 1)
                        s.set(y, "00" + s.get(y));
                    else if (s.get(y).length() < s.get(z).length())
                        s.set(y, "0" + s.get(y));
                    else if (s.get(y).length() - 2 > s.get(z).length())
                        s.set(z, "000" + s.get(z));
                    else if (s.get(y).length() - 1 > s.get(z).length())
                        s.set(z, "00" + s.get(z));
                    else if (s.get(y).length() > s.get(z).length())
                        s.set(z, "0" + s.get(z));

                    if (s.get(y).compareTo(s.get(z)) == 0)
                    {
                        s.remove(z);
                    }
                    
                    else if (s.get(y).substring(s.get(y).length()).compareTo(s.get(z).substring(s.get(z).length())) != 0
                            && s.get(y).substring(0, s.get(y).length()).compareTo(s.get(z).substring(0, s.get(z).length())) == 0)
                    {
                        s.set(y, s.get(y).substring(0, s.get(y).length()) + "x");
                        s.remove(z);
                    }
                    else if (s.get(y).substring(2,3).compareTo(s.get(z).substring(2,3)) != 0
                            && s.get(y).substring(0, 2).compareTo(s.get(z).substring(0,2)) == 0
                            && s.get(y).substring(3).compareTo(s.get(z).substring(3)) == 0)
                    {
                        s.set(y, s.get(y).substring(0,2) + "x" + s.get(y).substring(3));
                        s.remove(z);
                    }
                    else if (s.get(y).substring(1,2).compareTo(s.get(z).substring(1,2)) != 0
                            && s.get(y).substring(0, 1).compareTo(s.get(z).substring(0, 1)) == 0
                            && s.get(y).substring(2).compareTo(s.get(z).substring(2)) == 0)
                    {
                        s.set(y, s.get(y).substring(0, 1) + "x" + s.get(y).substring(2));
                        s.remove(z);
                    }
                    
                    else if (s.get(y).substring(0,1).compareTo(s.get(z).substring(0,1)) != 0
                            && s.get(y).substring(1, s.get(y).length()).compareTo(s.get(z).substring(1, s.get(z).length())) == 0)
                    {
                        s.set(y, "x" + s.get(y).substring(1, s.get(y).length()));
                        s.remove(z);
                    }  
                }
            }
            return s;
        }
        return s;  
    }
}
