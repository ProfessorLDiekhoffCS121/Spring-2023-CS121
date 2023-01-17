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
// How to run the program: press the run button -->  Run StringDemo.main()
//*******************************
// StringDemo::main()
// This assigns data to variables and uses methods in java to make alterations to the content in the variables.
// Then, prints out the results formatted.
// ------------------------------
// Methods used:
// -------------
// 1) replace()
// 2) length()
// 3) toUpperCase()
// 4) toLowerCase()
// 5) charAt()
// 6) substring()
// ------------------------------
//*******************************
public class StringDemo
{

	public static void main(String[] args)
	
	{	//Variables	
		//Declared and Assigned
		
		String name = "John" + " " + "Doe";
		String firstName = "John";
		String lastName = "Doe";
		String fullName = String.format("%s %s", firstName, lastName);
		int age = 22;
		double gpa = 3.8;
		char grade = 'A';
		
		//PRINTING WITH FORMATTING 
		String info = String.format("name: %s\nage: %d\ngpa: %.1f\ngrade: %c\n", 
				fullName, age, gpa, grade);
				
		//-------------------- EXAMPLE OF OTHER WAYS TO PRINT ----------------------	
        //String formatting specifier --> Link: https://www.javatpoint.com/java-string-format		
		/*
		System.out.println(info);
		System.out.println();
		System.out.printf("name: %s\nage: %d\ngpa: %.1f\ngrade: %c\n", 
				fullName, age, gpa, grade);
		*/
		
		
		
		/* Uses replace() method --> String.replace()
		*  The replace() method searches a string for a specified character, and returns a new string where the specified
		*  character(s) are replaced.
		*  Source: Book or W3 or any other reputable resource online --> 
		*  Link: https://www.w3schools.com/java/ref_string_replace.asp
		*/
		
		// %s = data type:any type , Output: String value.
		System.out.printf("0. %s\n", name);
		System.out.printf("1. %s\n", name.replace("John", "Jane"));
		System.out.printf("2. %s\n", name); // it doesn't actually change the string--strings are immutable.
		
		name = name.replace("John", "Jane"); // this gives the string variable a new value
		System.out.printf("3. %s\n\n", name); // now it is a different value, not the original modified
		
		
		/* Uses length() method --> String.length()
		*  The length() method returns the number of characters present in the string.
		*  Source: Book or Geeks for Geeks or any other reputable resource online --> 
		*  Link: https://www.geeksforgeeks.org/length-vs-length-java/
		*
		*     -------------   length vs .length() -----------------
		*  string.length  -->  The length variable is applied to an array but not for string objects. 
		*  string.length()-->  The length () method is applied to string objects but not for arrays.
		*/
		System.out.printf("Number of characters: %d\n\n", name.length());
		
		
		
		/* Uses toUpperCase() method --> String.toUpperCase()
		*  Uses toLowerCase() method --> String.toLowerCase()
		*  The toUpperCase() method converts a string to upper case letters.
		*  The toLowerCase() method converts a string to lower case letters.
		*  Source: Book or W3 or any other reputable resource online --> 
		*  Link: https://www.w3schools.com/java/ref_string_touppercase.asp
		*/
		System.out.printf("%s\n", name.toUpperCase()); 
		System.out.printf("%s\n", name.toLowerCase()); 
		System.out.printf("%s\n\n", name); // no change in the original  
		
		// uses --> String.charAt(index)
		/* Uses charAt() method --> String.charAt()
		*  The charAt() method returns the character at the specified index in a string.
		*  Remember index 0 would be the first character , what would the 2nd character's index be?
		*  The 2nd character's index is 1.
		*  Source: Book or W3 or any other reputable resource online --> 
		*  Link: https://www.w3schools.com/java/ref_string_charat.asp
		*/
		System.out.printf("Initials: %s.%s.\n\n", name.charAt(0), name.charAt(5));
		
		
	
		/* Uses substring() method --> String.substring() --> (beginning index, ending index)
		*  The substring() method extracts a substring from the string and returns it.
		*  Example below: name.substring(0, 4)--> extracts substring from index 0 to 3.
		*  Source: Book or programiz or any other reputable resource online --> 
		*  Link: https://www.programiz.com/java-programming/library/string/substring
		*/
		System.out.printf("First name: %s\nLast name: %s\n\n", name.substring(0, 4), name.substring(5, 8));
				
	}
}

