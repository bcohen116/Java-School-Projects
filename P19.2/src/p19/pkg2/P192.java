/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p19.pkg2;

/**
 *
 * @author 151146
 */
public class P192 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Coin[] c = new Coin[10];

        c[0] = new Coin(0.25, "Quarter");
        c[1] = new Coin(0.25, "Quarter");
        c[2] = new Coin(0.10, "Dime");
        c[3] = new Coin(1., "Dollar");
        c[4] = new Coin(0.01, "Penny");
        c[5] = new Coin(0.01, "Penny");
        c[6] = new Coin(0.05, "Nickel");
        c[7] = new Coin(2.0, "Susan B");
        c[8] = new Coin(0.50, "Half Dollar");
        c[9] = new Coin(0.25, "Quarter");
        
        SelectionSorter s = new SelectionSorter(c);
        s.sort();
        for (Coin x : c)
            System.out.println("" + x.getValue() + " " + x.getName());
    }
}
