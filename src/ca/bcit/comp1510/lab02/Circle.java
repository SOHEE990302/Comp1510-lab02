package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Circle.
 * 
 * @author SoheeHwang
 * @version 2023
 * 
 */
public class Circle {
    /**
     * Decribe PI.
     */
    static final double PI = 3.14159;

    /**
     * about Circle.
     * 
     * @param args command-Line arguments (unused)
     */
    public static void main(String[] args) {

        double radius;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a radius value for the Circle.");

        radius = scan.nextDouble();

        double circumference = (2 * PI * radius);

        System.out.println("circumference of the circle: " + circumference);

        double area = (PI * radius * radius);

        System.out.println("area of the circle: " + area);

        double doubleRadius = (radius * 2);

        double doubleccf = (doubleRadius * 2 * PI);
        double doublearea = (PI * doubleRadius * doubleRadius);

        System.out.println("how many times the area and circumference increase "
                            + "when the radius doubleccf" 
                            + doubleccf / circumference);
        System.out.println("how many times the area and area increase" 
                            + "when the raidus deouble area"
                            + doublearea / area);
        scan.close();
    }

}
