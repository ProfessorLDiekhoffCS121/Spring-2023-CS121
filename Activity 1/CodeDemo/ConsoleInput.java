import java.util.Scanner;

//********************************
// Assignment: String,Math Methods, Console Input/Output
// Name: L.Diekhoff
// CS121
// Date 08/22/2022
// Modified Date: 01/17/23 
//*******************************
// Documentation:
// This is the String Demo used in the assignment pdf(String, Math Methods & Console Input/Output) that is on canvas. 
//
// How to run the program: press the run button -->  Run ConsoleInput.main()
//*******************************
// ConsoleInput::main()
// This uses the scanner class to take information from the user. 
// Then, the user input will be assigned to the declared variables.
// Next, the program has methods used in java to make alterations to the content in the variables.
// Finally, prints out the results formatted and closes the Scanner object console (clears up space used by the program).
// ------------------------------
// Methods used:
// -------------
// 1) nextLine()
// 2) nextInt()
// 3) nextDouble()
// 4) charAt()
// 5) .close()
// 6) .next()
// ------------------------------
//*******************************
public class ConsoleInput
{

	public static void main(String[] args)
	{
		// This creates an instance of the scanner class. 
		// What is an instance in Java? 
		// An object that is created using a class. 
		// In otherwords, console is an object that is created from the Scanner class.
		// console is an instance of the Scanner class.
		Scanner console = new Scanner(System.in);
		
		
		/* Uses nextLine() method --> console.nextLine() 
		*  The nextLine() method of java.util.Scanner class advances this scanner past the current line 
		*  and returns the input that was skipped.
		*  Example below: console.nextLine()
		*  Source: Book or GeekforGeeks or any other reputable resource online --> 
		*  Link: https://www.geeksforgeeks.org/scanner-nextline-method-in-java-with-examples/
		*/
		System.out.println("Please enter your first name:");
		String firstName = console.nextLine();
		System.out.println("Please enter your last name:");
		String lastName = console.nextLine();
		
		/*
		System.out.println("Enter a number between 1 and 10:");
		int number = console.nextInt();
		System.out.println("What is pi?");
		double pi = console.nextDouble();
		System.out.println("What is your first initial?");
		char initial = console.next().charAt(0);
		
		System.out.printf("%s\n%s\n%d\n%.2f\n%c", 
				firstName, lastName, number, pi, initial);
		*/
		
		/* USES  -------------- nextInt, nextDouble,charAt and next ---------------
		*
		*  Uses nextInt() method --> console.nextInt() 
		*  The nextInt() method of java.util.Scanner class scans the next token of the input as a Int(integer). 
		*  Example below: console.nextInt()
		*  Source: Book or GeekforGeeks or any other reputable resource online --> 
		*  Link: https://www.geeksforgeeks.org/scanner-nextint-method-in-java-with-examples/
		* -----------------------------------------------------------------------------------------------------------
		*  Uses nextDouble() method --> console.nextDouble() 
		*  The nextDouble() method of java.util.Scanner class scans the next token of the input as a Double(double).
		*  Example below: console.nextDouble()
		*  Source: Book or GeekforGeeks or any other reputable resource online --> 
		*  Link: https://www.geeksforgeeks.org/scanner-nextdouble-method-in-java-with-examples/
		* -----------------------------------------------------------------------------------------------------------
		*  
		*  Uses charAt() method --> String.charAt(index)
		*  The charAt() method returns the character at the specified index in a string.
		*  Remember index 0 would be the first character , what would the 2nd character's index be?
		*  The 2nd character's index is 1.
		*  Source: Book or W3 or any other reputable resource online --> 
		*  Link: https://www.w3schools.com/java/ref_string_charat.asp
		* -----------------------------------------------------------------------------------------------------------
		*
		*  Uses next() method --> console.next() 
		*  The next() method of java.util.Scanner class scans the next token from the scanner which is being used. 
		*  Example below: console.next()
		*  Source: Book or JavaTPoint or any other reputable resource online --> 
		*  Link: https://www.javatpoint.com/post/java-scanner-next-method
		*/
		
		System.out.println("Please enter your age: ");
		int age = console.nextInt();
		System.out.println("Please enter your gpa: ");
		Double gpa = console.nextDouble();
		System.out.println("Please enter your grade: ");
		char grade = console.next().charAt(0);
		
		
		System.out.printf("name: %s %s\nage: %d\ngpa: %.1f\ngrade: %c\n", 
				firstName, lastName, age, gpa, grade);
		
		/* ------------------------------ .close() --------------------------------
		*  Uses close() method --> console.close() 
		*  The close() method is used to terminate the current Scanner instance which in this case is called console. 
		*  Example below: console.close()
		*  Note: 
		*  Closing the Scanner allows Java to reclaim the Scanner's memory.
		*  Source: Book or Geek for Geek or any other reputable resource online --> 
		*  Link: https://www.geeksforgeeks.org/scanner-close-method-in-java-with-examples/
		*/
		console.close();
	}

}



