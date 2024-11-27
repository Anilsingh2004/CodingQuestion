package codingQuestion;

	import java.util.Arrays;

	public class ReverseArray {
	    public static int[] reverseArray(int[] arr) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left < right) {
	            // Swap elements
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	            left++;
	            right--;
	        }
	        return arr;
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        System.out.println("Original Array: " + Arrays.toString(array));
	        int[] reversedArray = reverseArray(array);
	        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
	    }
	}

