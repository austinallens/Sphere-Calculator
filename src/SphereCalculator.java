/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 3.3
 * File Name: SphereCalculator.java
 */

//Takes the radius of a sphere and prints its volume, surface area, and radius

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SphereCalculator {
    public static void main(String[] args) {
        double r, v, pow, sa;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the radius of the sphere: ");
        r = scan.nextDouble();
        
        //Calculates Volume
        pow = Math.pow(r, 3);
        v = Math.PI * pow * 4/3;
        
        //Calculates Surface Area
        sa = 4 * Math.PI * Math.pow(r, 2);
                
        //Makes only 4 decimal places
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        
        System.out.println("The volume is  " + df.format(v) + 
                " and the surface area is " + df.format(sa) + 
                " and the radius is " + df.format(r) + ".");
        
    }
    
}
