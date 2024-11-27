package codingQuestion;

	
	import java.util.Scanner;

	public class ReverseString {
	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user for input
	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();
	        
	        // Call the method to reverse the string
	        String reversed = reverseString(input);
	        
	        // Display the reversed string
	        System.out.println("Reversed String: " + reversed);
	        
	        // Close the scanner
	        scanner.close();
	    }

	    // Method to reverse a string
	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder();
	        
	        // Loop through the string in reverse order
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }
	        
	        return reversed.toString();
	    }
	}

