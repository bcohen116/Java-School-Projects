/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acsl.round.pkg2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Ben
 */
public class ACSLRound2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList input = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Expression:");
        input.add(s.nextLine());
        ArrayList f = new ArrayList<String>();
        String temp = (String) input.get(0);
        f.add(temp.substring(1, temp.indexOf(" (")));
        temp = temp.substring(temp.indexOf(" ("));
        while(temp.contains(" ("))
        {
            f.add(temp.substring(temp.indexOf(" (") + 2, temp.indexOf(")")));
            temp = temp.substring(temp.indexOf(")") + 1);
        }
        
        for (int x = 1; x < 6; x++)
        {
            System.out.println("Enter command #" + x);
            input.add(s.nextLine());
            System.out.println("Result: " + command((String) input.get(x), f));
        }
    }
    public static ArrayList command(String a, ArrayList<String> e)
    {
        ArrayList<String> b = e;
        int i;
        int i2;
        String i3;
        String i4;
        String y = a;
        if (a.contains("SORT"))
        {
            y = y.substring(5);
            StringTokenizer tk = new StringTokenizer(y);
            i = Integer.parseInt(tk.nextToken());
            i2 = Integer.parseInt(y.substring(y.lastIndexOf(' ') + 1));

            ArrayList temp = new ArrayList<String>();
            int count[] = new int[i2-i];
            for (int c = i; c < i2; c++)
            {
                temp.add(e.get(c));
            }
            for (int x = 0; x < temp.size(); x++)
            {
                for (int z = 0; z < temp.size(); z++)
                {
                    if (e.get(x).compareToIgnoreCase((String) temp.get(z)) >= 0)
                    {
                        count[x]++;
                    }
                }
                if (count[x] == temp.size() - x)
                {
                    b.set(x, e.get(x));
                }
            }
            return b;
        }
        else if (a.contains("REVERSE"))
        {
            y = y.substring(8);
            StringTokenizer tk = new StringTokenizer(y);
            i = Integer.parseInt(tk.nextToken());
            int i6 = Integer.parseInt(tk.nextToken());
            int i7 = i6;
            int i8 = i6 - i;
            while (i8/2 > 0)
            {
                String i9 = e.get(i);
                String i10 = e.get(i6);
                b.set(i, i10);
                b.set(i6, i9);
                i6 -= 1;
                i += 1;
                i8 -= 1;
            }

            return b;
        }
        else if (a.contains("COUNT"))
        {
            ArrayList d = new ArrayList(); 
            d.add(a.length() + 1);
            return d;
        }
        else if (a.contains("REMOVE"))
        {
            y = y.substring(7);
            StringTokenizer tk = new StringTokenizer(y);
            i = Integer.parseInt(tk.nextToken());
            i2 = Integer.parseInt(y.substring(y.indexOf(' ') + 1));

            b.remove(i);
            b.remove(i2);

            return b;
        }
        //else if (a.contains("MAXIMUM"))
        else
        {
            int count[] = new int [b.size()];
            for (int z = 0; z < b.size(); z++)
            {
                String temp = b.get(z);
                StringTokenizer tk = new StringTokenizer(temp);
                while(tk.hasMoreElements())
                {
                    temp = tk.nextToken();
                    count[z]++;
                }
            }
            int max = 0;
            int maxi = 0;
            for (int r = 0; r < b.size(); r++)
            {
                int t = count[r];
                max = Math.max(t, max);
                if (max == t)
                {
                    maxi = r;
                }
            }
            ArrayList g = new ArrayList();
            g.add(b.get(maxi));
            return g;
        }
        
    }
    
}
