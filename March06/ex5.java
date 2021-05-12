
//Amstrong number 
package PadmaGandla;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int num,onum,remainder,n=0;
		float res = 0;
		System.out.println("Enter a number");
		num=sc.nextInt();
		onum = num;
	
		for (onum = num ; onum != 0;n++ ) {
			onum /=10;	
		}
		
		for (onum = num; onum != 0; onum /= 10) {
		       remainder = onum % 10;

		      // store the sum of the power of individual digits in result
		      res += Math.pow(remainder, n);
		   }
	
		  if ((int)res == num)
			    System.out.println(num+" is a Amstrong  ");
			   else
				   System.out.println(num+" is a NOT Amstrong  ");
		
		
	}
	
	
}
