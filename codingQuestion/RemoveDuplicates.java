package codingQuestion;

	import java.util.Arrays;
import java.util.LinkedHashSet;

	public class RemoveDuplicates {
	    public static int[] removeDuplicates(int[] arr) {
	        LinkedHashSet<Integer> set = new LinkedHashSet<>();
	        for (int num : arr) {
	            set.add(num);
	        }
	        int[] uniqueArr = new int[set.size()];
	        int i = 0;
	        for (int num : set) {
	            uniqueArr[i++] = num;
	        }
	        return uniqueArr;
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 2, 3, 4, 4, 5};
	        int[] uniqueArray = removeDuplicates(array);
	        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
	    }
	}

