package codingQuestion;

	import java.util.Scanner;

	public class LargestElement {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] array = new int[n];
	        
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }
	        
	        System.out.println("Largest element: " + findLargest(array));
	        
	        scanner.close();
	    }

	    public static int findLargest(int[] arr) {
	        int largest = arr[0];
	        for (int num : arr) {
	            if (num > largest) {
	                largest = num;
	            }
	        }
	        return largest;
	    }
	}

