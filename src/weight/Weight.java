/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weight;

/**
 *
 * @author John
 */
public class Weight 
{
    /** Weight conversion from kilograms to pounds
     * @param args the command line arguments
     * John, Gellert
     */
    
    public static void main(String[] args) 
    {
        // three variables declared to store the values 10, 50, 100
        float k10 = 10F, k50 = 50F, k100 = 100F;
        
        // convert one kilogram into pounds
        float oneKgInPounds = 2.20462F;
        
        // three variable declared to store the conversion values
        double k10P = oneKgInPounds * k10;
        double k50P = oneKgInPounds * k50;
        double k100P = oneKgInPounds * k100;
        
        // print the conversions
        System.out.println("10 kilograms converted into pounds is " + k10P);
        System.out.println("50 kilograms converted into pounds is " + k50P);
        System.out.println("100 kilograms converted into pounds is " + k100P);
        
    }
    
}
