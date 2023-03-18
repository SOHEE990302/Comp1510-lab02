package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Paint.
 * 
 * @author SoheeHwang
 * @version 2023
 * 
 */

public class Paint {
    /**
     * describe coverage number.
     */
    static final int COVERAGE = 400;

    /**
     * about Paint.
     * 
     * @param args command-Line arguments (unused)
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the length of the room in feet: ");
        double length = scan.nextInt();
        
        System.out.println("enter the width of the room in feet: ");
        double width = scan.nextInt();
        
        System.out.println("enter the height of the room in feet: ");
        double height = scan.nextInt();

        System.out.println("enter the number of coats");
        int coats = scan.nextInt();
        
        double surfaceArea = 2 * (width * height) + 2 * (length * height) 
                + (width + length);
        
        
        double coverageNeeded = surfaceArea * coats;
        System.out.println("The number of cans you need is" 
                            + Math.ceil((double) coverageNeeded / COVERAGE));
        scan.close();

    }

}
