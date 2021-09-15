package com.bridgelabz;

import java.util.Scanner;
public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cartesian Co-ordinates for Line 1 below : ");
        System.out.print("Enter the value of x1 : ");
        int x1 = sc.nextInt();
        System.out.print("Enter the value of x2 : ");
        int x2 = sc.nextInt();
        System.out.print("Enter the value of y1 : ");
        int y1 = sc.nextInt();
        System.out.print("Enter the value of y2 : ");
        int y2 = sc.nextInt();
        double line1=(Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2));
        System.out.println("Enter Cartesian Co-ordinates for Line 2 below : ");
        System.out.print("Enter the value of x3 : ");
        int x3 = sc.nextInt();
        System.out.print("Enter the value of x4 : ");
        int x4 = sc.nextInt();
        System.out.print("Enter the value of y3 : ");
        int y3 = sc.nextInt();
        System.out.print("Enter the value of y4 : ");
        int y4 = sc.nextInt();
        double line2 =(Math.sqrt(Math.pow((x4-x3),2))+Math.pow((y4-y3) ,2));
        System.out.println(); // Used for new line
        System.out.println("Length of the line 1 is : "+(Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2)));
        System.out.println("Length of the line 2 is : "+(Math.sqrt(Math.pow((x4-x3),2))+Math.pow((y4-y3) ,2)));

        System.out.println(); // Used for new line or for empty line
        if (line1 == line2)
        {
            System.out.println("Both the lines are equal in length.");
        }
        else {
            System.out.println("Both lines are unequal in length.");
        }
    }
}




