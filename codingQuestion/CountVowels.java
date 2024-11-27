package codingQuestion;


	import java.util.Scanner;

	public class CountVowels {
	    public static int countVowels(String str) {
	        int count = 0;
	        for (char c : str.toLowerCase().toCharArray()) {
	            if ("aeiou".indexOf(c) != -1) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();
	        int vowelCount = countVowels(str);
	        System.out.println("Number of vowels: " + vowelCount);
	        scanner.close();
	    }
	}

