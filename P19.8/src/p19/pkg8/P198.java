/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p19.pkg8;

/**
 *
 * @author 151146
 */
public class P198 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] i = {10,20,30,40,50,60,70,80,90,100};
        BinarySearcher b = new BinarySearcher(i);
        System.out.println("The index of the number is: " + b.search(200));
    }
}
