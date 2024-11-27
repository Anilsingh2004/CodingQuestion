package codingQuestion;

public class LargestElementss {
	
	    public static int findLargest(int[] arr) {
	        int largest = arr[0];
	        for (int num : arr) {
	            if (num > largest) {
	                largest = num;
	            }
	        }
	        return largest;
	    }

	    public static void main(String[] args) {
	        int[] array = {3, 1, 4, 1, 5, 9};
	        System.out.println("Largest element: " + findLargest(array));
	    }
	}

