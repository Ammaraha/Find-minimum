/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findminimum;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ahashmi
 */
public class Findminimum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator = new Random();
        for (int i=1; i<=6;i++)
        {
            System.out.println(generator.nextInt(6));
        }
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
     String Value;
             Value = input.next();
           System.out.println(Value);
    }
    
    public static String addString(int x, int y)
    {
        int product = x * y;
        return String.format("the product off %d", product);
    }
}
