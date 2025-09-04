package AddTwoNumbers; // project created in eclipse
import java.util.Scanner; // imported scanner class

public class AddTwoNumbers { // public class 'AddTwoNumbers' is created

	public static void main(String[] args) {// reads,runs & executes code
		Scanner input = new Scanner(System.in); //created an object 'input' from imported
		//scanner class, 'system.in' opens keyboard
		
		System.out.println("Adding two numbers, by taking user's input "); // display text
		
		System.out.print("Input number: "); // display text
		double firstNum = input.nextDouble(); // reads users input from keyboard and assigns it 
		// to variable 'firstNum'the 'input.Double()' reads in the number with decimals or 
		// convert int values put in on the keyboard to double
		
		System.out.print("Input another number: "); // display text
		double secondNum = input.nextDouble();// reads users input from keyboard and assigns it 
		// to variable 'secondNum', the 'input.Double()' reads in the number with decimals or 
		// convert int values put in on the keyboard to double
		
		System.out.println(firstNum + " + " + secondNum); // display text
		
		input.close(); // close the scanner
		
		double result = firstNum + secondNum; // equation set to add numbers
		
		System.out.println("= " + result); // display result

	}

}

// Result:
//Input another number: 5
//5.0 + 5.0
//= 10.0
