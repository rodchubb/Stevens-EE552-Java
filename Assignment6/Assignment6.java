/*
* Class: EE-552-WS Fall 2020
* Author/Student: Roderick Chubb
* Assignment: Week 6, pg.203 Exercise 5.47

* (Business: check ISBN-13)ISBN-13 is a new standard for identifying books. It
* uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a
* checksum, which is calculated from the other digits using the following
* formula:

* 10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10

* If the checksum is 10, replace it with 0. Your program should read the input
* as a string. Display "invalid input" if the input is invalid. Here are sample
* runs:

* Terminal: Enter the first 12 digits of an ISBN-13 as a string: 978013213080
* Output: The ISBN-13 number is 9780132130806

* Terminal: Enter the first 12 digits of an ISBN-13 as a string: 978013213079
* Output: The ISBN-13 number is 9780132130790

* Terminal: Enter the first 12 digits of an ISBN-13 as a string: 97801320
* Output: 97801320 is an invalid input
*/

// Imports
import java.util.Arrays;
import java.util.Scanner;

// "Assignment6" Class Declaration
class Assignment6 {

    public static void main(String[] args) {
    // Program "Header"
    System.out.println("*********************************************");
    System.out.println("*********************************************");
    System.out.println("****************** ISBN-13 ******************");
    System.out.println("***************** CHECKSUM ******************");
    System.out.println("**************** CALCULATOR *****************");
    System.out.println("*********************************************");
    System.out.println("*********************************************");
    System.out.println("*********************************************");

    Scanner userInput = new Scanner(System.in);
	// PROMPT the user for input
    System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
	String twelveDigits = userInput.nextLine();
	
	// If twelve digits were not supplied by the user we cannot calculate
	// the checksum. Exiting!!!
	if (twelveDigits.length() != 12) {
		System.out.println(twelveDigits + " is an invalid input");
		System.exit(0);
	}
	
	int[] twelveDigitsArray = new int[twelveDigits.length()];
	
	for (int i = 0; i < twelveDigits.length(); i++) {
		int stringElementInt = Character.getNumericValue(twelveDigits.charAt(i));
		twelveDigitsArray[i] = stringElementInt;
		}
	
	int d1 = twelveDigitsArray[0];
	int d2 = twelveDigitsArray[1];
	int d3 = twelveDigitsArray[2];
	int d4 = twelveDigitsArray[3];
	int d5 = twelveDigitsArray[4];
	int d6 = twelveDigitsArray[5];
	int d7 = twelveDigitsArray[6];
	int d8 = twelveDigitsArray[7];
	int d9 = twelveDigitsArray[8];
	int d10 = twelveDigitsArray[9];
	int d11 = twelveDigitsArray[10];
	int d12 = twelveDigitsArray[11];

	// Formula: 10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
	int checksum = 10 - (d1 + (d2*3) + d3 + (d4*3) + d5 + (d6*3) + d7 + (d8*3) + d9 + (d10*3) + d11 + (d12*3)) % 10;
	
	if (checksum >= 10) {
		checksum = 0;
	}

	String checksumString = String.valueOf(checksum);
	
	//OUTPUT ISBN-13 number to user
	System.out.println("The ISBN-13 number is " + twelveDigits + checksumString);

    } // Closes main function

} // Closes Assignment6 class