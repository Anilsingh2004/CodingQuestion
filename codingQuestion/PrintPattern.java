package codingQuestion;


	public class PrintPattern {
	    public static void printPattern(int n) {
	        for (int i = 1; i <= n; i++) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        printPattern(7);
	    }
	}

