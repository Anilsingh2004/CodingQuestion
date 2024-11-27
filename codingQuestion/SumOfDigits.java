package codingQuestion;

	import java.util.Scanner;

	public class SumOfDigits {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        
	        System.out.println("Sum of digits: " + sumOfDigits(number));
	        
	        scanner.close();
	    }

	    public static int sumOfDigits(int num) {
	        int sum = 0;
	        while (num != 0) {
	            sum += num % 10;
	            num /= 10;
	        }
	        return sum;
	    }
	}

