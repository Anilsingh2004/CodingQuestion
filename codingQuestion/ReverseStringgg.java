package codingQuestion;

public class ReverseStringgg{

public static void main (String args[])
{
	StringBuilder sb = new StringBuilder ("Hello");
	for (int i=0; i<=sb.length()/2; i++) {
		int front=i;
		int back = sb. length ()-1-i; // 5-1-0=>4
		char frontchar =sb .charAt(front);
		char backchar = sb.charAt(back);
		sb .setCharAt(front, backchar);
		sb.setCharAt(back , frontchar);
	}
		System.out.println(sb)	;
		
}}
	

//	StringBuilder sb= new StringBuilder (  "Tony");
//	System.out.println(sb);
//
//
//	
//	
//// chat at index 0
//System.out.println( sb.charAt(0));
//
//
//}}
//
//

