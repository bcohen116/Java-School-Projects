/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p19.pkg4;

/**
 *
 * @author 151146
 */
public class P194 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String[] c = {"dog","zzz","vvv","aaa","kkk","apple","bagel","fred"};

//        c[0] = "apple";
//        c[1] = "chad";
//        c[2] = "ben";
//        c[3] = "cheese";
//        c[4] = "steve";
//        c[5] = "whoohoo";
//        c[6] = "letter";
//        c[7] = "j";
//        c[8] = "ten";
//        c[9] = "z";
        
        MergeSorter m = new MergeSorter(c);
        m.sort();
        for (String x : c)
            System.out.println(x);
    }
}
