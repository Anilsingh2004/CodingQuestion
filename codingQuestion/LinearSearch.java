package codingQuestion;
import java.util.Scanner;

public class LinearSearch {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input array size
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        
	        // Input array elements
	        int[] array = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }
	        
	        // Input the element to search for
	        System.out.print("Enter the element to search for: ");
	        int key = scanner.nextInt();
	        
	        // Perform linear search
	        int index = linearSearch(array, key);
	        
	        // Output result
	        if (index != -1) {
	            System.out.println("Element found at index: " + index);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	        
	        scanner.close();
	    }
	    
	    public static int linearSearch(int[] array, int key) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == key) {
	                return i; // Return the index if found
	            }
	        }
	        return -1; // Return -1 if not found
	    }
	}


