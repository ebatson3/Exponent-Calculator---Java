package ebatson3_lab05_q2; //Package name

import java.util.Scanner; //Getting scanner 

public class Main {
	public static double computePower(double base, int power) {
		double result = 1; //Naming and initializing variable
		if (power>0 ) {
			for (int i=0; i<power; i++)
				result = result*base; //Computing the result when power > 0
		}
		if (power<0) {
			power = Math.abs(power);
			for (int k=0; k<power; k++) {
				result = result*base; //Computing the result when power < 0
			}
			result = 1/result; //Computing the result when power < 0, since the exponent is negative this line is needed
		}
		if (power==0) 
			result = 1; //Computing the result when power > 0
		return result; //Returns the answer to the main method
	}
	public static void main(String[] xyz) {
		double base = 0; //Naming and initializing variable
		int exponent = 0; //Naming and initializing variable 
		Scanner input = new Scanner(System.in); //Naming scanner
		System.out.println("Please enter a real number base: "); //Asks for the user to input a variable
		base = input.nextDouble(); //Sets the base variable to the user input
		System.out.println("Please enter an integer number exponent: "); //Asks for the user to input a variable
	    exponent = input.nextInt(); //Sets the exponent variable to the user input
	    System.out.println("The result is: " + computePower(base,exponent)); //This line displays the result
	    System.out.println("I am your lord of darkness");//Just because I felt like it
	    input.close(); //End of program, closing scanner
	}
} 
