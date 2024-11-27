package codingQuestion;


	import java.util.Scanner;

	public class Factorial {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        System.out.println("Factorial of " + number + " is: " + factorial(number));
	        
	        scanner.close();
	    }

	    public static long factorial(int n) {
	        if (n == 0) return 1;
	        return n * factorial(n - 1);
	    }
	}

