package codingQuestion;

	public class SumEvenIndices {
	    public static int sumEvenIndices(int[] arr) {
	        int sum = 0;
	        // Loop through the array, adding elements at even indices
	        for (int i = 0; i < arr.length; i += 2) {
	            sum += arr[i];
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6, 7}; // Example array
	        int result = sumEvenIndices(array);
	        System.out.println("Sum of elements at even indices: " + result);
	    }
	}
