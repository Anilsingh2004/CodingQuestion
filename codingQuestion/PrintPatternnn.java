package codingQuestion;

public class PrintPatternnn {
	   public static void main (String args[] ) {
	int n=4;
	
	// outer loops
    for (int i =n; i >= 1; i--) {
    	     //inner loops
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}


}


