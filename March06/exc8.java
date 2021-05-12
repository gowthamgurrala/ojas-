package PadmaGandla;

import java.util.Scanner;

public class exc8 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int t1 = 0, t2 = 1, nextTerm = 0, n;
		System.out.println("Enter a postive no");
		n = sc.nextInt();
		nextTerm = t1 + t2;
		while (nextTerm <= n) {
	       System.out.print( " "+ nextTerm);
	        t1 = t2;
	        t2 = nextTerm;
	        nextTerm = t1 + t2;
	    }
	}
}
