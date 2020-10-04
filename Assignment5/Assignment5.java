/*
* Class: EE-552-WS Fall 2020
* Assignment: Week 5, Exercise 3.1 Quadratic Equation
* Author/Student: Roderick Chubb
*/

// Imports
import java.math.*;
import java.util.Scanner;

// "Assignment5" Class Declaration
class Assignment5 {

    public static void main(String[] args) {
        // Program "Header"
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        System.out.println("**********QUADRATIC EQUATION SOLVER**********");
        System.out.println("*********************************************");
        System.out.println("******* Please Remember: the Standard *******");
        System.out.println("*** form of the equation is ax^2 + bx = c ***");
        System.out.println("*********************************************");
        System.out.println("*********************************************");

        // Create the Scanner
        Scanner userInput = new Scanner(System.in);
        
        // Get the coefficients
        // Coefficient A
        System.out.println("Please input Coefficient A:");
        double coefficientA = userInput.nextDouble();
        // Coefficient B
        System.out.println("Please input Coefficient B:");
        double coefficientB = userInput.nextDouble();
        // Coefficient C
        System.out.println("Please input Coefficient C:");
        double coefficientC = userInput.nextDouble();

        // Discriminant
        // Formula is b^2 - 4ac
        double discriminant = Math.pow(coefficientB, 2.0) - 4.0 * coefficientA * coefficientC;

        if (discriminant > 0.0) {
            double root1 = (-coefficientB + Math.pow(discriminant, 0.5)) / (2.0 * coefficientA);
            double root2 = (-coefficientB - Math.pow(discriminant, 0.5)) / (2.0 * coefficientA);
            System.out.println("\n" + "The roots are " + "Root 1:" + root1 + " and " + "Root 2:" + root2 + "\n");
        } else if (discriminant == 0.0) {
            double root1 = -coefficientB / (2.0 * coefficientA);
            System.out.println("\n" + "The roots are equal. The root is " + root1 + "\n");
        } else {
            double real = -coefficientB / (2.0 * coefficientA);
            double imaginary = Math.pow(-discriminant, 0.5) / (2.0 * coefficientA);
            System.out.println("\n" + "The equation has no REAL roots.");
            System.out.format("The roots are Root 1:(" + real + " - j" + imaginary + ") and Root 2:(" + real + " + j" + imaginary + ")" + "\n");
        } // Closes if-else block

    } // Closes main function

} // Closes Assignment5 class